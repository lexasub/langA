package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mylangosWithoutSyntaxVisitor extends mylangosWithoutSyntaxVisitorBase {

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
        List<String> s2 = ctx.var_name().stream().map(this::visitVar_name).toList();

        Iterator<String> it1 = ctx.type_name().stream().map(i -> i.ID().getText()).iterator();//types
        StringBuilder s = new StringBuilder();
        Iterator<String> it = s2.iterator();
        StringBuilder sb = new StringBuilder();
        if (it.hasNext()) sb.append(it.next());
        while (it.hasNext()) {
            sb.append(", " + it.next());
        }
        return s + sb.toString();
    }


    @Override
    public String visitBraced_element(langosWithoutSyntaxParser.Braced_elementContext ctx) {
        return ctx.element().stream().map(this::visitElement).reduce("", String::concat);
    }

    public PairString visitFunction_call_helper_method(langosWithoutSyntaxParser.Function_call_helper_methodContext ctx, String regName_in) {
        String regName = IdGenerator.reg();
        if (ctx.member_name() != null)
            return new PairString(Asm.GET_ELEMENT_PTR(regName, regName_in, ctx.member_name().ID().getText()), regName);

        String member = Asm.GET_ELEMENT_PTR(regName, regName_in, ctx.function_call3().fun_name().getText());
        String outRegName = IdGenerator.reg();
        return new PairString(member + visitFunction_call3(ctx.function_call3(), regName, outRegName), outRegName);
    }

    public String visitFunction_call_helper(langosWithoutSyntaxParser.Function_call_helperContext ctx, String from, String to) {
        if (ctx.member_name() != null) return Asm.GET_ELEMENT_PTR(to, from, visitMember_name(ctx.member_name()));
        return visitFunction_call(ctx.function_call(), from, to);
    }

    public PairString visitGet_member_(langosWithoutSyntaxParser.Get_memberContext ctx) {
        String regName = IdGenerator.reg();
        String res = "";
        res += Asm.GET_ELEMENT_PTR(regName, visitClass_name(ctx.class_name()), visitMember_name(ctx.member_name()));
        return new PairString(res, regName);
    }


    public String visitExprPart(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.with_() != null) return visitWith_(ctx.with_());
        if (ctx.flow_control() != null) return visitFlow_control(ctx.flow_control());
        if (ctx.class_() != null) return visitClass_(ctx.class_());
        return null;
    }

    public String visitExprLambda(langosWithoutSyntaxParser.ExprContext ctx, String lambda_name) {//TODO check lambda_res is good using??
        if (ctx.ID() != null) return Asm.RET(ctx.ID().getText());

        if (ctx.function_call_() != null) {
            PairString p = visitFunction_callAsArg(ctx.function_call_());
            return p.a + Asm.RET(p.b);
        }
        if (ctx.get_member() != null) return visitGet_member_(ctx.get_member()).a;//std::kostyl'
        if (ctx.lambda() == null) return visitExprPart(ctx);
        return lambdaForExpr(ctx, lambda_name);//TODO
    }

    public String visitExprReturn(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.ID() != null) return Asm.RET(visitid2(ctx.ID()));
        if (ctx.with_() != null) return visitWith_(ctx.with_()) + Asm.RET();
        if (ctx.flow_control() != null) return visitFlow_control(ctx.flow_control()) + Asm.RET();
        PairString p = null;
        if (ctx.lambda() != null) p = visitLambda_(ctx.lambda());
        if (ctx.get_member() != null) p = visitGet_member_(ctx.get_member());
        if (ctx.function_call_() != null) p = visitFunction_callAsArg(ctx.function_call_());
        return p.a + Asm.RET(p.b);
        //if (ctx.class_() != null) return visitClass_(ctx.class_());
    }

    @Override
    public String visitExpr(langosWithoutSyntaxParser.ExprContext ctx) {
        if (ctx.ID() != null) return "error visitExpr visitid2(ctx.ID()) + \n";//TODO check

        if (ctx.function_call_() != null) return visitFunction_callAsArg(ctx.function_call_()).a;
        if (ctx.get_member() != null) return visitGet_member_(ctx.get_member()).a;//std::kostyl'
        if (ctx.lambda() == null) return visitExprPart(ctx);
        return lambdaForExpr(ctx, IdGenerator.lambda() + "_res");
    }

    private String lambdaForExpr(langosWithoutSyntaxParser.ExprContext ctx, String result) {//TODO make tests
        PairString l = visitLambda_(ctx.lambda());
        return l.a + Asm.MOV(l.b, result);
    }

    public Object visitExprFuncall(langosWithoutSyntaxParser.ExprContext ctx) {//args
        if (ctx.ID() != null) return ctx.ID().getText();
        if (ctx.get_member() != null) return visitGet_member_(ctx.get_member());
        if (ctx.function_call_() != null) return visitFunction_callAsArg(ctx.function_call_());//TODO CHECK
        // if (ctx.lambda() == null) return visitExprPart(ctx);
        PairString l = visitLambda_(ctx.lambda());
        return new PairString(l.a, l.b);
    }

    public PairString visitLambda_(langosWithoutSyntaxParser.LambdaContext ctx) {
        Stream<String> s1 = null;
        if (ctx.parened_id_list().id_list() != null)
            s1 = ctx.parened_id_list().id_list().ID().stream().map(this::visitid2);
        else if (ctx.parened_id_list().ID() != null)
            s1 = Stream.of(new String[]{visitid2(ctx.parened_id_list().ID())});
        String lambdaName = IdGenerator.lambda();
        String s2 = (ctx.expr() != null)
                ? visitExprLambda(ctx.expr(), lambdaName)
                : visitBraced_element(ctx.braced_element());
        return Asm.createLambda(s1, s2, lambdaName);
    }

    public PairString visitFunction_call2_(langosWithoutSyntaxParser.Function_call2Context ctx) {
        List<langosWithoutSyntaxParser.ExprContext> _args = ctx.parened_expr_list().expr_list().expr();
        String from = ctx.fun_name().getText() + "_res";

        if (ctx.fun_name().IF() != null){
            Stream<langosWithoutSyntaxParser.LambdaContext> threeLambdas = _args.stream().map(i -> i.lambda());
            Stream<Object> ifArgs = threeLambdas.map(i -> (i.expr() != null) ?
                    visitExpr(i.expr()) :
                    visitBraced_element(i.braced_element()));
            return new PairString(visitFun_name(ctx.fun_name(), ifArgs), from);
        }
        if (ctx.fun_name().WHILE() != null){
            Stream<langosWithoutSyntaxParser.LambdaContext> Lambdas = _args.stream().map(i -> i.lambda());
            Stream<Object> whileArgs = Lambdas.map(i -> (i.expr() != null) ?
                    visitExpr(i.expr()) :
                    visitBraced_element(i.braced_element()));
            return new PairString(visitFun_name(ctx.fun_name(), whileArgs), from);
        }
        PairString args = getFunExprArgs(_args);
        Iterator<langosWithoutSyntaxParser.Function_call_helperContext> it = ctx.function_call_helper().iterator();
        /* StringBuilder functionCalls = new StringBuilder();
        String to = "";  //for a...().f().g()
        while (it.hasNext()) {
            langosWithoutSyntaxParser.Function_call_helperContext i = it.next();
            to = IdGenerator.reg();
            functionCalls.append(visitFunction_call_helper(i, from, to));
            //functionCalls.append(((i.member_name() != null)?Asm.intoScope(i.member_name().getText()) :""));
            from = to;
        }*/

        String s = "" /*functionCalls.toString()*/;//+ Asm.MOV(from, "last_res")//полурабочий костыль//TODO
        String b = args.b;

        String[] split = b.split(", ");

        Stream<Object> args1 = Arrays.stream(split);
        if (ctx.fun_name().IF() != null)
            args1 = Stream.concat(args1, Stream.of(split[0].replace("BEGIN_", "") + "_res"));
        if (ctx.fun_name().WHILE() != null)
            args1 = Stream.concat(args1, Stream.of(split[0].replace("BEGIN_", "") + "_res"));
        return new PairString(args.a + visitFun_name(ctx.fun_name(), args1) + s, from);//TODO may be error, if exist member(not method call)
    }

    private PairString getFunExprArgs(List<langosWithoutSyntaxParser.ExprContext> _v) {
        if (_v.size() == 0)
            return new PairString("", "");
        Iterator<langosWithoutSyntaxParser.ExprContext> _args = _v.iterator();
        StringBuilder sb = new StringBuilder();
        langosWithoutSyntaxParser.ExprContext next = _args.next();
        LinkedList<String> args = new LinkedList();
        addArg(args, sb, next, "");
        while (_args.hasNext()) {
            next = _args.next();
            addArg(args, sb, next, ", ");
        }
        return new PairString(sb.toString(), args.stream().map(Object::toString).collect(Collectors.joining("")));
    }

    private void addArg(LinkedList args, StringBuilder sb, langosWithoutSyntaxParser.ExprContext next, String prefix) {
        Object e = visitExprFuncall(next);
        if (e instanceof String s)
            args.add(prefix + s);
        else if (e instanceof PairString p) {
            args.add(prefix + p.b);
            if (next.lambda() != null)
                sb.append(Asm.JMP(p.b.replace("BEGIN", "END")));//обход лямбды
            sb.append(p.a);
        }
    }

    public String visitFunction_call(langosWithoutSyntaxParser.Function_callContext ctx, String from, String to) {
        List<langosWithoutSyntaxParser.ExprContext> _args = ctx.parened_expr_list().expr_list().expr();
        PairString args = getFunExprArgs(_args);
        String id = IdGenerator.reg();
        String res = Asm.GET_ELEMENT_PTR(id, from, ctx.fun_name().getText());
        res += args.a;
        res += FunctionGenerators.userFunGenerator2(ctx.fun_name().getText(), id).apply(Arrays.stream(args.b.split(", ")));
        res += Asm.getReturn(to, ctx.fun_name().getText());
        return res;//TODO may be error, if exist member(not method call)
    }

    public String visitFunction_call3(langosWithoutSyntaxParser.Function_call3Context ctx, String regIn, String regOut) {
        List<langosWithoutSyntaxParser.ExprContext> _args = ctx.parened_expr_list().expr_list().expr();
        PairString args = getFunExprArgs(_args);
        String s = args.a;
        s += (String) FunctionGenerators.userFunGenerator2(ctx.fun_name().getText(), regIn)//mb userFunGenerator? (not 2)
                .apply(Arrays.stream(args.b.split(", ")));
        s += Asm.getReturn(regOut, ctx.fun_name().getText());
        return s /*+ Asm.getArg(regOut)*//*+ Asm.intoScope(ctx.fun_name().getText())*/;//TODO may be error, if exist member(not method call)
        //r<- ....
        //r2<-r.funName(args..)
    }

    public String visitMethod_call_(langosWithoutSyntaxParser.Method_call_Context ctx, String reg) {
        List<langosWithoutSyntaxParser.ExprContext> _args = ctx.parened_expr_list().expr_list().expr();
        PairString args = getFunExprArgs(_args);
        Function funGen = FunctionGenerators.userFunGenerator2(ctx.fun_name().getText(), reg);
        return args.a + (String) funGen.apply(Arrays.stream(args.b.split(", ")));//TODO may be error, if exist member(not method call)
    }

    public PairString _visitNamspce_obj(langosWithoutSyntaxParser.Namspce_objContext ctx) {
        Iterator<String> it = ctx.ID().stream().map(this::visitid2).iterator();
        String prev = it.next();
        String now;
        String r = null;
        StringBuilder code = new StringBuilder();
        while (it.hasNext()) {
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
        String r = IdGenerator.reg();//cn.b;
        if (ctx.namspce_obj() != null) {
            cn = _visitNamspce_obj(ctx.namspce_obj());
            String id = IdGenerator.reg();
            cn = new PairString(cn.a + Asm.GET_ELEMENT_PTR(id, cn.b, ctx.method_call_().fun_name().getText()), id);

        } else {
            String reg = IdGenerator.reg();
            String methodName = ctx.method_call_().fun_name().getText();
            cn = new PairString(Asm.GET_ELEMENT_PTR(reg, ctx.class_name().ID().getText(), methodName), reg);
        }

        String functionCalls = "";
        Iterator<langosWithoutSyntaxParser.Function_call_helper_methodContext> it = ctx.function_call_helper_method().iterator();
        if (it.hasNext()) {
            functionCalls = Asm.getReturn(r, cn.b) + visitFunctionCalls(it, r);
            langosWithoutSyntaxParser.Function_call_helper_methodContext s = ctx.function_call_helper_method(ctx.function_call_helper_method().size() - 1);
            //if(s.function_call3() != null)
            //    functionCalls += Asm.MOV(s.function_call3().fun_name().getText() + "_res", "last_res");//полурабочий костыль//TODO
            // else functionCalls += s.member_name().ID().getText();//std::MayBeStrange
        }
        //else functionCalls = Asm.MOV(ctx.method_call_().fun_name().ID().getText() + "_res", "last_res");//полурабочий костыль//TODO
        return cn.a + visitMethod_call_(ctx.method_call_(), cn.b) + functionCalls;
    }

    private String visitFunctionCalls(Iterator<langosWithoutSyntaxParser.Function_call_helper_methodContext> it, String r) {
        StringBuilder functionCalls = new StringBuilder();
        while (it.hasNext()) {
            langosWithoutSyntaxParser.Function_call_helper_methodContext p = it.next();
            PairString m = visitFunction_call_helper_method(p, r);
            r = m.b;
            functionCalls.append(m.a);
        }
        //functionCalls.append(Asm.PUSH(r));//а надо ли оно?
        return functionCalls.toString();
    }

    public PairString visitFunction_callAsArg(langosWithoutSyntaxParser.Function_call_Context ctx) {
        return (ctx.method_call() != null)
                ? new PairString(visitMethod_call(ctx.method_call()), "p")//std:kostyl'
                : visitFunction_call2_(ctx.function_call2());
    }

    @Override
    public String visitDeclare_member(langosWithoutSyntaxParser.Declare_memberContext ctx) {
        return Asm.declareMember(visitType_name2(ctx.type_name()), visitVar_name(ctx.var_name()));
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
        return visitExprReturn(ctx.expr());
    }

    @Override
    public String visitWith_(langosWithoutSyntaxParser.With_Context ctx) {
        String expr = visitExpr(ctx.parened_expr().expr());
        String id = visitWith_synonym(ctx.with_synonym());
        Stream<String> bodys = ctx.with_body().stream().map(ctx1 -> visitExpr(ctx1.expr()));
        return expr + Asm.MOV("last_res", id) + bodys.map(i -> i + "\n").reduce("", String::concat);
    }

}
