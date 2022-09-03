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

function escreve(path, texto){
    fs.open(path, "w", (err,fd)=>{
        if(!err){
            let b = new Buffer.from(texto)
            fs.write(fd, b, 0, b.length, null, (err, bytes)=>{
                if(err){
                    console.log(err)
                }else{
                    console.log(bytes + " escritos em "+path)
                }
            })
        }else{
            console.log(err)
        }
    })
}


const tool = {
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
            throw "Não consigo fazer a AST. Implementar toAST de "+no.constructor.name
        }
    },
    validar(no){
        if(no.validate){
            return no.validate()
        }else{
            TODO("Implementar validate de "+no.constructor.name)
            return false
        }
    },

    isStatement : no => (no.isStatement && no.isStatement())
}



function Program(){
    this.type = "program"
    this.records = [],
    this.functions= [],
    this.declarations= [],
    this.children= []
    
    return this
}

Program.prototype.toAST = function(){
    return { program : {
        records      : this.records     .map( c => tool.toAST(c)),
        functions    : this.functions   .map( c => tool.toAST(c)),
        declarations : this.declarations.map( c => tool.toAST(c)),
        children     : this.children    .map( c => tool.toAST(c) )
    }}
}

Program.prototype.toC = function(nivel){
    let output = "int main(){\n"

    let i = tool.indent(nivel+1)
    this.children.forEach( c => {
        if(tool.isStatement(c))
            output += i + tool.toC(c, nivel+1) + ";\n"
    })

    output += "}\n"
    return output
}

Program.prototype.toJS = function(nivel){
    let output = "function main(){\n"
    let i = tool.indent(nivel+1)

    this.children.forEach( c => {
        // JS não deixa fazer isso. Tem que filtrar.
        if(tool.isStatement(c))
            output += i + tool.toJS(c, nivel+1) + ";\n"
    })

    output += "}\n"
    return output
}

function Assignment(left, op, right){
    this.type = "assignment"
    this.left = left
    this.right = right
    this.op = op
    return this
}

Assignment.prototype.toAST = function(){
    return {assignment : { op : this.op ,
                         left : tool.toAST(this.left),
                         right: tool.toAST(this.right) }}
    
}

Assignment.prototype.isStatement = () => true

Assignment.prototype.toC = function(nivel){
    return tool.toC(this.left) + this.op + tool.toC(this.right)
}

Assignment.prototype.toJS = function(nivel){
    return tool.toJS(this.left) + this.op + tool.toJS(this.right)
}

function Binary(a, op, b){
    this.type = "binary"
    this.a = a
    this.op = op
    this.b = b
    return this
}

Binary.prototype.toC = function(nivel){
    return tool.toC(this.a) + this.op + tool.toC(this.b)
}

Binary.prototype.toJS = function(nivel){
    return tool.toJS(this.a) + this.op + tool.toJS(this.b)
}

function argList (expList){
    let list = []
    if(expList){
        if(expList.exp()){
            list = expList.exp().map( e => visit.Expression(e ))
        }
    }
    return list
}

const visit = {
    Program(context){
        let program =new Program()
    
        Node.pushNode(program)
        console.log("PORRA")

        if(context.block()){
            context.block().forEach( block =>
                console.log("F")    
            )
        }

        context.children.forEach( block => 
            Node.addChild(visit.Block(block))   
        )
    
        Node.popNode()
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
        console.log("Bloco "+b)
        if(b.statement){
            console.log("Statement")
            return visit.Statement(b.statement())
        }
            
        
    },

    /*
        Instruções
    */
    Statement(s){
/*
   : declaration //   
   | assignment //
   | postfixExpression //
   | conditional //
   | for_loop //
   | while_loop //
   | repeat_loop //
   | for_each_loop //
   | think_loop // 
   | range_loop
   | labelDef
   | gotoJump
   | breakLoop
   | continueLoop
   | retStatement
*/
        if(s.assignment())
            return visit.Assignment(s.assignment())
        console.log("Não é assignment")
        if(s.postfixExpression())
            return visit.Postfix(s.postfixExpression())

        
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
    Expression(e){
        const A = x => visit.Expression( e.exp(0) ),
              B = x => visit.Expression( e.exp(1) ),
              bin = (a, o, b) => new Binary(a, o, b)

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

function Call(path, args){
    this.type = "call"
    this.path = path
    this.args = args
    return this
}

Call.prototype.isStatement = () => true

Call.prototype.toAST = function(){
    return [tool.toAST(this.path),
            this.args.map( a => tool.toAST(a))
           ]
}

Call.prototype.toC = function(nivel){
    let args = this.args.map( a => tool.toC(a) ).join(",")
    return tool.toC( this.path ) + "(" + args +")"
}

Call.prototype.toJS = function(nivel){
    let args = this.args.map( a => tool.toJS(a) ).join(",")
    return tool.toJS( this.path ) + "(" + args + ")"
}

/*
    Regras:
    - a variável precisa ser definida.
    - a variável é definida quando é declarada, quando é argumento de uma função, ou quando é membro de um struct.
    - a variável pode ser declarada explicitamente ou implicitamente.
*/
function Var(name){
    this.type = "var"
    this.name = name.toLowerCase()
    return this
}
Var.prototype.toAST = function(){
    return {var : this.name}
}
Var.prototype.toC = 
Var.prototype.toJS =
function(nivel){
    return this.name
}

function Index(owner, index){
    this.type = "index"
    this.owner = owner
    this.index = index
}

Index.prototype.toC =
function(nivel){
    return tool.toC(this.owner) + "[" + tool.toC(this.index) + "]"
}

Index.prototype.toJS = 
function(nivel){
    return tool.toJS(this.owner) + "[" + tool.toJS(this.index) + "]"
}

Index.prototype.toAST = 
function(){
    return {index : {owner   : tool.toAST(this.owner) , 
                     element : tool.toAST(this.index) }}
}

function Property(owner, op, field){
    this.type = "property"
    this.owner = owner
    this.field = field
    this.op   = op
    return this
}

Property.prototype.toAST = function(){
    return {property : {owner : tool.toAST(this.owner),
            field : tool.toAST(this.field)}}
}

Property.prototype.isStatement = function(){
    return tool.isStatement(this.field)
}

Property.prototype.toC =
function(nivel){
    return tool.toC(this.owner) + this.op + tool.toC(this.field)
}
Property.prototype.toJS = 
function(nivel){
    return tool.toJS(this.owner) + "." + tool.toJS(this.field)
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
