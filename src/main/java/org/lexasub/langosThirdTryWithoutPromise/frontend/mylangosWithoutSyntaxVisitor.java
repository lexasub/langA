package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.lexasub.langosThirdTryWithoutPromise.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.utils.PairString;

import java.util.Iterator;
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

    public PairString visitFunction_call_helper_method(langosWithoutSyntaxParser.Function_call_helper_methodContext ctx, String regName_in) {//TODO
        String regName = IdGenerator.reg();
        if (ctx.member_name() != null) {
            String member = Asm.GET_ELEMENT_PTR(regName, regName_in, ctx.member_name().ID().getText());
            return new PairString(member, regName);
        }
        String member = Asm.GET_ELEMENT_PTR(regName, regName_in, ctx.function_call3().fun_name().getText());
        String outRegName = IdGenerator.reg();
        //ctx.function_call3().fun_name().getText()
        return new PairString(member+visitFunction_call3(ctx.function_call3(), regName,outRegName),outRegName);
    }

    @Override
    public String visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx) {
        if (ctx.member_name() == null) return visitFunction_call(ctx.function_call());
        String regName = IdGenerator.reg();
        String res = Asm.MOVMEMBER(regName, visitMember_name(ctx.member_name()));
        return new PairString(res, regName).a;//std::kostyl
    }
    @Override
    public String visitGet_member(langosWithoutSyntaxParser.Get_memberContext ctx) {
        String regName = IdGenerator.reg();
        String res = "";
        res += Asm.GET_ELEMENT_PTR(regName, visitClass_name(ctx.class_name()), visitMember_name(ctx.member_name()));
        res += Asm.setArg(regName);
        /*res += Asm.intoScope(visitClass_name(ctx.class_name()));
        res += Asm.MOVMEMBER(regName, visitMember_name(ctx.member_name()));
        res += Asm.outofScope();*/
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
    public String visitFunction_call2(langosWithoutSyntaxParser.Function_call2Context ctx) {
        int intoScopeCounts = 1; //f() -> intoscope(f)
        Stream<Object> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExprFuncall);
        String functionCalls = ctx.function_call_helper().stream().map(i -> visitFunction_call_helper(i)
                        +((i.member_name() != null)
                        ?Asm.intoScope(i.member_name().getText()) :""))
                .reduce("", String::concat);
        String s = functionCalls + Asm.outofScope().repeat(ctx.function_call_helper().size()+
                intoScopeCounts);
        return visitFun_name(ctx.fun_name(), args) + Asm.intoScope(ctx.fun_name().getText()) + s;//TODO may be error, if exist member(not method call)
    }
    @Override
    public String visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx) {
        Stream<Object> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExprFuncall);
        return visitFun_name(ctx.fun_name(), args) + Asm.intoScope(ctx.fun_name().getText());//TODO may be error, if exist member(not method call)
    }
    public String visitFunction_call3(langosWithoutSyntaxParser.Function_call3Context ctx, String regIn, String regOut) {
        Stream<Object> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExprFuncall);//подачу аргументов можно наверное не менять
        //ctx.fun_name().getText() -> parent call//TODO
        String s = (String)
                FunctionGenerators.userFunGenerator2(ctx.fun_name().getText(), regIn)//mb userFunGenerator? (not 2)
                        .apply(args);
        return s /*+ Asm.getArg(regOut)*//*+ Asm.intoScope(ctx.fun_name().getText())*/;//TODO may be error, if exist member(not method call)
        //r<- ....
        //r2<-r.funName(args..)
    }

    public String visitMethod_call_(langosWithoutSyntaxParser.Method_call_Context ctx, String reg) {
        Stream<Object> args = ctx.parened_expr_list().expr_list().expr().stream()
                .map(this::visitExprFuncall);
        Function funGen = FunctionGenerators.userFunGenerator2(ctx.fun_name().getText(), reg);
        //    visitFun_name(ctx.fun_name(), args)   ->    (String) funGen.apply(ctx.fun_name().getText(), args);
        //  + Asm.intoScope(ctx.fun_name().getText())
        return  (String) funGen.apply(args);//TODO may be error, if exist member(not method call)
    }
    public PairString _visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx) {
        Iterator<String> it = ctx.ID().stream().map(this::visitid2).iterator();
        String prev = it.next();
        String now;
        String r = null;
        StringBuilder code = new StringBuilder();
        while(it.hasNext()){
            now = it.next();
            //GET_ELEMENT_PTR  m, d, b
            r = IdGenerator.reg();
            code.append(Asm.GET_ELEMENT_PTR(r, prev, now));
            prev = r;
        }
        //mb return also r
        return new PairString(code.toString(), r);//ctx.ID().stream().map(this::visitid2).map(Asm::intoScope).reduce("", String::concat);
    }
    @Override
    public String visitMethod_call(langosWithoutSyntaxParser.Method_callContext ctx) {
        PairString cn;
        int intoScopeCounts = 0;
        String functionCalls;
        String r = IdGenerator.reg();//cn.b;
        Iterator<langosWithoutSyntaxParser.Function_call_helper_methodContext> it = ctx.function_call_helper_method().iterator();
        if (ctx.namspce_obj() != null) {
            cn = _visitNamspce_obj(ctx.namspce_obj());
            //intoScopeCounts = ctx.namspce_obj().ID().size() + 1;//s::s::s.d -> intoscope x n+1
            //чуваки которые в functionCall сами должны свои скопы закрывать
        }
        else {
           // cn = Asm.intoScope(visitClass_name(ctx.class_name()));//TODO check cn == INTOSCOPE ClassName
            String reg = IdGenerator.reg();
            langosWithoutSyntaxParser.Method_call_Context p = ctx.method_call_();
            String methodName = p.fun_name().getText();
            cn = new PairString(Asm.GET_ELEMENT_PTR(reg, ctx.class_name().ID().getText(), methodName), reg);
            //intoScopeCounts = 2;//s.d() -> intoscope(s,d)
            //чуваки которые в functionCall сами должны свои скопы закрывать
        }
        functionCalls = ((it.hasNext())?Asm.getArg(r):"") + visitFunctionCalls(it, r);

        String s = functionCalls;
        /* + Asm.outofScope().repeat(ctx.function_call_helper_method().size()+ intoScopeCounts)*/
        return cn.a + visitMethod_call_(ctx.method_call_(), cn.b) + s /* + Asm.outofScope()*/;
        /*
        * NOW in langosIR1
        * INTOSCOPE d
        * INTOSCOPE b
        * INTOSCOPE k
        * sss
        * ss
        * CALL f //run method
        * POP q //getmember
        * NEED in llvmIR
        *
        //%3 = getelementptr inbounds %structureName, ptr src, i32 0, i32 memberIDXinStruct
        //походу i32 0 - всегда (мб это номер измерения)
        * NEED in langosIR1
        *
        * GET_ELEMENT_PTR  m, d, b
        * GET_ELEMENT_PTR  v, %m, k
        * sss
        * ss
        * GET_ELEMENT_PTR u, %v, f
        * CALL %u
        * POP q
        * */
    }

    private String visitFunctionCalls(Iterator<langosWithoutSyntaxParser.Function_call_helper_methodContext> it, String r) {
        StringBuilder functionCalls = new StringBuilder();
        while (it.hasNext()){
            langosWithoutSyntaxParser.Function_call_helper_methodContext p = it.next();
            PairString m = visitFunction_call_helper_method(p, r);
            r = m.b;
            functionCalls.append(m.a);
        }
        //functionCalls.append(Asm.PUSH(r));//а надо ли оно?
        return functionCalls.toString();
    }

    @Override
    public String visitFunction_call_(langosWithoutSyntaxParser.Function_call_Context ctx) {
        return (ctx.method_call() != null)
                ? visitMethod_call(ctx.method_call())
                : visitFunction_call2(ctx.function_call2());
    }
    @Override
    public String visitDeclare_member(langosWithoutSyntaxParser.Declare_memberContext ctx) {
        return Asm.declareMember(visitType_name(ctx.type_name()), visitVar_name(ctx.var_name()));
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
