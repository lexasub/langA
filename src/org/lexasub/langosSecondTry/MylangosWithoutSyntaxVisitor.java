package org.lexasub.langosSecondTry;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langosSecondTry.utils.IdGenerator;
import org.lexasub.langosSecondTry.utils.Promise;

import java.util.function.Function;
import java.util.stream.Stream;

public class MylangosWithoutSyntaxVisitor implements langosWithoutSyntaxVisitor {
    //TODO поменять namespace вызовы, добавить вхождение в новую область видимости//MB OK
    //TODO напихать addSubNamespace в разные места//MB OK
    //TODO promising all(addWaiter)

    @Override
    public Function visitFun_name(langosWithoutSyntaxParser.Fun_nameContext ctx) {
        if (ctx == null) return null;
        if(!ctx.IF().getText().isEmpty())
            return FunctionGenerators.ifGenerator();
        if(!ctx.WHILE().getText().isEmpty())
            return FunctionGenerators.whileGenerator();
        if(!ctx.PAIRMAP().getText().isEmpty())
            return FunctionGenerators.pairMapGenerator();
        if(!ctx.MAP().getText().isEmpty())
            return FunctionGenerators.mapGenerator();
        if(!ctx.ID().getText().isEmpty())//may be add ids.table.addfuntotable..
            return FunctionGenerators.userFunGenerator(ctx.ID().getText());
        return null;
    }
    public Promise visitFunction(langosWithoutSyntaxParser.FunctionContext ctx, Promise _nmspace) {
        Promise id = visitId(ctx.ID(), _nmspace);
        String _id = ctx.ID().getText();
        //id or _id?
        Promise nmspaceFunction = _nmspace.addWaiter(i -> ((ClassNamespace)i).addSubNamespace(_id, ClassNamespace.Type.function));
        Stream<Promise> type_names = ctx.func_args().type_name().stream().map(
                i -> visitType_name(i, nmspaceFunction)
        );
        Stream<Promise> var_names = ctx.func_args().var_name().stream().map(
                i -> visitVar_name(i, nmspaceFunction)
        );
        return PromisedFIR.promiseFunction(
               visitFunction_specifier(ctx.function_specifier(), _nmspace),
               visitType_name(ctx.type_name(), _nmspace),
               id, type_names, var_names,
               visitBraced_element(ctx.braced_element(), nmspaceFunction),
               nmspaceFunction
        );
    }

    public Promise visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        return PromisedFIR.declareNamespace(
                ctx.ID().stream().map(i->visitId(i, nmspace)),
                nmspace
        );
    }

    public Promise visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        Promise nmspace1 = visitNamspce_obj(ctx.namspce_obj(), nmspace);
        Promise className = visitClass_name(ctx.class_name(), nmspace);
        return PromisedFIR.promiseMethodCall(
                (nmspace1 != null) ? nmspace1 :
                className.addWaiter(i ->((ClassID) i).np),
                visitFunction_call(ctx.function_call()),nmspace);
    }

    public Promise visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        return PromisedFIR.promiseFunctionCall(
                visitFun_name(ctx.fun_name()),
                visitParened_expr_list(ctx.parened_expr_list(), nmspace),
                nmspace);
    }
    public Promise visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx,
                                             Promise nmspace) {
        if(!ctx.function_call().isEmpty())
            return visitFunction_call(ctx.function_call(), nmspace);
        if(!ctx.member_name().isEmpty())
            return visitMember_name(ctx.member_name(), nmspace);
        return null;
    }
    public Promise visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx, Promise nmspace) {
        return PromisedFIR.promiseFunctionCall_(
                visitMethod_call(ctx.method_call(), nmspace),
                visitFunction_call(ctx.function_call(), nmspace),
                ctx.function_call_helper().stream().map(i->visitFunction_call_helper(i, nmspace)));
    }

    public Promise visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx, Promise nmspace) {
        return PromisedFIR.promiseGetMember(
                visitId(ctx.ID(), nmspace),
                visitMember_name(ctx.member_name(), nmspace),
                nmspace);
    }

    public Promise visitExpr(langosWithoutSyntaxParser.ExprContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        if(!ctx.return_expr().isEmpty())
           return visitReturn_expr(ctx.return_expr(), nmspace);
        if(!ctx.BREAK().getText().isEmpty())
           return PromisedFIR.promiseBreak(nmspace);
        if(!ctx.CONTINUE().getText().isEmpty())
           return PromisedFIR.promiseContinue(nmspace);
        if(!ctx.function_call_().isEmpty())
            return visitFunction_call_(ctx.function_call_(), nmspace);
        if(!ctx.lambda().isEmpty())
            return visitLambda(ctx.lambda(), nmspace);
        if(!ctx.get_member().isEmpty())
            return visitGet_member(ctx.get_member(), nmspace);
        if(!ctx.ID().getText().isEmpty())
            return visitId(ctx.ID(), nmspace);
        return null;
    }

    public Promise visitLambda(langosWithoutSyntaxParser.LambdaContext ctx, Promise nmspace) {
        String lambdaName = IdGenerator.lambda();
        nmspace.addWaiter(i -> ((ClassNamespace)i).addSubNamespace(lambdaName, ClassNamespace.Type.lambda));
        Promise lambdaNamespace = nmspace.addWaiter(i -> ((ClassNamespace) i).findSubNamespace(lambdaName).get());
        Promise args = visitParened_id_list(
                ctx.parened_id_list(),
                lambdaNamespace
        );
        if(ctx.braced_element() != null)//lambda with one expr
            return PromisedFIR.promiseSimpleLambda (
                    args,
                    visitExpr(
                            ctx.expr(),
                            lambdaNamespace
                    ),
                    lambdaNamespace
            );
       return PromisedFIR.promiseLambda (
               args,
               visitBraced_element(ctx.braced_element(),
                       lambdaNamespace),
               lambdaNamespace
       );
    }


    public Promise visitElement(langosWithoutSyntaxParser.ElementContext ctx, Promise nmspace) {
        if(!ctx.function().isEmpty())
            return visitFunction(ctx.function(), nmspace);
        if(!ctx.expr().isEmpty())
            return visitExpr(ctx.expr(), nmspace);
        return null;
    }
    public Promise visitElement(langosWithoutSyntaxParser.ElementContext ctx, ClassNamespace _nmspace) {
        Promise nmspace = Promise.add(() -> _nmspace);
        if(!ctx.function().isEmpty())
            return visitFunction(ctx.function(), nmspace);
        if(!ctx.expr().isEmpty())
            return visitExpr(ctx.expr(), nmspace);
        return null;
    }

    public Promise visitClass_(langosWithoutSyntaxParser.Class_Context ctx, ClassNamespace nmspace) {//TODO entrypoint for class
        /*return PromisedFIR.promiseClass(visitClass_name(ctx.class_name(), nmspace),
                visitBraced_element(ctx.braced_element(),
                nmspace.addSubNamespace(ctx.class_name().getText(), ClassNamespace.Type.class_)));
                */
        return null;
    }

    public Promise visitProgram(langosWithoutSyntaxParser.ProgramContext ctx, ClassNamespace nmspace) {
        return PromisedFIR.promiseProgram(
            ctx.import_().stream().map(i->visitImport_(i,nmspace)),
            ctx.element().stream().map(i->visitElement(i,nmspace)));
    }

    public Promise visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx, ClassNamespace nmspace) {
        return visitProgram(ctx.program(), nmspace);
    }

    public Promise visitId_list(langosWithoutSyntaxParser.Id_listContext ctx, Promise nmspace) {
        return PromisedFIR.promiseIds(ctx.ID().stream().map(i->visitId(i, nmspace)));
    }

    public Promise visitImport_(langosWithoutSyntaxParser.Import_Context ctx, ClassNamespace nmspace) {
        return PromisedFIR.promiseImport(ctx.ID().stream().map(i->visitId(i, nmspace)));
    }

    public Object visitFunction_specifier(langosWithoutSyntaxParser.Function_specifierContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        return null;
    }

    public Promise visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx, Promise nmspace) {
        return PromisedFIR.promiseReturn(visitExpr(ctx.expr(), nmspace), nmspace);
    }

    public Stream<Promise> visitParened_expr_list(langosWithoutSyntaxParser.Parened_expr_listContext ctx,
                                                  Promise nmspace) {
        return visitExpr_list(ctx.expr_list(), nmspace);
    }

    public Promise visitParened_id_list(langosWithoutSyntaxParser.Parened_id_listContext ctx, Promise nmspace) {
        return visitId_list(ctx.id_list(), nmspace);
    }

    public Promise visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx, ClassNamespace nmspace) {
        return visitId(ctx.ID(), nmspace);
    }
    private Promise visitId(TerminalNode id, Promise nmspace) {//TODO??
        return PromisedFIR.promiseId(id.getText(), nmspace);
    }

    private Promise visitId(TerminalNode id, ClassNamespace nmspace) {//TODO??
        return PromisedFIR.promiseId(id.getText(), Promise.add(() -> nmspace));
    }

   public Promise visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx, Promise nmspace) {
        return visitId(ctx.ID(), nmspace);
    }

    public Promise visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx, Promise nmspace) {
        return visitId(ctx.ID(), nmspace);
    }

    public Promise visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx, Promise nmspace) {
        if(ctx == null) return null;

        return visitId(ctx.ID(), nmspace);
    }
    public Promise visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx, ClassNamespace nmspace) {
        if(ctx == null) return null;
        return visitId(ctx.ID(), nmspace);
    }

    public Promise visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx, Promise nmspace) {
        return visitId(ctx.ID(), nmspace);
    }

    public Stream<Promise> visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        return ctx.element().stream().map(
                i->visitElement(i, nmspace.addWaiter(
                        j -> ((ClassNamespace)j).addSubNamespace(IdGenerator.element(), ClassNamespace.Type.brace)))
        );
    }

    public Stream<Promise> visitExpr_list(langosWithoutSyntaxParser.Expr_listContext ctx, Promise nmspace) {
        return ctx.expr().stream().map(i->visitExpr(i, nmspace));
    }

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
    public Object visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {
        return null;
    }

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
    public Object visitId_list(langosWithoutSyntaxParser.Id_listContext ctx) {
        return null;
    }

    @Override
    public Object visitParened_expr_list(langosWithoutSyntaxParser.Parened_expr_listContext ctx) {
        return null;
    }

    @Override
    public Object visitParened_id_list(langosWithoutSyntaxParser.Parened_id_listContext ctx) {
        return null;
    }

    @Override
    public Object visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx) {
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

}
