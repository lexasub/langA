package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.lexasub.langosSecondTry.langosWithoutSyntaxBaseVisitor;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;
import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

class PairString extends org.antlr.v4.runtime.misc.Pair<String, String> {//заглушка против java

    public PairString(String s, String s2) {
        super(s, s2);
    }
}

public class mylangosWithoutSyntaxVisitor extends langosWithoutSyntaxBaseVisitor<String> {

    private static Function selectFunction(langosWithoutSyntaxParser.Fun_nameContext funname) {
        if (funname.IF() != null)
            return FunctionGenerators.ifGenerator();
        if (funname.WHILE() != null)
            return FunctionGenerators.whileGenerator();
        if (funname.PAIRMAP() != null)
            return FunctionGenerators.pairMapGenerator();
        if (funname.MAP() != null)
            return FunctionGenerators.mapGenerator();
        if (funname.ID() != null)//may be add ids.table.addfuntotable..//TODO?
            return FunctionGenerators.userFunGenerator(funname.ID().getText());
        return null;
    }

    @Override
    public String visitProgram(langosWithoutSyntaxParser.ProgramContext ctx) {
        if (ctx.import_() != null) return visitImport_(ctx.import_());
        return visitElement(ctx.element());
    }

    @Override
    public String visitEntry_point(langosWithoutSyntaxParser.Entry_pointContext ctx) {
        return ctx.program().stream().map(this::visitProgram).reduce("", String::concat);
    }

    @Override
    public String visitImport_(langosWithoutSyntaxParser.Import_Context ctx) {
        return Asm.IMPORT(ctx.ID().stream().map(this::visitid2));
    }

    @Override
    public String visitElement(langosWithoutSyntaxParser.ElementContext ctx) {
        return (ctx.function() != null)
                ? visitFunction(ctx.function())
                : visitExpr(ctx.expr());
    }

    @Override
    public String visitFunction(langosWithoutSyntaxParser.FunctionContext ctx) {
        return Asm.createFunction(visitType_name(ctx.type_name()),
                visitVar_name(ctx.var_name()),
                visitFunc_args(ctx.func_args()),
                visitBraced_element(ctx.braced_element()));
    }

    @Override
    public String visitType_name(langosWithoutSyntaxParser.Type_nameContext ctx) {
        return visitid(ctx.ID());
    }

    @Override
    public String visitClass_name(langosWithoutSyntaxParser.Class_nameContext ctx) {
        return Asm.intoScope(visitid2(ctx.ID()));
    }

    @Override
    public String visitVar_name(langosWithoutSyntaxParser.Var_nameContext ctx) {
        return visitid2(ctx.ID());
    }

    @Override
    public String visitMember_name(langosWithoutSyntaxParser.Member_nameContext ctx) {
        return visitid(ctx.ID());
    }

    @Override
    public String visitFunc_args(langosWithoutSyntaxParser.Func_argsContext ctx) {
        //TODO
        Stream<String> s1 = ctx.type_name().stream().map(this::visitType_name);
        Stream<String> s2 = ctx.var_name().stream().map(this::visitVar_name);
        //пока забъем на типы
        return s2.map(Asm::getArg).reduce("", String::concat);
    }

    @Override
    public String visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx) {
        return ctx.ID().stream().map(this::visitid2).map(Asm::intoScope).reduce("", String::concat);
    }

    @Override
    public String visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx) {
        return ctx.element().stream().map(this::visitElement).reduce("", String::concat);//mb не совсем верно
    }

    @Override
    public String visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx) {
        return (ctx.member_name() != null)
                ? visitMember_name(ctx.member_name())
                : visitFunction_call(ctx.function_call());
    }

    @Override
    public String visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx) {
        String res = visitClass_name(ctx.class_name());
        String regName = IdGenerator.reg();
        res += Asm.MOVMEMBER(regName, visitMember_name(ctx.member_name()));
        return new PairString(res, regName).a;//std::kostyl
        /*
         * INTOSCOPE myclass1
         * MOVMEMBER r0, name // ~mov r0,myclass1.name
         * */
    }

    public String visitid(TerminalNode s) {
        return visitid("ID " + s.getText() + "\n");
    }

    public String visitid2(TerminalNode s) {
        return visitid(s.getText());
    }

    public String visitid(String s) {
        return s;//TODO
    }

    public String visitExprPart(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.flow_control() != null) return visitFlow_control(ctx.flow_control());
        if (ctx.function_call_() != null) return visitFunction_call_(ctx.function_call_());
        if (ctx.get_member() != null) return visitGet_member(ctx.get_member());
        if (!Objects.equals(ctx.ID().getText(), "")) return visitid2(ctx.ID()) + "\n";
        return null;
    }

    @Override
    public String visitExpr(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.lambda() != null) return visitLambda_(ctx.lambda()).a;
        return visitExprPart(ctx);
    }

    public Object visitExprFuncall(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.lambda() == null) return visitExprPart(ctx);
        return visitLambda_(ctx.lambda());
    }

    public PairString visitLambda_(langosWithoutSyntaxParser.LambdaContext ctx) {
        Stream<String> s1 = null;
        if (ctx.parened_id_list().id_list() != null)
            s1 = ctx.parened_id_list().id_list().ID().stream().map(this::visitid);
        String s2 = (ctx.expr() != null)
                ? visitExpr(ctx.expr())
                : visitBraced_element(ctx.braced_element());
        return Asm.createLambda(s1, s2);
    }

    @Override
    public String visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {
        Stream<Object> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExprFuncall);
        return visitFun_name(ctx.fun_name(), args);
    }

    @Override
    public String visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx) {
        if (ctx.namspce_obj() != null) {
            return visitNamspce_obj(ctx.namspce_obj()) + visitFunction_call(ctx.function_call());
        }
        String cn = visitClass_name(ctx.class_name());//TODO check cn == INTOSCOPE ClassName
        return cn + visitFunction_call(ctx.function_call());
    }

    @Override
    public String visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx) {
        String functionCalls = ctx.function_call_helper().stream().map(this::visitFunction_call_helper)
                .reduce("", String::concat);
        if (ctx.method_call() != null) {
            return visitMethod_call(ctx.method_call()) + functionCalls;
        }
        return visitFunction_call(ctx.function_call()) + functionCalls;
    }

    public String visitFun_name(langosWithoutSyntaxParser.Fun_nameContext funname, Stream<Object> args) {
        Function funGen = selectFunction(funname);
        return (String) funGen.apply(args);
    }

    @Override
    public String visitFlow_control(langosWithoutSyntaxParser.Flow_controlContext ctx) {
        if (ctx.return_expr() != null) return visitReturn_expr(ctx.return_expr());
        if (!Objects.equals(ctx.BREAK().getText(), "")) return Asm.BREAK();
        if (!Objects.equals(ctx.CONTINUE().getText(), "")) return Asm.CONTINUE();
        return null;
    }

    @Override
    public String visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx) {
        return visitExpr(ctx.expr()) +
                Asm.setArgLastRes() +
                Asm.RETURN();
    }

    @Override
    public String visitId_strong(langosWithoutSyntaxParser.Id_strongContext ctx) {
        return visitid(ctx.ID());
    }

    @Override
    public String visitClass_(langosWithoutSyntaxParser.Class_Context ctx) {
        return null;
    }
}
