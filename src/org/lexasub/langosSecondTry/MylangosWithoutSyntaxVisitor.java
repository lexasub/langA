package org.lexasub.langosSecondTry;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langosSecondTry.utils.IdGenerator;
import org.lexasub.langosSecondTry.utils.Promise;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MylangosWithoutSyntaxVisitor implements langosWithoutSyntaxVisitor {
    //T ODO поменять namespace вызовы, добавить вхождение в новую область видимости//MB OK
    //T ODO напихать addSubNamespace в разные места//MB OK
    //T ODO promising all(addWaiter)//MB OK

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
        if(!ctx.ID().getText().isEmpty())//may be add ids.table.addfuntotable..//TODO?
            return FunctionGenerators.userFunGenerator(ctx.ID().getText());
        return null;
    }
    public Promise visitFunction(langosWithoutSyntaxParser.FunctionContext ctx, Promise _nmspace) {
        Promise id = visitId(ctx.ID(), _nmspace);
        String _id = ctx.ID().getText();
        Promise nmspaceFunction = _nmspace.addWaiter(i -> ((Scope)i).addSubScope(_id, Scope.Type.function));
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
        return PromisedFIR.declareNamespace(
                ctx.ID().stream().map(i->visitId(i, nmspace)),
                nmspace
        );
    }

    public Promise visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx, Promise nmspace) {
        return PromisedFIR.promiseMethodCall(
                (ctx.namspce_obj() != null)
                        ?visitNamspce_obj(ctx.namspce_obj(), nmspace)//Scope
                        :visitClass_name(ctx.class_name(), nmspace),//Scope
                visitFunction_call(ctx.function_call(), nmspace),nmspace);//Scope.asm
        //Scope.asm
    }

    public Promise visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        return PromisedFIR.promiseFunctionCall(
                visitFun_name(ctx.fun_name()),
                visitParened_expr_list(ctx.parened_expr_list(), nmspace),
                nmspace);
        //Scope.asm
    }
    public Promise visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx,
                                             Promise nmspace) {
        if(!ctx.function_call().isEmpty())
            return visitFunction_call(ctx.function_call(), nmspace);//Scope
        if(!ctx.member_name().isEmpty())
            return visitMember_name(ctx.member_name(), nmspace);//Scope
        //if is member - mov address->rtmp0
        return null;
    }
    public Promise visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx, Promise nmspace) {
        Promise nmspace2 = (ctx.method_call() != null)
                ? visitMethod_call(ctx.method_call(), nmspace)
                : visitFunction_call(ctx.function_call(), nmspace);//Scope
        // (method_call | function_call) (DOT function_call_helper)* ;
        //if method_call -> namespace (.asm = asm)
        //if function_call -> namespace (.asm = asm)
        Stream<Promise> pr_stream = ctx.function_call_helper().stream().map(i ->
                visitFunction_call_helper(i, nmspace2).addWaiter(j ->
                        (((Scope) j).type == Scope.Type.id) ?
                                Asm.setArg("r231") :
                                ((Scope) j).asm)
        );
        Promise pr = Promise.add(() ->
                pr_stream.map(i -> (String)i.get()).collect(Collectors.joining(""))
        );
        //change  r231 to ~~ ClassID.planedregister
        /*
        concat nmspace2, pr
        INTOSCOPE ..
        push r3
        call eee
        push r4
        push r5
        call tww
        push r9
        push r8
        call rewr
         */
        return PromisedFIR.promiseFunctionCall_(
                nmspace2,
                pr);
    }

    public Promise visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx, Promise nmspace) {
        return PromisedFIR.promiseGetMember(
                visitId(ctx.ID(), nmspace),
                visitMember_name(ctx.member_name(), nmspace),//Scope
                nmspace);
    }

    public Promise visitFlow_control(langosWithoutSyntaxParser.Flow_controlContext ctx, Promise nmspace) {
        if(!ctx.return_expr().isEmpty())
            return visitReturn_expr(ctx.return_expr(), nmspace);
        if(!ctx.BREAK().getText().isEmpty())
            return PromisedFIR.promiseBreak(nmspace);
        if(!ctx.CONTINUE().getText().isEmpty())
            return PromisedFIR.promiseContinue(nmspace);
        return null;
    }

    public Promise visitExpr(langosWithoutSyntaxParser.ExprContext ctx, Promise nmspace) {
        if(ctx == null) return null;

        if(!ctx.flow_control().isEmpty())
            return visitFlow_control(ctx.flow_control(), nmspace);
        if(!ctx.function_call_().isEmpty())//String(ASM)
            return visitFunction_call_(ctx.function_call_(), nmspace);
        if(!ctx.lambda().isEmpty())//ClassLambda//TODO
            return visitLambda(ctx.lambda(), nmspace).addWaiter(i -> ((ClassLambda)i).np);
        if(!ctx.get_member().isEmpty())//ClassClass//TODO
            return visitGet_member(ctx.get_member(), nmspace).addWaiter(i -> ((ClassClass)i).np);
        if(!ctx.ID().getText().isEmpty())//Scope
            return visitId(ctx.ID(), nmspace);
        return null;
    }

    public Promise visitLambda(langosWithoutSyntaxParser.LambdaContext ctx, Promise nmspace) {
        String lambdaName = IdGenerator.lambda();
        nmspace.addWaiter(i -> ((Scope)i).addSubScope(lambdaName, Scope.Type.lambda));
        Promise lambdaNamespace = nmspace.addWaiter(i -> ((Scope) i).findSubNamespace(lambdaName).get());
        Promise args = visitParened_id_list(
                ctx.parened_id_list(),
                lambdaNamespace
        );
        if(ctx.expr() != null)//lambda with one expr
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
    public Promise visitElement(langosWithoutSyntaxParser.ElementContext ctx, Scope _nmspace) {
        return visitElement(ctx, Promise.add(() -> _nmspace));
    }

    public Promise visitClass_(langosWithoutSyntaxParser.Class_Context ctx, Scope nmspace) {//TODO entrypoint for class
        /*return PromisedFIR.promiseClass(visitClass_name(ctx.class_name(), nmspace),
                visitBraced_element(ctx.braced_element(),
                nmspace.addSubNamespace(ctx.class_name().getText(), ClassNamespace.Type.class_)));
                */
        return null;
    }

    public Stream<Promise> visitProgram(langosWithoutSyntaxParser.ProgramContext ctx, Scope nmspace) {
        return PromisedFIR.promiseProgram(
            ctx.import_().stream().map(i->visitImport_(i,nmspace)),
            ctx.element().stream().map(i->visitElement(i,nmspace)));
    }

    public Stream<Promise> visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx, Scope nmspace) {
        return visitProgram(ctx.program(), nmspace);
    }

    public Promise visitId_list(langosWithoutSyntaxParser.Id_listContext ctx, Promise nmspace) {
        return PromisedFIR.promiseIds(ctx.ID().stream().map(i->visitId(i, nmspace)));
    }

    public Promise visitImport_(langosWithoutSyntaxParser.Import_Context ctx, Scope nmspace) {
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

    public Promise visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx, Scope nmspace) {
        return visitId(ctx.ID(), nmspace);
    }
    private Promise visitId(TerminalNode id, Promise nmspace) {//->Scope.obj (ClassID)
        return PromisedFIR.promiseId(id.getText(), nmspace);
    }

    private Promise visitId(TerminalNode id, Scope nmspace) {
        return visitId(id, Promise.add(() -> nmspace));
    }

   public Promise visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx, Promise nmspace) {
        return visitId(ctx.ID(), nmspace);
    }

    public Promise visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx, Promise nmspace) {
        return visitId(ctx.ID(), nmspace);
    }

    public Promise visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        Promise pr = visitId(ctx.ID(), nmspace);
        //pr.addWaiter(i -> ((Scope)i).type = Scope.Type.class_);mb ??
        return pr;
    }
    public Promise visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx, Scope nmspace) {
        if(ctx == null) return null;
        return visitId(ctx.ID(), nmspace);
    }

    public Promise visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx, Promise nmspace) {
        return visitId(ctx.ID(), nmspace);
    }

    public Stream<Promise> visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx, Promise nmspace) {
        if(ctx == null) return null;
        Promise nmspace1 = nmspace.addWaiter(
                j -> ((Scope) j).addSubScope(IdGenerator.element(), Scope.Type.brace));
        return ctx.element().stream().map(
                i-> visitElement(i, nmspace1)
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
