//это файл с грамматикой, можно из него получить распознаватель. в папку ген это кидается
grammar langosWithoutSyntax;

//TODO WS support
fragment NOTQUO :  ~[']  ;
fragment ESCQUO : '\\\'' ;
fragment STRINGBODY : ESCQUO | NOTQUO;
fragment QUOTE : '\'' ;
fragment LOWBAR: '_' ;

CHAR :  QUOTE (NOTQUO | ESCQUO)  QUOTE ;
STRING :  QUOTE STRINGBODY*? QUOTE;

WS:  [ \r\n\t]  -> skip  ;

IMPORT : 'import';
BREAK : 'break';
CLASS : 'class';
CONTINUE : 'continue';

IF : 'if';
MAP : 'map';
PAIRMAP : 'pairmap'; //pairmap(arr1,arr2, (i,j) -> i+j)
RETURN : 'return';
SYNTAX : 'syntax';
WHILE : 'while';
WITH : 'with';
SWAP : 'swap';
SET : 'set';
//KWD : IMPORT | SYNTAX;//....

QUEST :  '?' ;
STAR :  '*'  ;
PLUS :  '+' ;
MINUS : '-';
ASSIGN  :  '='  ;
DOT : '.' ;
LPAREN : ')'  ;
RPAREN  : '(' ;
LBRACE : '}'  ;
RBRACE :  '{'  ;
LEND :  ']'  ;
REND:  '[' ;
BAR:  '|' ;
GT:  '>'  ;
LT:  '<' ;
CIRCUMFLEX : '^' ;

DOUBLECOLON: '::';
COLON :  ':' ;
SEMI :  ';' ;
COMA : ',';
ARROW : '->';

fragment ID1: [a-zA-Z] | LOWBAR;
fragment ID2: [0-9];
ID:  ID1+ (ID1 | ID2 )* ;
import_ : IMPORT ID (DOT ID)* SEMI?;
id_strong : RPAREN ID LPAREN;
fun_name : IF | WHILE | PAIRMAP | MAP | SET | SWAP | ID;
id_list : ID (COMA ID)*;

type_name: ID;
var_name: ID;
class_name : ID;
member_name : ID;

namspce_obj : ID (DOUBLECOLON ID)+;

function_specifier: '$' ;
function: function_specifier? type_name var_name func_args braced_element;

expr : (with_ | flow_control |  function_call_ | class_ | lambda| get_member | CHAR | STRING | ID) SEMI?;

get_member : class_name DOT member_name;

braced_element: RBRACE element* LBRACE;
expr_list: expr?  (COMA expr )*;
func_args: RPAREN (type_name var_name)? (COMA type_name var_name)* LPAREN;

method_call_ : fun_name parened_expr_list;
function_call3 : fun_name parened_expr_list;
function_call_helper_method : function_call3| member_name;
method_call : (namspce_obj | class_name)  DOT method_call_ (DOT function_call_helper_method)* ;

function_call : fun_name parened_expr_list;
function_call_helper : function_call| member_name;
function_call2 : fun_name parened_expr_list (DOT function_call_helper)*;

function_call_ : method_call | function_call2;


flow_control : return_expr | BREAK | CONTINUE ;
lambda : parened_id_list ARROW (braced_element | expr);
return_expr : RETURN expr;
element :  function | expr ;


with_body : ARROW expr;
with_synonym : RPAREN ID LPAREN;//with_body
with_ : WITH parened_expr with_synonym RBRACE  (with_body)* LBRACE;

parened_expr : RPAREN expr LPAREN ;

declare_member: type_name var_name SEMI;//TODO
class_ : CLASS class_name RBRACE (declare_member | element)* LBRACE;


program : import_ | element;
entry_point : program* EOF;


parened_expr_list: RPAREN expr_list? LPAREN;
parened_id_list : (RPAREN id_list? LPAREN) | ID;

