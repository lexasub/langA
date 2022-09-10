package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;
import org.lexasub.langosSecondTry.langosWithoutSyntaxVisitor;
import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.function.Function;
import java.util.stream.Stream;
class PairString extends org.antlr.v4.runtime.misc.Pair<String,String> {//заглушка против java
    public PairString(String s, String s2) {
        super(s, s2);
    }
}
public class MylangosWithoutSyntaxVisitor implements langosWithoutSyntaxVisitor {

    @Override
    public String visitProgram(langosWithoutSyntaxParser.ProgramContext ctx){
        if(!ctx.import_().isEmpty()) return visitImport_(ctx.import_());
        return visitElement(ctx.element());
   }
   @Override
   public String visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx){
       //return ctx.program().stream().map(this::visitProgram).reduce("", String::concat);
       return visitImport_(ctx.import_());
       //return ctx.stop.getText();
   }
    @Override
    public String visitImport_(langosWithoutSyntaxParser.Import_Context ctx){
        return "";
    }
    @Override
    public String visitElement(langosWithoutSyntaxParser.ElementContext ctx){
        return (!ctx.function().isEmpty())
                ?visitFunction(ctx.function())
                :visitExpr(ctx.expr());
    }
    @Override
    public String visitFunction(langosWithoutSyntaxParser.FunctionContext ctx){
        return Asm.createFunction(visitType_name(ctx.type_name()),
                                    visitVar_name(ctx.var_name()),
                                    visitFunc_args(ctx.func_args()),
                                    visitBraced_element(ctx.braced_element()));
    }
    @Override
    public String visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx){
        return visitid(ctx.ID().getText());
    }
    @Override
    public String visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx){
        return Asm.intoScope(visitid(ctx.ID().getText()));
    }
    @Override
    public String visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx){
        return visitid(ctx.ID().getText());
    }
    @Override
    public String visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx){
        return visitid(ctx.ID().getText());
    }
    @Override
    public String visitFunc_args(langosWithoutSyntaxParser.Func_argsContext ctx){
        //TODO
        Stream<String> s1 = ctx.type_name().stream().map(this::visitType_name);
        Stream<String> s2 = ctx.var_name().stream().map(this::visitVar_name);
        //пока забъем на типы
        return s2.map(Asm::getArg).reduce("", String::concat);
    }

    @Override
    public String visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx) {
        return ctx.ID().stream().map(this::visitid).map(Asm::intoScope).reduce("", String::concat);
    }
    @Override
    public String visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx){
        return ctx.element().stream().map(this::visitElement).reduce("", String::concat);//mb не совсем верно
    }

    @Override
    public String visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx){
        return (ctx.member_name().isEmpty())
                ?visitFunction_call(ctx.function_call())
                :visitMember_name(ctx.member_name());
    }

    @Override
    public PairString visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx){
        String res = visitClass_name(ctx.class_name());
        String regName = IdGenerator.reg();
        res += Asm.MOVMEMBER(regName, visitMember_name(ctx.member_name()));
        return new PairString(res, regName);
        /*
        * INTOSCOPE myclass1
        * MOVMEMBER r0, name // ~mov r0,myclass1.name
        * */
    }

    public String visitid(TerminalNode s){
        return visitid(s.getText());
    }
    public String visitid(String s){
        return s;//TODO
    }
    @Override
    public String visitExpr(langosWithoutSyntaxParser.ExprContext ctx){
        if(!ctx.flow_control().isEmpty()) return visitFlow_control(ctx.flow_control());
        if(!ctx.function_call_().isEmpty()) return visitFunction_call_(ctx.function_call_());
        if(!ctx.lambda().isEmpty()) return visitLambda(ctx.lambda());
        if(!ctx.get_member().isEmpty()) return visitGet_member(ctx.get_member()).a;//std::kostyl
        //if(ctx.ID().getText() != "") return visitid(ctx.ID());
        return null;
    }
    @Override
    public String visitLambda(langosWithoutSyntaxParser.LambdaContext ctx){
        Stream<String> s1 = ctx.parened_id_list().id_list().ID().stream().map(this::visitid);
        String s2 = (ctx.expr().isEmpty())
                ? visitBraced_element(ctx.braced_element())
                : visitExpr(ctx.expr());
        return Asm.createLambda(s1, s2);
    }

    @Override
    public String visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {
        Stream<String> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExpr);
        return visitFun_name(ctx.fun_name(), args);
    }

    @Override
    public String visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx) {
        if(!ctx.namspce_obj().isEmpty()) {
            return visitNamspce_obj(ctx.namspce_obj()) + visitFunction_call(ctx.function_call());
        }
        String cn = visitClass_name(ctx.class_name());//TODO check cn == INTOSCOPE ClassName
        return cn + visitFunction_call(ctx.function_call());
    }

    @Override
    public String visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx) {
        String functionCalls = ctx.function_call_helper().stream().map(this::visitFunction_call_helper)
                .reduce("", String::concat);
        if(!ctx.method_call().isEmpty()){
            return visitMethod_call(ctx.method_call())  + functionCalls;
        }
        return visitFunction_call(ctx.function_call()) + functionCalls;
    }

    public  String visitFun_name(langosWithoutSyntaxParser.Fun_nameContext funname, Stream<String> args) {
        Function funGen = selectFunction(funname);
        String asm = (String) funGen.apply(args);
        return asm;
    }

    private static Function selectFunction(langosWithoutSyntaxParser.Fun_nameContext funname) {
        if(!funname.IF().getText().isEmpty())
            return FunctionGenerators.ifGenerator();
        if(!funname.WHILE().getText().isEmpty())
            return FunctionGenerators.whileGenerator();
        if(!funname.PAIRMAP().getText().isEmpty())
            return FunctionGenerators.pairMapGenerator();
        if(!funname.MAP().getText().isEmpty())
            return FunctionGenerators.mapGenerator();
        if(!funname.ID().getText().isEmpty())//may be add ids.table.addfuntotable..//TODO?
            return FunctionGenerators.userFunGenerator(funname.ID().getText());
        return null;
    }

    @Override
    public String visitFlow_control(langosWithoutSyntaxParser.Flow_controlContext ctx) {
        if(!ctx.return_expr().isEmpty()) return visitReturn_expr(ctx.return_expr());
        if(ctx.BREAK().getText() != "") return Asm.BREAK();
        if(ctx.CONTINUE().getText() != "") return Asm.CONTINUE();
        return null;
    }

    @Override
    public String visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx) {
        return visitExpr(ctx.expr()) +
                Asm.setArgLastRes() +
                Asm.RETURN();
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
    @Override
    public Object visitFun_name(langosWithoutSyntaxParser.Fun_nameContext ctx) {return null;}
    @Override
    public Stream<String> visitParened_id_list(langosWithoutSyntaxParser.Parened_id_listContext ctx) {
        return visitId_list(ctx.id_list());
    }

    @Override
    public String visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx) {
        return visitid(ctx.ID());
    }
    //@Override
    public Stream<String> visitId_list(langosWithoutSyntaxParser.Id_listContext ctx) {
        return ctx.ID().stream().map(this::visitid);//TODO check , i don't want ','
    }

    @Override
    public Stream<String> visitExpr_list(langosWithoutSyntaxParser.Expr_listContext ctx) {
        return ctx.expr().stream().map(this::visitExpr);
    }

    @Override
    public Stream<String> visitParened_expr_list(langosWithoutSyntaxParser.Parened_expr_listContext ctx) {
        return visitExpr_list(ctx.expr_list());
    }

    @Override
    public String visitFunction_specifier(langosWithoutSyntaxParser.Function_specifierContext ctx) {
        return null;
    }

    @Override
    public String visitClass_(langosWithoutSyntaxParser.Class_Context ctx) {
        return null;
    }
    /*
    @Override
    public Object visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx) {
        return null;
    }



    @Override
    public Object visit(ParseTree parseTree) { return null; }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
    @Override
    public Object visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx) {
        return null;
    }

    @Override
    public Object visitExpr_list(langosWithoutSyntaxParser.Expr_listContext ctx) {
        return null;
    }

    @Override
    public Promise visitFunc_args(langosWithoutSyntaxParser.Func_argsContext ctx) { return null; }

    @Override
    public Object visitFunction(langosWithoutSyntaxParser.FunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx) {
        return null;
    }

    @Override
    public Object visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx) {
        return null;
    }

    @Override
    public Object visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {return null;}

    @Override
    public Object visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx) {
        return null;
    }

    @Override
    public Object visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx) {
        return null;
    }

    @Override
    public Object visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx) {
        return null;
    }

    @Override
    public Object visitExpr(langosWithoutSyntaxParser.ExprContext ctx) {
        return null;
    }

    @Override
    public Object visitFlow_control(langosWithoutSyntaxParser.Flow_controlContext ctx) {return null;}

    @Override
    public Object visitLambda(langosWithoutSyntaxParser.LambdaContext ctx) {
        return null;
    }

    @Override
    public Object visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx) {
        return null;
    }

    @Override
    public Object visitElement(langosWithoutSyntaxParser.ElementContext ctx) {
        return null;
    }

    @Override
    public Object visitClass_(langosWithoutSyntaxParser.Class_Context ctx) {
        return null;
    }

    @Override
    public Object visitImport_(langosWithoutSyntaxParser.Import_Context ctx) {
        return null;
    }

    @Override
    public Object visitProgram(langosWithoutSyntaxParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public Object visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx) {
        return null;
    }


    @Override
    public Object visitParened_expr_list(langosWithoutSyntaxParser.Parened_expr_listContext ctx) {
        return null;
    }



    @Override
    public Object visitFunction_specifier(langosWithoutSyntaxParser.Function_specifierContext ctx) {
        return null;
    }

    @Override
    public Object visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx) {
        return null;
    }
*/
}
