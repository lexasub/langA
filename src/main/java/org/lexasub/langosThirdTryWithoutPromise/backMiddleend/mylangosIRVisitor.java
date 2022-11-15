package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;


import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Objects;
import java.util.stream.Stream;

public class mylangosIRVisitor extends mylangosIRVisitorBase {
    StringBuilder funcs = new StringBuilder();

    @Override
    public String visitScope_control(langosIRParser.Scope_controlContext ctx) {
        if (ctx.ENTERSCOPE() != null) {
            return "ENTERSCOPE\n";
        }
        // if(ctx.EXITSCOPE() != null) {return "EXITSCOPE\n";}
        return "";
    }

    @Override
    public String visitClass(langosIRParser.ClassContext ctx) {
        return null;
    }

    @Override
    public String visitEndclass(langosIRParser.EndclassContext ctx) {
        return null;
    }

    @Override
    public String visitFunc(langosIRParser.FuncContext ctx) {
        generateFunction(ctx);//->funcs
        if (globalTree.parent() != null && generateFunctionCall(ctx.parent))
            return LLVMAsm.CALL(ctx.func_lbl().id().getText(), globalTree);
        return "";
    }

    private boolean generateFunctionCall(Object ctx) {
        if (ctx instanceof langosIRParser.ProgramContext r) {
            ParserRuleContext parent = r.getParent();
            int id = parent.children.indexOf(r);
            if (parent.getChild(id - 1) instanceof langosIRParser.ProgramContext prev &&
                    parent.getChild(id + 1) instanceof langosIRParser.ProgramContext next) {
                langosIRParser.JmpsContext f = prev.flow_control().jmps();
                if (prev.flow_control() != null && next.lbl() != null &&
                        f != null && f.jmp() != null &&
                        Objects.equals(f.jmp().ID().getText(), next.lbl().ID().getText()))
                    return false;
            }
        }
        return true;
    }

    private void generateFunction(langosIRParser.FuncContext ctx) {
        globalTree = globalTree.addChild(ctx.func_lbl().id().getText());
        String funHeader = visitFunc_lbl(ctx.func_lbl());
        String body = ctx.program().stream().map(this::visitProgram).filter(i -> i != null).reduce("", String::concat) + toFuncEndPop();

        String ret = (ctx.id() != null)
                ? LLVMAsm.RET(ctx.id().getText(), globalTree)
                : LLVMAsm.RETDefault(globalTree);
        String additionalArgs = LLVMAsm.transStreamOfAdditionalArgs(globalTree.needVars.entrySet().stream());
        funcs.append(LLVMAsm.createFunction(LLVMAsm.declareFuncHeader2(funHeader, additionalArgs,
                        globalTree.funcPrefix, globalTree.funcType),
                body, ret));
        globalTree = globalTree.parent();
    }
    public String addClass(langosIRParser.Class_fullContext ctx) {
        String className = ctx.class_().ID().getText();
        StructureGenerator struct = globalTree.addStructure(className);
        globalTree = struct.nm();
        String s = "";//....
        //%T1 = type {  i32, i32,.. }
        //типы все кастомные - так что %type
        //methods it's labels or pointers on functions
        //%a = type{%a,%a*,%a*} - example
        //%3 = getelementptr inbounds %structureName, ptr src, i32 0, i32 memberIDXinStruct //
        // , !dbg !36
        //походу i32 0 - всегда (мб это номер измерения)

        Stream<String> types = ctx.member_declare().stream()
                .map(i -> visitMember_declare(i, struct));
        Stream<String> funcNames = ctx.program().stream()
                .filter(i -> i.func() != null)
                .map(this::getFunctionName);
        s += LLVMAsm.declareType(className, types, (int) funcNames.map(i -> methodDeclare(i, struct)).count());
        //s += mb jmp to
        s += ctx.program().stream()
                .map(i -> visitProgramFromClass(i, struct))
                .reduce("", String::concat);
        //s += this label

        globalTree = globalTree.parent();
        return s;
    }

    private String methodDeclare(String i, StructureGenerator sg) {
        return sg.addDeclareMethod(sg.name + "_" + i);
    }

    private String getFunctionName(langosIRParser.ProgramContext ctx) {//TODO may be +type of func
        return ctx.func().func_lbl().id().getText();
        //ctx.func().
    }

    public String visitProgramFromClass(langosIRParser.ProgramContext r, StructureGenerator sg) {
        if (r.import_() != null) return "error import in class";
        if (r.flow_control() != null) return "error flow in class";
        if (r.map_control() != null) return "error map in class";
        if (r.lbl() != null) return "hmm, lbl in class";
        if (r.scope_control() != null) return "hmm, scope_control in class";
        if (r.func() != null) return sg.addMethod(visitFunc(r.func()));
        if (r.class_full() != null) return addClass(r.class_full());
        return "";
    }

    public String visitMember_declare(langosIRParser.Member_declareContext ctx, StructureGenerator sg) {
        //ctx.ID(0).getText()//type
        //ctx.ID(1).getText()//name
        return sg.addMemberToTable(ctx.ID(0).getText(), sg.name + "_" + ctx.ID(1).getText());
    }

    @Override
    public String visitClass_full(langosIRParser.Class_fullContext ctx) {
        return addClass(ctx);
    }

    @Override
    public String visitImport_(langosIRParser.Import_Context ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFunction_argument(langosIRParser.Function_argumentContext ctx) {
        globalTree.addDeclare(
                ctx.ID(1).getText(), ctx.ID(0).getText()//type
        );//name
        return "";
    }

    @Override
    public String visitMap_control(langosIRParser.Map_controlContext ctx) {
        if (ctx.map() != null) return visitMap(ctx.map());
        if (ctx.mapo() != null) return visitMapo(ctx.mapo());
        if (ctx.pairmap() != null) return visitPairmap(ctx.pairmap());
        if (ctx.pairmapo_() != null) return visitPairmapo_(ctx.pairmapo_());
        if (ctx.pairmap_o() != null) return visitPairmap_o(ctx.pairmap_o());
        if (ctx.pairmapoo() != null) return visitPairmapoo(ctx.pairmapoo());
        return "";
    }

    @Override
    public String visitMap(langosIRParser.MapContext ctx) {
        return visitChildren(ctx);
    }

    //launch next() on obj//"rewrite" access to members in "runtime";
    // vector<int> a{3,4,5,1,4} - before a[2]=5 - map(a,(i) -> i*i) - after a[2] = 25 //on access, no on run map func
    //oh no, it's wrong. i need TEMPORARY VIEW on obj
    @Override
    public String visitMapo(langosIRParser.MapoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPairmap(langosIRParser.PairmapContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPairmap_o(langosIRParser.Pairmap_oContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPairmapo_(langosIRParser.Pairmapo_Context ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitPairmapoo(langosIRParser.PairmapooContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public String visitFlow_control(langosIRParser.Flow_controlContext ctx) {
        //TODO  CONTINUE | BREAK;
        if (ctx.jmps() != null) return visitJmps(ctx.jmps());
        if (ctx.RET() != null) return (ctx.id() != null)
                ? LLVMAsm.RET(ctx.id().getText(), globalTree)
                : LLVMAsm.RETDefault(globalTree);
        if (ctx.call() != null) return visitCall(ctx.call());
        return null;
    }

    @Override
    public String visitCall(langosIRParser.CallContext ctx) {
        //LLVMAsm.CALL(globalTree.findLeaf(ctx.ID()))//??or CALL s.s.c
        String args = ctx.ID().stream().map(i -> "i32 %" + globalTree.getSSAReg(i.getText()) + ", ").reduce("", String::concat);
        if (!args.equals("")) args = args.substring(0, args.length() - 2);
        return LLVMAsm.CALL(globalTree.findLeaf(ctx.id(1).ID()), args, globalTree, ctx.id(0).ID().getText());//TODO
    }

    @Override
    public String visitFunc_lbl(langosIRParser.Func_lblContext ctx) {
        String funcName = ctx.id().getText();
        Stream<String> args = ctx.id_list(0).ID().stream().map(i -> i.getText());
        //id_list(1) -> additional args(example a)//set(a,5);()->a//may be TODO
        //id_list(2) -> return args??
        return LLVMAsm.declareFuncHeader(funcName, args, globalTree);
    }

    @Override
    public String visitProgram(langosIRParser.ProgramContext ctx) {
        if (ctx.import_() != null) return visitImport_(ctx.import_());
        if (ctx.class_full() != null) return visitClass_full(ctx.class_full());
        if (ctx.flow_control() != null) return visitFlow_control(ctx.flow_control());
        if (ctx.scope_control() != null) return visitScope_control(ctx.scope_control());
        if (ctx.map_control() != null) return visitMap_control(ctx.map_control());
        if (ctx.lbl() != null) return visitLbl(ctx.lbl());
        if (ctx.func() != null) return visitFunc(ctx.func());
        if (ctx.get_element_ptr() != null) return visitGet_element_ptr(ctx.get_element_ptr());
        if (ctx.mov() != null) return visitMov(ctx.mov());
        return "";
    }

    @Override
    public String visitEntry_point(langosIRParser.Entry_pointContext ctx) {
        String code = ctx.program().stream()
                .map(this::visitProgram)
                .filter(i -> i != null)//std::kostyl
                .reduce("", String::concat);
        return funcs + code;
    }

}
