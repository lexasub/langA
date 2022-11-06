grammar langosIR;

fragment LOWBAR: '_' ;

COLON :  ':' ;
SLASH : '/';
COMA : ',';
LPAREN : ')'  ;
RPAREN  : '(' ;
CLASS :'CLASS';
ENDCLASS :'ENDCLASS';
MEMBER : 'MEMBER';
IMPORT :'IMPORT';
GET_ELEMENT_PTR : 'GET_ELEMENT_PTR';

MAP :'MAP';
MAPo :'MAPo';
PAIRMAP :'PAIRMAP';
PAIRMAP_o :'PAIRMAP_o';
PAIRMAPo_ :'PAIRMAPo_';
PAIRMAPoo :'PAIRMAPoo';
POP :'POP';
PUSH :'PUSH';
MOV :'MOV';

EQ :'EQ';
JMP :'JMP';
BREAK :'BREAK';
CONTINUE :'CONTINUE';
FUNC :'FUNCTION_';
CALL :'CALL';
RET :'RET';

INTOSCOPE :'INTOSCOPE';
OUTOFSCOPE :'OUTOFSCOPE';
ENTERSCOPE:'ENTERSCOPE';
EXITSCOPE:'EXITSCOPE';
FUNCTION_ARGUMENT:'FUNCTION_ARGUMENT';
//RETURN :'RETURN';
//LAST_RES_TO_STACK :'LAST_RES_TO_STACK';
//MOVMEMBER :'MOVMEMBER';
WS:  [ \r\n\t]  -> skip  ;
TAB :'TAB' -> skip  ;
UNTAB :'UNTAB' -> skip  ;


fragment ID1: [a-zA-Z] | LOWBAR;
fragment ID2: [0-9];
ID:  ID1+ (ID1 | ID2 )* ;
ID_ : ID;

intoscope : INTOSCOPE ID;
class : CLASS ID;
endclass : ENDCLASS ID;
import_ : IMPORT ID (SLASH ID)*;

map : MAP ID COMA ID;
mapo : MAPo ID COMA ID;
pairmap : PAIRMAP ID COMA ID COMA ID;
pairmap_o : PAIRMAP_o ID COMA ID COMA ID;
pairmapo_ : PAIRMAPo_ ID COMA ID COMA ID;
pairmapoo : PAIRMAPoo ID COMA ID COMA ID;

pop : POP ID;
push : PUSH ID;

jmp : JMP ID;
call : CALL ID;
eq : EQ ID COMA ID;

lbl : ID COLON;
func_lbl : ID_ RPAREN ID (COMA ID)+ LPAREN COLON;
FUNCID : FUNC ID COLON;
member_declare : MEMBER ID COMA ID;
class_full : class intoscope (member_declare | program)* OUTOFSCOPE endclass;
jmps : eq | jmp ;
flow_control : call | RET | CONTINUE | BREAK | jmps;
scope_control : ENTERSCOPE | intoscope | OUTOFSCOPE/* | EXITSCOPE*/;
stack_cmds : push | pop;
map_control : map | mapo | pairmap | pairmap_o | pairmapo_ | pairmapoo;
function_argument : FUNCTION_ARGUMENT ID COMA ID;
func : func_lbl  ENTERSCOPE ( program*) RET EXITSCOPE;
get_element_ptr : GET_ELEMENT_PTR ID COMA ID COMA ID;
mov : MOV ID COMA ID;
program : import_ | class_full | flow_control | func | scope_control | map_control | mov | stack_cmds | get_element_ptr | lbl;
entry_point : program* EOF?;
