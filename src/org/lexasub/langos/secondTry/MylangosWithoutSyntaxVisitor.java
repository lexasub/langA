package org.lexasub.langos.secondTry;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langos.secondTry.utils.Promise;

import java.util.function.Function;
import java.util.stream.Stream;

public class MylangosWithoutSyntaxVisitor implements langosWithoutSyntaxVisitor {
    PromisedFIR promisedFIR = new PromisedFIR();
    FunctionGenerators fgen = new FunctionGenerators();

    @Override
    public Function visitFun_name(langosWithoutSyntaxParser.Fun_nameContext ctx) {
        if (ctx == null) return null;
        if(ctx.IF().getText() != "")
            return fgen.ifGenerator();
        if(ctx.WHILE().getText() != "")
            return fgen.whileGenerator();
        if(ctx.PAIRMAP().getText() != "")
            return fgen.pairMapGenerator();
        if(ctx.MAP().getText() != "")
            return fgen.mapGenerator();
        if(ctx.ID().getText() != "")
            return fgen.userFunGenerator(ctx.ID().getText());
        return null;
    }

    @Override
    public Promise visitFunc_args(langosWithoutSyntaxParser.Func_argsContext ctx) {
        return promisedFIR.promiseFuncArgs(
                ctx.type_name().stream().map(this::visitType_name),
                ctx.var_name().stream().map(this::visitVar_name));
    }

    @Override
    public Promise visitFunction(langosWithoutSyntaxParser.FunctionContext ctx) {
        return promisedFIR.promiseFunction(
               visitFunction_specifier(ctx.function_specifier()),
               visitType_name(ctx.type_name()),
               visitNamspce_obj(ctx.namspce_obj()),
               visitFun_name(ctx.fun_name()),
               visitFunc_args(ctx.func_args()),
               visitBraced_element(ctx.braced_element()));
    }

    @Override
    public Object visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx) {
        if(ctx == null) return null;
        return promisedFIR.declareNamespace(ctx.ID().stream().map(this::visitId));
    }

    @Override
    public Promise visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx) {
        if(ctx == null) return null;
        return promisedFIR.promiseMethodCall(
                visitNamspce_obj(ctx.namspce_obj()),
                visitClass_name(ctx.class_name()),
                visitFunction_call(ctx.function_call()));
    }

    @Override
    public Promise visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {
        if(ctx == null) return null;
        return promisedFIR.promiseFunctionCall(
                visitFun_name(ctx.fun_name()),
                visitParened_expr_list(ctx.parened_expr_list()));
    }
    @Override
    public Promise visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx) {
        if(!ctx.function_call().isEmpty())
            return visitFunction_call(ctx.function_call());
        if(!ctx.member_name().isEmpty())
            return visitMember_name(ctx.member_name());
        return null;
    }
    @Override
    public Promise visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx) {
        return promisedFIR.promiseFunctionCall_(
                visitMethod_call(ctx.method_call()),
                visitFunction_call(ctx.function_call()),
                ctx.function_call_helper().stream().map(this::visitFunction_call_helper));
    }

    @Override
    public Promise visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx) {
        return promisedFIR.promiseGetMember(
                visitId(ctx.ID()),
                visitMember_name(ctx.member_name()));
    }

    @Override
    public Promise visitExpr(langosWithoutSyntaxParser.ExprContext ctx) {
        if(ctx == null) return null;
        if(!ctx.return_expr().isEmpty())
           return visitReturn_expr(ctx.return_expr());
       if(ctx.BREAK().getText() != "")
           return promisedFIR.promiseBreak();
       if(ctx.CONTINUE().getText() != "")
           return promisedFIR.promiseContinue();
        if(!ctx.function_call_().isEmpty())
            return visitFunction_call_(ctx.function_call_());
        if(!ctx.lambda().isEmpty())
            return visitLambda(ctx.lambda());
        if(!ctx.get_member().isEmpty())
            return visitGet_member(ctx.get_member());
        if(ctx.ID().getText() != "")
            return visitId(ctx.ID());
        return null;
    }

    @Override
    public Promise visitLambda(langosWithoutSyntaxParser.LambdaContext ctx) {
       return promisedFIR.promiseLambda (
               visitParened_id_list(ctx.parened_id_list()),
               visitBraced_element(ctx.braced_element()),
               visitExpr(ctx.expr()));
    }


    @Override
    public Promise visitElement(langosWithoutSyntaxParser.ElementContext ctx) {
        if(!ctx.function().isEmpty())
            return visitFunction(ctx.function());
        if(!ctx.expr().isEmpty())
            return visitExpr(ctx.expr());
        return null;
    }

    @Override
    public Promise visitProgram(langosWithoutSyntaxParser.ProgramContext ctx) {
        return promisedFIR.promiseProgram(
            ctx.import_().stream().map(this::visitImport_),
            ctx.element().stream().map(this::visitElement));
    }

    @Override
    public Promise visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx) {
        return visitProgram(ctx.program());
    }

    @Override
    public Promise visitId_list(langosWithoutSyntaxParser.Id_listContext ctx) {
        return promisedFIR.promiseIds(ctx.ID().stream().map(this::visitId));
    }

    @Override
    public Promise visitImport_(langosWithoutSyntaxParser.Import_Context ctx) {
        return promisedFIR.promiseImport(ctx.ID().stream().map(this::visitId));
    }

    @Override
    public Object visitFunction_specifier(langosWithoutSyntaxParser.Function_specifierContext ctx) {
        if(ctx == null) return null;
        return null;
    }

    @Override
    public Promise visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx) {
        return promisedFIR.promiseReturn(visitExpr(ctx.expr()));
    }

    @Override
    public Stream<Promise> visitParened_expr_list(langosWithoutSyntaxParser.Parened_expr_listContext ctx) {
        return visitExpr_list(ctx.expr_list());
    }

    @Override
    public Promise visitParened_id_list(langosWithoutSyntaxParser.Parened_id_listContext ctx) {
        return visitId_list(ctx.id_list());
    }

    @Override
    public Promise visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx) {
        return visitId(ctx.ID());
    }

    private Promise visitId(TerminalNode id) {//TODO
        return promisedFIR.promiseId(id.getText());
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
    public Promise visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx) {
        return visitId(ctx.ID());
    }

    @Override
    public Promise visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx) {
        return visitId(ctx.ID());
    }

    @Override
    public Promise visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx) {
        if(ctx == null) return null;
        return visitId(ctx.ID());
    }

    @Override
    public Promise visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx) {
        return visitId(ctx.ID());
    }

    @Override
    public Stream<Promise> visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx) {
        if(ctx == null) return null;
        return ctx.element().stream().map(this::visitElement);
    }

    @Override
    public Stream<Promise> visitExpr_list(langosWithoutSyntaxParser.Expr_listContext ctx) {
        return ctx.expr().stream().map(this::visitExpr);
    }

}
