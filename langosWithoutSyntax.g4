//это файл с грамматикой, можно из него получить распознаватель. в папку ген это кидается
grammar langosWithoutSyntax;

//TODO WS support
WS:  [ \r\n\t] -> skip  ;

IMPORT : 'import';
SYNTAX : 'syntax';
RETURN : 'return';
WITH : 'with';
MAP : 'map';
PAIRMAP : 'pairmap'; //pairmap(arr1,arr2, (i,j) -> i+j)
IF : 'if';
WHILE : 'while';
CONTINUE : 'continue';
BREAK : 'break';
CLASS : 'class';
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
ID:  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'_' )*   ;
COLON :  ': ' ;
SEMI :  ';' ;
COMA : ',';
DOUBLECOLON: '::';
ARROW : '->';

fragment ANY :  .  ;
CHAR :  '\'' ANY '\'' ;
STRING :  '\'' (ANY | '\\\'') *? '\'' ;

function_specifier: ;
type_name: ID;
var_name: ID;
class_name : ID;
member_name : ID;

fun_name : IF | WHILE | PAIRMAP | MAP | ID;

braced_element: RBRACE element* LBRACE;
expr_list: expr? (COMA expr)*;
func_args: RPAREN type_name var_name (COMA type_name var_name)* LPAREN;
function: function_specifier? type_name ID func_args braced_element;
namspce_obj : ID DOUBLECOLON ID;
method_call : (namspce_obj | class_name)  DOT function_call;
function_call : fun_name parened_expr_list;
function_call_helper : function_call| member_name;
function_call_ : (method_call | function_call) (DOT function_call_helper)* ;
//ID-it's getmember
get_member : ID DOT member_name;
expr : return_expr | BREAK | CONTINUE |  function_call_ | lambda| get_member | ID ;
lambda : parened_id_list ARROW (braced_element | expr);
return_expr : RETURN expr;
element :  function | expr ;

class_ : CLASS class_name braced_element;


import_ : IMPORT ID (DOT ID)* SEMI;
program : import_ * element*;
entry_point : program EOF;


id_list : ID (COMA ID)*;
parened_expr_list: RPAREN expr_list LPAREN;
parened_id_list : RPAREN id_list? LPAREN;
id_strong : RPAREN ID LPAREN;
