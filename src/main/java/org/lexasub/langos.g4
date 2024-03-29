//это файл с грамматикой, можно из него получить распознаватель. в папку ген это кидается
grammar langos;

WS:  [ \r\n\t] -> skip  ;

IMPORT : 'import';
SYNTAX : 'syntax';
RETURN : 'return';
WITH : 'with';

QUEST :  '?' ;
STAR :  '*'  ;
PLUS :  '+' ;
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

//нафиг возможность перезаписывать правила, просто по другому именовать будем
/*rule_ <- ((ident  ':' bnf_right* ';')*);*/
rulelist : rule_+;

rule_  : ID COLON alternatives SEMI;

alternative : element+  ;
alternatives  : alternative (BAR alternative)*  ;
alternatives_strong : RPAREN alternatives LPAREN;

bnf_not : RPAREN CIRCUMFLEX element LPAREN;
element :   bnf_not | zeroormore_non_gready | optional_ | zeroormore  | oneormore |
            ID |  range_ | CHAR | STRING;

range_ : CHAR DOT DOT CHAR;

optional_ : alternatives_strong QUEST;
zeroormore : alternatives_strong STAR;
zeroormore_non_gready : zeroormore QUEST;
oneormore : alternatives_strong PLUS;

syntax_ : SYNTAX ID  RBRACE import_* rulelist LBRACE;
syntax_namespace_obj : ID DOUBLECOLON ID;
syntax_impl : SYNTAX syntax_namespace_obj id_list_strong RBRACE syntax_impl_body LBRACE;
syntax_return : RETURN syntax_expr;
//syntax_method_call : syntax_namespace_obj RPAREN syntax_expr LPAREN;
syntax_rule_call : syntax_namespace_obj RPAREN syntax_expr LPAREN;
syntax_lambda : RPAREN id_list LPAREN ARROW RBRACE (syntax_expr SEMI)+ LBRACE;
/*syntax_with_body : ID ARROW id_strong RBRACE syntax_expr LBRACE;
syntax_with : WITH syntax_expr_strong RBRACE syntax_with_body (COMA syntax_with_body)* LBRACE;*/
syntax_object_getter : ID syntax_expr_strong; //TODO? ID->ID.ID/*example*/
syntax_text_getter : ID REND syntax_expr LEND; //
syntax_method_call_begin : syntax_rule_call | syntax_object_getter |
                        syntax_text_getter |
                        syntax_method_call_begin  syntax_method_call_body
              ;
syntax_method_call_body : (DOT  syntax_expr_strong)+;
syntax_method_call : syntax_method_call_begin syntax_method_call_body;//TODO
syntax_expr :  syntax_method_call | syntax_rule_call |
              syntax_lambda | syntax_return /*| syntax_with*/ |
              syntax_object_getter | syntax_text_getter | ID; //add real_method_call
syntax_expr_strong : RPAREN syntax_expr LPAREN;
syntax_impl_body : (syntax_expr SEMI) *;
import_ : IMPORT ID (DOT ID)* SEMI;
program : import_ * (syntax_ | syntax_impl)*;
entry_point : program EOF;


id_list : ID (COMA ID)*;
id_list_strong : RPAREN id_list LPAREN;
id_strong : RPAREN ID LPAREN;
