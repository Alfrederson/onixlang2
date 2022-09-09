/*
    V2 da gramática.
 */

grammar onix;

@lexer::members{
    //public final java.util.LinkedList<String> unmatched = new java.util.LinkedList();
    //_unmatched = []
}


number: BIN | HEX | INT | FLOAT | K_FALSE | K_TRUE;
string: StringLiteral  ;

program: block*? EOF;

block
   : import_directive
   | use_directive
   | sub_def        // ok
   | func_def       // ok
   | record_def
   | ext_block
   | statement
   ; 

import_directive: K_IMPORT (string|Libstring);
  
use_directive 
    : K_USING (string|Libstring)
    ;

statement             
   : declaration // var ok array falta  
   | assignment // ok
   | postfixExpression //
   | conditional // ok
   // | for_loop // removido na V2
   | while_loop // ok
   | repeat_loop // ok
   | for_each_loop //
   //| think_loop // removido na v2 
   | range_loop
 //  | labelDef   // removido na V2
 //  | gotoJump   // removido na V2
   | breakLoop    // ok
   | continueLoop // ok
   | retStatement // ok
   ;


body: (statement)* ;

record_def : K_RECORD identifier COLON declaration* K_END;

func_def : K_FUNC  type (type PERIOD)? name=identifier DOUBLE_ARROW exp
         | K_FUNC  type (type PERIOD)? name=identifier parlist DOUBLE_ARROW exp
         | K_FUNC  type (type PERIOD)? name=identifier COLON body K_END
         | K_FUNC  type (type PERIOD)? name=identifier parlist COLON body K_END
         ; 

func_stub : K_FUNC type (type PERIOD)? name=identifier parlist? ;

// V1
//cpp_ext_block: K_CPP COLON (cpp_func_def|cpp_sub_def|cpp_var_def)* K_END;

// V2
// V2 permite definir funções específicas para cada runtime
ext_block: K_EXT string COLON (ext_func_def | ext_sub_def | ext_var_def )* K_END;


// bloco externo c++/js/qualquer coisa:
// ext "vm" / "cpp" / "js"
//  "nome_cpp": func tipo nome x:int, y:int, z:int
//  "nome_cpp": func tipo nome x:int, ...
//  "nome_var_cpp": tipo nome
//  "nome_var_cpp": tipo
// fim

// tipos externos também!

// ext "cpp"
//  "pino" : tipo pino: ... fim

// bloco externo vm:
// ext "vm":
//   "0": func tipo nome x:int, y:int, z:int
//   "0": func tipo nome x:int, ...
// fim

ext_func_id: string|number;

ext_func_def: sub=ext_func_id COLON func_stub;
ext_var_def : sub=string COLON declaration;

sub_def : K_SUB (type PERIOD)? name=identifier COLON  body K_END
        | K_SUB (type PERIOD)? name=identifier parlist COLON  body K_END 
        ; 

sub_stub : K_SUB (type PERIOD)? name=identifier parlist?;

ext_sub_def: sub=ext_func_id COLON sub_stub;


any_args : '...';

// labelDef : LABEL COLON ; // REMOVIDO NA V2
// gotoJump : K_GOTO LABEL; // REMOVIDO NA V2

breakLoop: K_BREAK ;
continueLoop: K_CONTINUE ;
retStatement: K_RETURN exp?;

/*  V1
par: (type (L_SBRAC R_SBRAC)?)? identifier 
   | identifier COLON type (L_SBRAC R_SBRAC)?
   | any_args ;
*/
par:  (type (L_SBRAC R_SBRAC)? COLON)? identifier 
    | any_args ;

parlist : L_PAR par (COMMA par)* R_PAR 
        | par (COMMA par)* ;

conditional : K_IF exp (INTERROGATION|COLON)  body (if_elseif exp (INTERROGATION|COLON) body)* (if_else (INTERROGATION|COLON) body)? K_END ;
if_elseif: K_ELSE K_IF;
if_else  : K_ELSE;

for_loop: K_COUNT init=assignment COMMA test=exp COMMA (assignment|postfixExpression) COLON body K_END ;
range_loop: K_FOR K_EACH identifier (K_IN|K_OF) startExp=exp DOUBLE_PERIOD endExp=exp COLON body K_END ;
for_each_loop: K_FOR K_EACH ADDROP? identifier (COMMA identifier)? (K_IN|K_OF) postfixExpression COLON body K_END ;



while_loop: K_WHILE exp COLON  body K_END;
repeat_loop: K_REPEAT COLON  body K_UNTIL exp ;
// removido na v2
//think_loop : K_LOOP COLON  body K_END ;

// v1
// declaration : varDeclaration | arrayDeclaration | constDeclaration ;
declaration : varDeclaration | constDeclaration; 

constDecUnit : identifier EQUAL exp;
constDeclaration : K_CONST constDecUnit (COMMA constDecUnit)* ;

// v2
// removida a síntaxe de "construtor

//initializer : L_PAR expList R_PAR
//            | exp
//            ;

// v1
/* 
arrayDecUnit : identifier L_SBRAC exp R_SBRAC
             | identifier EQUAL arrayInitializer
             ;
*/
// v2
arrayDecUnit : L_SBRAC exp R_SBRAC
             | EQUAL arrayLiteral
             ;

// recursive for n-d array
arrayLiteral : L_SBRAC exp (COMMA exp)* R_SBRAC;
             
decUnit : identifier ((EQUAL exp)? | arrayDecUnit);
/* V1 
varDeclaration : type varDecUnit (COMMA varDecUnit)* ;
*/
/* V2  */
varDeclaration : (K_VAR|K_GLOBAL) type COLON decUnit (COMMA decUnit)* ;     




/*  V1
arrayDecUnit : identifier L_SBRAC exp R_SBRAC
             | identifier EQUAL arrayInitializer
             ;
*/

/* removido na V2
arrayDeclaration : (K_VAR|K_GLOBAL) type COLON arrayDecUnit (COMMA arrayDecUnit)*
                 ; 
*/

assignmentUnit : postfixExpression;
assignment :  assignmentUnit (COMMA assignmentUnit)* assignOp exp;

assignOp : EQUAL | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | OR_ASSIGN | AND_ASSIGN | LSH_ASSIGN | RSH_ASSIGN | AND_ASSIGN | XOR_ASSIGN | OR_ASSIGN;
unaryOp : INCREMENT | DECREMENT ;

propOp: (PERIOD | DOUBLE_COLON | ARROW);

primaryExpression
    : identifier
    | number
    | string;
 
postfixExpression
    : primaryExpression                           // termo A*
    | postfixExpression L_PAR expList? R_PAR      // termo A(explist)*
    | postfixExpression propOp postfixExpression  // termo A, termo B*
    | postfixExpression L_SBRAC exp R_SBRAC       // termo A, exp*
    | postfixExpression DECREMENT                 // termo A
    | postfixExpression INCREMENT                 // termo A
    | ADDROP postfixExpression                    // termo A
    | L_BRAC postfixExpression R_BRAC             // termo A
    ;

exp  
    : postfixExpression
    | unary exp              // *
    | L_PAR exp R_PAR        // *
    | a=exp multiplicative b=exp // * 
    | a=exp additive b=exp       // * 
    | a=exp shift b=exp          // * 
    | a=exp relational b=exp     // * 
    | a=exp equality b=exp       // * 
    | a=exp bitAnd b=exp         // * 
    | a=exp bitXor b=exp         // * 
    | a=exp bitOr b=exp          // * 
    | a=exp boolAnd b=exp        // * 
    | a=exp boolOr b=exp         // * 
    // removido na V2. typecasting é feito assim: tipo( variavel de outro tipo )
    // | exp K_AS type          // não sei o que eu faço com isso
    ;

multiplicative: DIV | MOD | MULT;
additive : PLUS | MINUS;
shift: BITWISE_LSH | BITWISE_RSH;
relational:  LESSER_THAN | GREATER_THAN | LESSER_EQUAL | GREATER_EQUAL;
equality: EQUALS_TO | NOT_EQUAL;
bitAnd: BITWISE_AND;
bitXor: BITWISE_XOR;
bitOr : BITWISE_OR;
boolAnd: BOOL_AND;
boolOr  : BOOL_OR;

expList: exp (COMMA exp)* ;    



Libstring: LESSER_THAN ( CChar+ )*? GREATER_THAN ;
StringLiteral : DOUBLE_QUOTE ( CChar+ )? DOUBLE_QUOTE;
 
// V1
// type : (K_BYTE | K_INT | K_LONG | K_FLOAT | K_STRING | identifier) ADDROP? ;

// V2
type : identifier ADDROP? ;

unary: MINUS | NEGATION ;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

L_PAR: '(';
R_PAR: ')';
L_BRAC: '{'; 
R_BRAC: '}';
L_SBRAC: '[';
R_SBRAC: ']';

EQUAL: '=';
PLUS : '+';
MINUS: '-';
MULT: '*';
POWER: '**';
DIV:'/';
NEGATION: '!';
MOD:'%';
LESSER_THAN: '<';
GREATER_THAN: '>';
LESSER_EQUAL: '<=';
GREATER_EQUAL: '>=';
NOT_EQUAL: '!=';
EQUALS_TO: '==';

PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
LSH_ASSIGN: '<<=';
RSH_ASSIGN: '>>=';
AND_ASSIGN: '&=';
XOR_ASSIGN: '^=';
OR_ASSIGN : '|=';

ADDROP: '@';

BOOL_AND: ('&&' | A N D );
BOOL_OR : ('||' | O R );
BITWISE_AND: '&';
BITWISE_OR: '|';
BITWISE_XOR: '^';
BITWISE_LSH: '<<';
BITWISE_RSH: '>>';

DOUBLE_PERIOD: '..';
ELLIPSIS: '...';
PERIOD: '.';
COLON: ':';
COMMA: ',';
DOUBLE_COLON: '::';
ARROW: '->';

DOUBLE_QUOTE: '"';
INTERROGATION: '?';

INCREMENT: '++';
DECREMENT: '--';

fragment
    SEMI_COLON: ';';

// É difícil de ler isso

// K_GOTO : G O T O | P U L A R ; // REMOVIDO NA V2

K_AS : A S | C O M O;

K_IMPORT : I M P O R T 
         | I M P O R T A R
         ;
K_USING: U S I N G 
       | U S A R ; 

K_SUB : S U B ;
K_FUNC : F U N C; 
K_RECORD : T Y P E | T I P O;


K_LOOP  : L O O P | T H I N K | P E N S A R ;

K_CONST : C O N S T | C O N S T A N T E;

// V2
K_VAR   : V A R ;
K_GLOBAL : G L O B A L;

K_COUNT : C O U N T 
        | C O N T A R;

K_FOR : F O R 
      | P A R A
      ;

K_BREAK : B R E A K | S A I R;
K_CONTINUE : C O N T I N U E | P R O X I M O ;

K_EACH : E A C H
       | C A D A
       ;

K_OF : O F | D E;
K_IN : I N | E M;  

K_WHILE : W H I L E 
        | E N Q U A N T O ;
K_REPEAT : R E P E A T 
         | R E P E T I R;
K_UNTIL : U N T I L 
        | A T E;
K_VM : V M ;


//K_CPP : C P P;

K_EXT : E X T ;


K_IF : I F 
     | S E;
K_ELSE : E L S E 
       | S E N A O;

K_END: F I M 
     | E N D ;

K_RETURN: R E T U R N 
        | R E T O R N A ;

DOUBLE_ARROW: '=>';
K_FALSE: F A L S E 
      | O F F 
      | L O W 
      | F A L S O 
      | D E S L I G A D O;
K_TRUE: T R U E | O N | H I G H | V E R D A D E I R O | L I G A D O;


/* 
Removido na V2. Agora declaração segue o formato VAR TIPO: x, y, z
K_BYTE: B Y T E;
K_INT: I N T E I R O | I N T;
K_LONG: L O N G O  | L O N G ;
K_FLOAT: R E A L | F L O A T ;
K_STRING: S T R I N G 
        | T E X T O;
*/

fragment
EscapeSequence
    : '\\' ['"?abfnrtv\\] ;

fragment
CChar
    : ~['\\\r\n"]
    | EscapeSequence
    ;

/* 
REMOVIDO NA V2
LABEL
    : [@][a-zA-Z][a-zA-Z_0-9]*
    ;
*/

NAME
    : [a-zA-Z][a-zA-Z_0-9]*
    ; 

INT
    : Digit+
    ;

HEX
    : '0' [x] HexDigit ('_' | HexDigit)+
    ;

BIN
    : '0' [b] BinaryDigit ('_' | BinaryDigit)+
    ;

FLOAT
    : Digit+ '.' Digit* ExponentPart?
    | '.' Digit+ ExponentPart?
    | Digit+ ExponentPart
    ;


fragment
ExponentPart
    : [eE] [+-]? Digit+
    ;

fragment
HexExponentPart
    : [pP] [+-]? Digit+
    ;


fragment
HexEscape
    : '\\' 'x' HexDigit HexDigit
    ;

fragment
BinaryDigit
    : [0-1]
    ;

fragment
Digit
    : [0-9]
    ;
fragment
HexDigit
    : [0-9a-fA-F]
    ;
COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;

identifier: NAME;



LINE_COMMENT
    : '//'
    (                                               
    | ~('\r'|'\n') ~('\r'|'\n')*                // --AAA
    ) ('\r\n'|'\r'|'\n'|EOF)
    -> channel(HIDDEN)
    ;

WS: [ \r\n\t]+ -> channel(HIDDEN) ;
// UNMATCHED : . { unmatched.add(getText() + " " + getLine()); };
    


