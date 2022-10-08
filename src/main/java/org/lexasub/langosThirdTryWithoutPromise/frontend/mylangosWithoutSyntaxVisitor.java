package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.utils.PairString;

import java.util.function.Function;
import java.util.stream.Stream;

public class mylangosWithoutSyntaxVisitor extends mylangosWithoutSyntaxVisitorBase{


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
    public String visitFunc_args(langosWithoutSyntaxParser.Func_argsContext ctx) {
        //TODO
        Stream<String> s1 = ctx.type_name().stream().map(this::visitType_name);
        Stream<String> s2 = ctx.var_name().stream().map(this::visitVar_name);
        //пока забъем на типы
        return s2.map(Asm::getArg).reduce("", String::concat);
    }



    @Override
    public String visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx) {
        return ctx.element().stream().map(this::visitElement).reduce("", String::concat);//mb не совсем верно
    }

    @Override
    public String visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx) {
        String regName = IdGenerator.reg();
        if (ctx.member_name() == null) return visitFunction_call(ctx.function_call());
        String res = Asm.MOVMEMBER(regName, visitMember_name(ctx.member_name()));
        return new PairString(res, regName).a;//std::kostyl
    }

    @Override
    public String visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx) {
        String res = Asm.intoScope(visitClass_name(ctx.class_name()));
        String regName = IdGenerator.reg();
        res += Asm.MOVMEMBER(regName, visitMember_name(ctx.member_name()));
        res += Asm.outofScope();
        return new PairString(res, regName).a;//std::kostyl
        /*
         * INTOSCOPE myclass1
         * MOVMEMBER r0, name // ~mov r0,myclass1.name
         * */
    }


    public String visitExprPart(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.with_() != null) return visitWith_(ctx.with_());
        if (ctx.flow_control() != null) return visitFlow_control(ctx.flow_control());
        if (ctx.function_call_() != null) return visitFunction_call_(ctx.function_call_());
        if (ctx.class_() != null) return visitClass_(ctx.class_());
        if (ctx.get_member() != null) return visitGet_member(ctx.get_member());
        return null;
    }

    public String visitExprLambda(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.ID() != null) return Asm.setArg(visitid2(ctx.ID()));
        if (ctx.lambda() == null) return visitExprPart(ctx);
        PairString l = visitLambda_(ctx.lambda());
        return l.a + Asm.setArg(l.b);//sometimes CALL, sometimes setArg()??
    }

    public String visitExprReturn(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.ID() != null) return Asm.setArg(visitid2(ctx.ID()));
        if (ctx.lambda() == null) return visitExprPart(ctx);
        PairString l = visitLambda_(ctx.lambda());
        return l.a + Asm.setArg(l.b);//sometimes CALL, sometimes setArg()??
    }
    @Override
    public String visitExpr(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.ID() != null) return visitid2(ctx.ID()) + "\n";
        if (ctx.lambda() == null) return visitExprPart(ctx);
        PairString l = visitLambda_(ctx.lambda());
        return l.a + Asm.setArg(l.b);//sometimes CALL, sometimes setArg()??
    }

    public Object visitExprFuncall(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.ID() != null) return Asm.setArg(visitid2(ctx.ID()));
        if (ctx.lambda() == null) return visitExprPart(ctx);
        return visitLambda_(ctx.lambda());
    }

    public PairString visitLambda_(langosWithoutSyntaxParser.LambdaContext ctx) {
        Stream<String> s1 = null;
        if (ctx.parened_id_list().id_list() != null)
            s1 = ctx.parened_id_list().id_list().ID().stream().map(this::visitid2);
        String s2 = (ctx.expr() != null)
                ? visitExprLambda(ctx.expr())
                : visitBraced_element(ctx.braced_element());
        return Asm.createLambda(s1, s2);
    }

    @Override
    public String visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {
        Stream<Object> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExprFuncall);
        return visitFun_name(ctx.fun_name(), args) + Asm.intoScope(ctx.fun_name().getText()) ;//TODO may be error, if exist member(not method call)
    }

    @Override
    public String visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx) {
        if (ctx.namspce_obj() != null) {
            return visitNamspce_obj(ctx.namspce_obj()) + visitFunction_call(ctx.function_call());
        }
        String cn = Asm.intoScope(visitClass_name(ctx.class_name()));//TODO check cn == INTOSCOPE ClassName
        //чуваки которые в functionCall сами должны свои скопы закрывать
        return cn + visitFunction_call(ctx.function_call())/* + Asm.outofScope()*/;
    }

    @Override
    public String visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx) {
        int intoScopeCounts;
        if (ctx.method_call() == null) intoScopeCounts = 1; //f() -> intoscope(f)
        else {
            if (ctx.method_call().namspce_obj() != null)
                intoScopeCounts = ctx.method_call().namspce_obj().ID().size() + 1;//s::s::s.d -> intoscope x n+1
            else intoScopeCounts = 2;//s.d() -> intoscope(s,d)
        }
        String s = (ctx.method_call() != null)
                ? visitMethod_call(ctx.method_call())
                : visitFunction_call(ctx.function_call());
        String functionCalls = ctx.function_call_helper().stream().map(i -> visitFunction_call_helper(i)
                        +((i.member_name() != null)
                        ?Asm.intoScope(i.member_name().getText()) :""))
                .reduce("", String::concat);
        return s + functionCalls + Asm.outofScope().repeat(ctx.function_call_helper().size()+
                        intoScopeCounts);// + Asm.outofScope().repeat(ctx.function_call_helper().size())
    }
    @Override
    public String visitDeclare_member(langosWithoutSyntaxParser.Declare_memberContext ctx) {

        visitType_name(ctx.type_name());
        visitVar_name(ctx.var_name());
        //MEMBER type, name ???
    }
    @Override
    public String visitClass_(langosWithoutSyntaxParser.Class_Context ctx) {
        return Asm.createClass(visitClass_name(ctx.class_name()),
                ctx.declare_member().stream().map(this::visitDeclare_member).reduce("", String::concat) + //mb не совсем верно;
                     ctx.element().stream().map(this::visitElement).reduce("", String::concat)
        );
    }

    public String visitFun_name(langosWithoutSyntaxParser.Fun_nameContext funname, Stream<Object> args) {
        Function funGen = selectFunction(funname);
        return (String) funGen.apply(args);
    }

    @Override
    public String visitFlow_control(langosWithoutSyntaxParser.Flow_controlContext ctx) {
        if (ctx.return_expr() != null) return visitReturn_expr(ctx.return_expr());
        if (ctx.BREAK() != null) return Asm.BREAK();
        if (ctx.CONTINUE() != null) return Asm.CONTINUE();
        return null;
    }

    @Override
    public String visitReturn_expr(langosWithoutSyntaxParser.Return_exprContext ctx) {
        return visitExprReturn(ctx.expr()) +
                //Asm.setArgLastRes() +//TODO вроде не нужен
                Asm.RET(); //TODO check//RETURN или RET
    }

    @Override
    public String visitWith_(langosWithoutSyntaxParser.With_Context ctx){
        String expr = visitExpr(ctx.parened_expr().expr());
        String id = visitWith_synonym(ctx.with_synonym());
        Stream<String> bodys = ctx.with_body().stream().map(ctx1 -> visitExpr(ctx1.expr()));
        return expr + Asm.getArg(id) + bodys.map(i -> i + "\n").reduce("", String::concat);
    }

    @Override
    public String visitWith_synonym(langosWithoutSyntaxParser.With_synonymContext ctx){
        return visitid2(ctx.ID());
    }
}
