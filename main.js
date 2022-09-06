const tarefas = {}
function TODO(msg){
    tarefas["FAZER: "+msg +" em "+TODO.caller.name] = true
}
function TODOS(){
    console.log("-------------------------------\nO QUE VOCÊ TEM QUE FAZER: \n\n")
    Object.entries(tarefas).forEach( t => console.log("*  "+t[0]) )
    console.log("\n\n")
}

const
    fs = require("fs"),
    Node = require('./compiler/node'),
    Text = require('./compiler/text'),
    Numeric = require('./compiler/numeric')

function analisar(codigo_fonte, arvore){
    const
        antlr4 = require('antlr4'),
        onixLexer = require('./onix/onixLexer'),
        onixParser = require('./onix/onixParser'),
        chars = new antlr4.InputStream(codigo_fonte),
        lexer = new onixLexer.onixLexer(chars),
        tokens = new antlr4.CommonTokenStream(lexer),
        parser = new onixParser.onixParser(tokens)
    parser.buildParseTrees = true

    if(arvore){
        escreve("arvore.el", parser.program().toStringTree(parser.ruleNames))
        return analisar(codigo_fonte,false)
    }else{
        return parser.program()
    }

}

const ler = nome => fs.readFileSync(nome).toString()
const escreve = (path, texto) => fs.writeFileSync(path,texto)

const tool = {

    isArray : (v) => v.constructor.name === "Array",

    indent(nivel){
        return " ".repeat(nivel)
    },
    toC(no, nivel){
        if(nivel == undefined)
            nivel = 0
        if(no.toC){
            return no.toC(nivel)
        }else{
            TODO("Implementar toC de "+no.constructor.name)
            return "?"
        }
    },
    toJS(no, nivel){
        if(nivel == undefined)
            nivel = 0

        if(no.toJS){
            return no.toJS(nivel)
        }else{
            TODO("Implementar toJS de "+no.constructor.name)
            return "?"
        }
    },
    toAST(no){
        if(no.toAST){
            return no.toAST()
        }else{
            TODO("Implementar toAST de "+no.constructor.name)
            return []
        }
    },
    bodyToAST(body){
        return body.map( c => tool.toAST(c))
    },
    validar(no){
        if(no.validate){
            return no.validate()
        }else{
            TODO("Implementar validate de "+no.constructor.name)
            return false
        }
    },

    // this is needed because some elements can be statements depending on what their appendages are
    // e.g: x.y() is a statement
    isStatement : no => {
        if(!no.isStatement)
            TODO("Talvez implementar isStatement de "+no.constructor.name+"?")
        if(typeof no.isStatement !== "function")
            throw "O isStatement de "+no.constructor.name+" deveria ser uma função"

        return (no.isStatement && no.isStatement())
    }
}

//
const
    F_TRUE = () => true,
    F_FALSE = () => false



function Program(){
    this.type = "program"
    this.records = [],
    this.functions= [],
    this.declarations= [], // provavelmente isso não existir aqui, sendo criado só na primeira passada do compilador.
    this.body = []
    
    return this
}

Program.prototype = {
    addChild(node){
        if(node.isFunctionDefinition){
            this.functions.push(node)
        }else{
            // Abstrair body pra fazer essa checagem automaticamente?
            if(tool.isArray(node)){
                console.log("Adicionando vários nós.")
                node.forEach( n => this.body.push(n) )
            }else{
                this.body.push(node)
            }
            
        }
    },
    toAST(){
        return { program : {
            records      : this.records     .map( c => tool.toAST(c)),
            functions    : this.functions   .map( c => tool.toAST(c)),
            declarations : this.declarations.map( c => tool.toAST(c)),
            body         : tool.bodyToAST( this.body)
        }}
    },
    toC(nivel){
        let output = "int main(){\n"
        this.body.forEach( c => {
            if(tool.isStatement(c))
                output += tool.toC(c, nivel+1) + ";\n"
        })
        output += "}\n"
        return output
    },
    toJS(nivel){
        // para cada função...
        let output = 
        this.functions.map( c=> tool.toJS(c) ).join("\n")

        output += "function main(){\n"
    
        this.body.forEach( c => {
            // JS não deixa fazer isso. Tem que filtrar.
            if(tool.isStatement(c))
                output += tool.toJS(c, nivel+1) + ";\n"
        })
    
        output += "}\n"
        output += "main()"

        return output
    }
}

/**
 * User Function definition.
 * function if return type is set.
 * sub      if return type is undefined.
 * method for type X if structType is X, otherwise it's a function in the specified program/library
 * @param {Argument[]} arguments 
 * @param {Type} returnType 
 * @param {Type} structType 
 * @returns 
 */
function UserFunction(name, arguments, returnType, structType){
    this.type = "function"
    this.name = name
    this.returnType = returnType
    this.structType = structType
    this.arguments = arguments || []
    this.declarations = []
    this.body = []

    return this
}

UserFunction.prototype = {
    isFunctionDefinition : true,

    toAST(){
        return { "function" : {
            name     : this.name,
            returns  : this.returnType ? tool.toAST(this.returnType) : "void",
            arguments: tool.bodyToAST(this.arguments),
            body     : tool.bodyToAST(this.body) 
        }}
    },
    toJS(nivel){
        // literalmente idêntico ao do program com algumas poucas diferenças.
        let output = "function "+this.name+"(){\n"
    
        this.body.forEach( c => {
            // JS não deixa fazer isso. Tem que filtrar.
            if(tool.isStatement(c))
                output += tool.toJS(c, nivel+1) + ";\n"
        })
        output += "}\n"

        return output
    },
    toC(nivel){
        return "void "+this.name+"(){ }\n"
    }
}


function While(condition){
    this.type = "while"
    this.condition = condition
    return this
}
While.prototype = {
    isStatement : F_TRUE,
    toAST(){
        return {while : {
                condition : tool.toAST(this.condition),
                body      : tool.bodyToAST(this.body)
        }}
    },
    toC(nivel){
        let i = tool.indent(nivel)
        let output = i+"while(" + tool.toC(this.condition) + "){\n"

        output += this.body.map( s=> tool.toC(s, nivel+1) + ";").join("\n")+"\n"
        output += i+"}"

        return output
    },
    toJS(nivel){
        let i = tool.indent(nivel)
        let output = i+"while(" + tool.toJS(this.condition) + "){\n"
        
        output += this.body.map( s=> tool.toJS(s, nivel+1) + ";").join("\n")+"\n"
        output += i+"}"

        return output
    }
}

function Repeat(condition){
    this.type = "repeat"
    this.condition = condition
    return this 
}

Repeat.prototype={
    isStatement : F_TRUE,
    toC (nivel){
        let i = tool.indent(nivel)
        let output = i+"do{\n"
        output += this.body.map( s => tool.toC(s, nivel+1) + ";").join("\n")+"\n"
        output += i + "}while(!("+tool.toC(this.condition)+"));"
        return output
    },
    toJS(nivel){
        let i = tool.indent(nivel)
        let output = i+"do{\n";
        output += this.body.map( s => tool.toJS(s, nivel+1) + ";").join("\n")+"\n"
        output += i + "}while(!("+ tool.toJS(this.condition) +"));"
        return output
    },
    toAST(){
        return {repeat :{
            until : tool.toAST(this.condition),
            body  : tool.bodyToAST(this.body)
        }}
    }
}

function If(condition){
    this.type = "if"
    this.condition = condition
    this.body = []
    return this
}
function ElseIf(condition){
    this.type = "elseif"
    this.condition = condition
    this.body = []
    return this
}
function Else(){
    this.type = "else"
    this.body = []
    return this
}

/**
 * Creates a if-elseif?-else? block
 * add a condition with addCondition. The first one is the main if, the next ones are elseifs.
 * add an else with addElse.
 */

function Branch(){
    this.type = "branch"
    return this
}

Branch.prototype = {
    isStatement : F_TRUE,
    /**
     * Adds a condition to this branch. If the branch is empty, adds an If. 
     * If it's not empty, adds an ElseIf.
     * To add an Else, use addElse.
     * @param {Expression} condition 
     * @returns an if or elseif node
     */
    addCondition(condition){
        // if vazio
        if(!this.chain){
            let _if = new If(condition)
            this.chain = []
            this.chain.push(_if)
            return _if
        }else{
            let elseif = new ElseIf(condition)
            this.chain.push(elseif)
            return elseif
        }
    },
    addElse(){
        if(!this.chain)
            throw "Não dá pra adicionar else em um if sem cabeça."

        let _else = new Else()
        this.chain.push(_else)
        return _else
    },
    toAST(){
        let r = {}
        let c = 0
        this.chain.forEach( el =>{
            switch(el.type){
                case "if" :
                    r["if"] = {
                        condition : tool.toAST(el.condition),
                        body      : tool.bodyToAST(el.body)
                    }
                break
                case "elseif" :
                    r["elseif_"+(c++)] = {
                        condition : tool.toAST(el.condition),
                        body      : tool.bodyToAST(el.body)
                    }
                break
                case "else" :
                    r["else"] = {
                        body : tool.bodyToAST(el.body)
                    }
                
            }
        })
        return { branch : r}        
    },
    toC(nivel){
        let output = ""
        let i = tool.indent(nivel)
        this.chain.forEach( el =>{
            switch(el.type){
                case "if" :{
                    output += i + "if(" + tool.toC(el.condition,0) + "){\n"
                } break
                case "elseif" :{
                    output += "else if(" + tool.toC(el.condition,0) + "){\n"
                } break
                case "else" : {
                    output += "else{\n"
                }
            }
            output += el.body.map( s => tool.toC(s, nivel+1) + ";").join("\n")+"\n"  + "}"
        })
        return output
    },
    toJS(nivel){
        let output = ""
        let i = tool.indent(nivel)
        this.chain.forEach( el =>{
            // output += i
            switch(el.type){
                case "if" :{
                    output += i+ "if(" + tool.toJS(el.condition, 0) + "){\n"
                } break
                case "elseif":{
                    output += "else if("+tool.toJS(el.condition,0) + "){\n"
                } break
                case "else":{
                    output += "else{\n"
                }
            }
            output += el.body.map( s => tool.toJS(s, nivel+1) + ";").join("\n")+"\n" + i + "}"
        })
        return output
    }
}


function Assignment(left, op, right){
    if(op === "é" || op === "É")
        op = "="

    this.type = "assignment"
    this.left = left
    this.right = right
    this.op = op
    return this
}
Assignment.prototype = {
    isStatement: F_TRUE,
    toAST() {
        return {
            assignment: {
                op: this.op,
                left: tool.toAST(this.left),
                right: tool.toAST(this.right)
            }
        }
    },
    toC(nivel){
        return tool.indent(nivel) + tool.toC(this.left) + this.op + tool.toC(this.right)
    },
    toJS(nivel){
        return tool.indent(nivel) + tool.toJS(this.left) + this.op + tool.toJS(this.right)
    }
}

function Binary(a, op, b){

    this.type = "binary"
    this.a = a
    this.op = op
    this.b = b
    return this
}
Binary.prototype = {
    toAST(){
        return { 
            binary :{
                a : tool.toAST(this.a),
                op: this.op,
                b : tool.toAST(this.b)
            }
        }
    },
    toC(nivel){
        return tool.toC(this.a) + this.op + tool.toC(this.b)
    },
    toJS(nivel){
        return tool.toJS(this.a) + this.op + tool.toJS(this.b)
    }
}

/**
 * Unary expression. Can be -x or !x
 * @param {Expression} a 
 * @param {Operator} op 
 * @returns 
 */
function Unary(a, op){
    this.type = "unary"
    this.a = a
    this.op = op
    return this
}
Unary.prototype = {
    toAST(){
        return {
            [this.op] : tool.toAST(this.a)
        }
    },
    toC(nivel){
        if(this.a.type == "parentheses")
            return this.op + tool.toC(this.a)
        else
            return this.op + "(" + tool.toC(this.a) +")"
    },
    toJS(nivel){
        if(this.a.type == "parentheses")
            return this.op + tool.toJS(this.a)
        else
            return this.op + "(" + tool.toC(this.a) + ")"
        
    }
}

function argList (expList){
    let list = []
    if(expList)
        if(expList.exp())
            list = expList.exp().map( e => visit.Expression(e ))
        
    return list
}

const visit = {
    Program(context){
        let program =new Program()

        context.block().forEach( block =>
            Node.addChild(program, visit.Block(block))    
        )

        return program
    },
    /*
        Primitivos.
    */
    Identifier : i => i.getText(),
    Number(i){
        // 123456  -> natural, pode ser de u8 a i32
        // 1234.56 -> racional, é sempre um f32
        let t = i.getText()
        TODO("Detectar o tamanho do inteiro para a VM ficar feliz.")
        for(let par of [
            [i.BIN(), () =>({
                type : "bin",
                val  : parseInt( t.substring(2), 2)
            })],
            [i.HEX(), () =>({
                type : "hex",
                val : parseInt( t.substring(2), 16)
            })],
            [i.INT(), () =>({
                type : "dec",
                val  : parseInt( t )
            })],
            [i.FLOAT(), () =>({
                type : "float",
                val  : parseFloat(t)
            })],
            [i.K_FALSE(), ()=>({
                type : "bool",
                val  : false
            })],
            [i.K_TRUE(), ()=>({
                type : "bool",
                val  : true
            })]
        ])
            if(par[0])
                return { ...par[1](), raw : t}
        
        TODO("Descobrir por que isso não virou número: "+i.getText())
        return undefined
    },
    String(s){
        s = s.getText()
        if(s){
            return s.substring(1, s.length-1)
        }else{
            TODO("Descobrir porque a string está vindo vazia se chegar aqui.")
            return undefined
        }
    },

    /*
        Blocos
    */
    Block(b){
        // desgraçado se enfia aqui.
        if(b.getText() === "<EOF>") return undefined
        
        if(b.statement()){
            return visit.Statement(b.statement())
        }
        if(b.sub_def()){
            return visit.UserSub(b.sub_def())
        }
        if(b.func_def()){
            return visit.UserFunction(b.func_def())
        }
    },
    /**
     * Extracts a UserFunction definition from a sub_def context.
     * @param {sub_def} sub def context 
     * @returns 
     */
    UserSub(sub){
        // sub_name não é do "tipo" identifier, mas isso é válido
        // porque sub_name implementa o método getTest(), que é o que eu preciso.

        let funcName = visit.Identifier(sub.sub_name())

        let ownerType
        if(sub.type()){
            ownerType = visit.Type(sub.type())
            console.log("Método de "+ownerType.name)
        }

        let userSub = new UserFunction(funcName)

        Node.addChild( userSub, visit.Body( sub.body() ))

        return userSub
    },
    UserFunction(sub){

    },
    /*
        Instruções
    */
    Statement(s){
/*
   : declaration //   
   | assignment *
   | postfixExpression *
   | conditional //
   | for_loop //
   | while_loop *
   | repeat_loop // *
   | for_each_loop //
   | think_loop // 
   | range_loop
   | labelDef
   | gotoJump
   | breakLoop *
   | continueLoop *
   | retStatement * 
*/
        // tipo x = valor
        if(s.declaration())
            return visit.Declaration(s.declaration())
        // x = y
        if(s.assignment())
            return visit.Assignment(s.assignment())

        // x()
        if(s.postfixExpression())
            return visit.Postfix(s.postfixExpression())
        // if x
        if(s.conditional())
            return visit.If(s.conditional())
        // while x: end
        if(s.while_loop())
            return visit.While(s.while_loop())
        // repeat: until x
        if(s.repeat_loop())
            return visit.Repeat(s.repeat_loop())

        // break
        if(s.breakLoop())
            return new Break()
        // continue
        if(s.continueLoop())
            return new Continue()

        // return x
        if(s.retStatement()){
            if(s.retStatement().exp()){
                return new Return( visit.Expression( s.retStatement().exp() ))
            }else{
                return new Return()
            }
        }
    },
    Type(t){
        return new Type(t.getText())
    },
    Declaration(d){
        if(d.varDeclaration()){
            return visit.VarDeclaration( d.varDeclaration())
        }
    },
    VarDeclaration(d){
        const type = visit.Type(d.type()),
        // pra cada var decl unit
                identifier = visit.Identifier( d.varDecUnit(0).identifier() )

        return new VarDeclaration(new Var(identifier), new Type(type), null)
    },
    Assignment(a){
        // assignment sempre é múltiplo.
        const 
            right = visit.Expression( a.exp(0) ),
            op = a.assignOp().getText(),
            r = a.assignmentUnit().map(
                unit => new Assignment(visit.Postfix(unit.postfixExpression()),op, right)
            )
        return r
    },

    /**
     * 
     * @param {body} b 
     * @returns array containing all statements inside a body
     */
    Body(b){
        return b.statement().map( s => visit.Statement(s) )
    },
    
    While(w){
        // condição
        let _while = new While(visit.Expression(w.exp()))
        
        // corpo
        Node.addChild(_while, visit.Body(w.body()))

        return _while
    },
    Repeat(r){

        // condição
        let _repeat = new Repeat(visit.Expression(r.exp()))
        // corpo
        Node.addChild(_repeat, visit.Body(r.body()))

        return _repeat
    },
    
    /*
        Expressões
    */
    Primary(p){
        if(!p)
            throw "P é nulo ou indefinido. "+p
        // como descobrir a regra de uma vez só?
        if(p.identifier()){
            return new Var(visit.Identifier(p.identifier()))
        }else if(p.number()){
            return new Numeric(visit.Number(p.number()))
        }else if(p.string()){
            return new Text(visit.String(p.string()))
        }
    },

    // Esse bloco está horrível porque o postfix compreende muitas regras ao mesmo tempo.
    Postfix(p){
        // O que eu faço com uma merda de expressão tipo
        // a.b->c::d ?
        // primaria
        if(p.primaryExpression()){
            return visit.Primary(p.primaryExpression())
        } else

        // x()
        if(p.L_PAR() && p.R_PAR()){
            return new Call(
                visit.Postfix(p.postfixExpression(0)),
                argList(p.expList())
            )
        } else
        // x.y
        if(p.propOp()){
            return new Property(
                visit.Postfix(p.postfixExpression(0)),
                p.propOp().getText(),
                visit.Postfix(p.postfixExpression(1))
            )
        } else
        // x[y]
        if(p.L_SBRAC() && p.R_SBRAC()){
            return new Index(
                visit.Postfix(p.postfixExpression(0)),
                visit.Expression(p.exp())
            )
        }else
        // x
        if(p.postfixExpression(0)){
            return visit.Postfix(p.postfixExpression(0))
        }    
        return undefined
    },

    If(ifContext){
        let branch = new Branch()
        let body_counter = 0

        ifContext.exp().forEach( e =>{
            // adiciona essa condição...
            let part = branch.addCondition( visit.Expression(e) )
            // adiciona o corpo dessa condição...
            if(ifContext.body(body_counter)){
                Node.addChild( part, visit.Body( ifContext.body(body_counter)) )
            }
            body_counter++
        })

        // coloca o corpo do else...
        if(ifContext.if_else()){
            let part = branch.addElse()
            // adiciona o corpo do else
            if(ifContext.body(body_counter)){
               Node.addChild( part, visit.Body(ifContext.body(body_counter)) )
            }
        }

        return branch
    },
    /**
     * 
     * @param {*} e 
     * @returns Numeric, Text, Binary, 
     */
    Expression(e){
        const A = x => visit.Expression( e.exp(0) ),
              B = x => visit.Expression( e.exp(1) ),
              bin = (a, o, b) => new Binary(a, o, b)
        // -x, !x
        if(e.unary()){
            return new Unary(A(), e.unary().getText())
        }
        // ( expressão )
        // this is just
        if(e.L_PAR() && e.R_PAR()){
            return new Parentheses( A() )
        }
        // expressões binárias
        for (p of [
            [   () => e.postfixExpression(), 
                () => visit.Postfix(e.postfixExpression())], // x

            [   () => e.multiplicative(),
                () => bin( A(e), e.multiplicative().getText(), B(e) ) ], // x * y
    
            [   () => e.additive(),
                () => bin(A(e), e.additive().getText(), B(e)) ], // x + y

            [   () => e.shift()     ,() => bin(A(e), e.shift().getText(), B(e) )], // x >> y, x << y
            [   () => e.relational(),() => bin(A(e), e.relational().getText(), B(e) )], // x > y, x < y
            [   () => e.equality()  ,() => bin(A(e), e.equality().getText(), B(e) )], // x == y, x != y
            [   () => e.bitAnd()    ,() => bin(A(e), "&", B(e) )], // x & y
            [   () => e.bitXor()    ,() => bin(A(e), "^", B(e))], // x ^ y
            [   () => e.bitOr()     ,() => bin(A(e), "|", B(e))], // x | y
            [   () => e.boolAnd()   ,() => bin(A(e), "&&", B(e))], // x && y
            [   () => e.boolOr()    ,() => bin(A(e), "||", B(e)) ] // x || y
        ]){
            if(p[0]())
                return p[1]()
        }

            
        return undefined
    }            
}

function Call(w, args){

    this.type = "call"
    this.what = w
    this.args = args

    return this
}

Call.prototype = {
    isStatement : F_TRUE,
    toAST(){
        return  {
            call : tool.toAST(this.what),
            args : this.args.map( a => tool.toAST(a))
        }
    },
    toC(nivel){
        let args = this.args.map( a => tool.toC(a) ).join(",")
        return tool.indent(nivel) + tool.toC( this.what ) + "(" + args +")"
    },
    toJS(nivel){
        let args = this.args.map( a => tool.toJS(a) ).join(",")
        return tool.indent(nivel) + tool.toJS( this.what ) + "(" + args + ")"        
    }
}

function Return(exp){
    this.type = "return"
    this.expression = exp
    return this
}

Return.prototype={
    isStatement : F_TRUE,
    toAST(){
        if(this.expression){
            return {
                "return" : tool.toAST(this.expression)
            }
        }else{
            return { "return" : "void" }
        }

    },
    toC(nivel){
        let i = tool.indent(nivel)
        if(this.expression){
            return i + "return "+tool.toJS(this.expression)
        }else{
            return i + "return"
        }
    },
    toJS(nivel){
        let i = tool.indent(nivel)
        if(this.expression){
            return i + "return "+tool.toJS(this.expression)
        }else{
            return i + "return"
        }
    }
}

function Continue(){
    this.type = "continue"
    return this
}

Continue.prototype = {
    isStatement : F_TRUE,
    toAST(){
        return "continue"
    },
    toC(nivel){
        return tool.indent(nivel) + "continue";
    },
    toJS(nivel){
        return tool.indent(nivel) + "continue";
    }
}

function Break(){
    this.type = "break"
    return this
}

Break.prototype = {
    isStatement : F_TRUE,
    toAST(){
        return "break"
    },
    toC(nivel){
        return tool.indent(nivel) + "break";
    },
    toJS(nivel){
        return tool.indent(nivel) + "break";
    }
}

function Type(name){
    this.name = name
    return this
}
Type.prototype = {
    toAST(){
        return this.name
    },
    toC(){
        return this.name
    },
    // isso nunca vai ser chamado porque JS tem tipagem dinâmica.
    // e eu não quero nada de typescript.
    toJS(){
        return ""
    }
}

function VarDeclaration(variable,type,initializer){
    this.variable = variable
    this.type = type
    this.initializer = initializer
    return this
}
VarDeclaration.prototype = {
    isStatement   : F_TRUE,
    isDeclaration : F_TRUE,
    toAST(){
        if(this.initializer){
            return {
                "var declaration" : {
                    var : this.variable.name,
                    type: this.type.name,
                    initializer : tool.toAST(this.initializer)
                }
            }
        }else{
            return {
                "var declaration" : {
                    var : this.name,
                    type: this.type
                }
            }
        }
    },
    toC(nivel){
        return tool.indent(nivel) + tool.toC(this.type) + " " + tool.toC(this.variable) + (this.initializer ? " = "+tool.toC(this.initializer) : "" )
    },
    toJS(nivel){
        return tool.indent(nivel) + "let " + tool.toJS(this.variable) + (this.initializer ? " = " + tool.toJS(this.initializer) : "")        
    }
}

/*
    Regras:
    - a variável precisa ser definida.
    - a variável é definida quando é declarada, quando é argumento de uma função, ou quando é membro de um struct.
    - a variável pode ser declarada explicitamente ou implicitamente.
*/
function Var(name){
    this.type = "var"
    this.name = name // name.toLowerCase()
    return this
}
Var.prototype={
    toAST(){
        return {var : this.name}
    },
    toC(){
        return this.name
    },
    toJS(){
        return this.name
    }
}

function Index(owner, index){
    this.type = "index"
    this.owner = owner
    this.index = index
}
Index.prototype = {
    toC(nivel){
        return tool.toC(this.owner) + "[" + tool.toC(this.index) + "]"
    },
    toJS(nivel){
        return tool.toJS(this.owner) + "[" + tool.toJS(this.index) + "]"
    },
    toAST(){
        return {index : {owner   : tool.toAST(this.owner) , 
                         element : tool.toAST(this.index) }}
    }
}


function Property(owner, op, field){
    this.type = "property"
    this.owner = owner
    this.field = field
    this.op   = op
    return this
}
Property.prototype = {
    toAST(){
        return {property : {owner : tool.toAST(this.owner),
                field : tool.toAST(this.field)}}
    },
    isStatement(){
        return tool.isStatement(this.field)
    },
    toC(nivel){
        return tool.indent(nivel) + tool.toC(this.owner) + this.op + tool.toC(this.field)
    },
    toJS(nivel){
        return tool.indent(nivel) + tool.toJS(this.owner) + "." + tool.toJS(this.field)
    }
}

/**
 * Wrapper for (expression) s
 * @param {Expression} expression 
 * @returns 
 */
function Parentheses( expression ){
    this.type = "parentheses"
    this.expression = expression
    return this
} 
Parentheses.prototype = {
    toAST(){
        return tool.toAST(this.expression)
    },
    toC (nivel){
        return "(" + tool.toC(this.expression) + ")"
    },
    toJS(nivel){
        return "(" + tool.toJS(this.expression) + ")"
    }
}

const jsonFormat = require('json-format')

let programa = visit.Program( analisar(
    ler("test.onix"), true
))

let formatted = jsonFormat(programa.toAST(),{
    type: 'space',
    size: 2
})


// Testar o código.
escreve("ast.json"   , formatted)
escreve("output.cpp" , programa.toC (0))
escreve("output.js"  , programa.toJS(0))
// Ver o que eu tenho que fazer.
TODOS()

console.log("Executando o gerado...")

eval(programa.toJS(0))



