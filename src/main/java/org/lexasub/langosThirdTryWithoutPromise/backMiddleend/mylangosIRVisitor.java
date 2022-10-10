package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;


import java.util.stream.Stream;

public class mylangosIRVisitor extends mylangosIRVisitorBase {
    NamespaceTree globalTree = new NamespaceTree();
    @Override public String visitIntoscope(langosIRParser.IntoscopeContext ctx) {
        globalTree = globalTree.findChild(ctx.ID().getText());
        return "";
    }
    @Override public String visitScope_control(langosIRParser.Scope_controlContext ctx) {
        if(ctx.intoscope() != null) return visitIntoscope(ctx.intoscope());
        if(ctx.OUTOFSCOPE() != null){
            globalTree = globalTree.parent();
            return "";
        }
        if(ctx.ENTERSCOPE() != null) {return "ENTERSCOPE\n";}
        if(ctx.EXITSCOPE() != null) {return "EXITSCOPE\n";}
        return "";
    }
    @Override public String visitClass(langosIRParser.ClassContext ctx) { return visitChildren(ctx); }
    @Override public String visitEndclass(langosIRParser.EndclassContext ctx) { return visitChildren(ctx); }
    @Override public String visitFunc(langosIRParser.FuncContext ctx) {
        globalTree = globalTree.addChild("FUNCTION_" + ctx.lbl().ID().getText());
        String res = LLVMAsm.LBL("FUNCTION_" + ctx.lbl().ID().getText());
        res += ctx.program().stream().map(this::visitProgram).reduce("", String::concat);
        res += LLVMAsm.RET();
        globalTree = globalTree.parent();
        return res;
    }
    public String addClass(langosIRParser.Class_fullContext ctx){
        String className = ctx.class_().ID().getText();
        StructureGenerator struct = globalTree.addStructure(className);
        globalTree = struct.nm();
        String s = "";//....
        //%T1 = type {  i32, i32,.. }
        //типы все кастомные - так что %type
        //methods it's labels or pointers on functions
        //%a = type{%a*,%a*,%a*} - example
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
        return ctx.func().lbl().ID().getText();
        //ctx.func().
    }

    public String visitProgramFromClass(langosIRParser.ProgramContext r, StructureGenerator sg){
        if(r.import_() != null) return "error import in class";
        if(r.flow_control() != null) return "error flow in class";
        if(r.map_control() != null) return "error map in class";
        if(r.stack_cmds() != null) return "error stack in class";
        if(r.lbl() != null) return "hmm, lbl in class";
        if(r.scope_control() != null) return "hmm, scope_control in class";
        if(r.func() != null) return sg.addMethod(visitFunc(r.func()));
        if(r.class_full() != null) return addClass(r.class_full());
        return "";
    }
    public String visitMember_declare(langosIRParser.Member_declareContext ctx, StructureGenerator sg){
        //ctx.ID(0).getText()//type
        //ctx.ID(1).getText()//name
        return sg.addMemberToTable(ctx.ID(0).getText(),sg.name + "_" + ctx.ID(1).getText());
    }
    @Override public String visitClass_full(langosIRParser.Class_fullContext ctx) {
        return addClass(ctx);
    }

    @Override public String visitImport_(langosIRParser.Import_Context ctx) { return visitChildren(ctx); }
    @Override public String visitMap_control(langosIRParser.Map_controlContext ctx) {
        if(ctx.map() != null) return visitMap(ctx.map());
        if(ctx.mapo() != null) return visitMapo(ctx.mapo());
        if(ctx.pairmap() != null) return visitPairmap(ctx.pairmap());
        if(ctx.pairmapo_() != null) return visitPairmapo_(ctx.pairmapo_());
        if(ctx.pairmap_o() != null) return visitPairmap_o(ctx.pairmap_o());
        if(ctx.pairmapoo() != null) return visitPairmapoo(ctx.pairmapoo());
        return "";
    }
    @Override public String visitMap(langosIRParser.MapContext ctx) { return visitChildren(ctx); }//launch next() on obj//"rewrite" access to members in "runtime";
    // vector<int> a{3,4,5,1,4} - before a[2]=5 - map(a,(i) -> i*i) - after a[2] = 25 //on access, no on run map func
    //oh no, it's wrong. i need TEMPORARY VIEW on obj
    @Override public String visitMapo(langosIRParser.MapoContext ctx) { return visitChildren(ctx); }
    @Override public String visitPairmap(langosIRParser.PairmapContext ctx) { return visitChildren(ctx); }
    @Override public String visitPairmap_o(langosIRParser.Pairmap_oContext ctx) { return visitChildren(ctx); }
    @Override public String visitPairmapo_(langosIRParser.Pairmapo_Context ctx) { return visitChildren(ctx); }
    @Override public String visitPairmapoo(langosIRParser.PairmapooContext ctx) { return visitChildren(ctx); }

    @Override public String visitPop(langosIRParser.PopContext ctx) { return visitChildren(ctx); }
    @Override public String visitPush(langosIRParser.PushContext ctx) { return visitChildren(ctx); }

    @Override public String visitFlow_control(langosIRParser.Flow_controlContext ctx) {
        //call  | CONTINUE | BREAK;
        if(ctx.jmps() != null) return visitJmps(ctx.jmps());
        if(ctx.jmps() != null) return LLVMAsm.RET();//ну вроде тут без изменений
    }
    @Override public String visitCall(langosIRParser.CallContext ctx) {
        //LLVMAsm.CALL(globalTree.findLeaf(ctx.ID()))//??or CALL s.s.c
        return visitChildren(ctx);
    }
    @Override public String visitStack_cmds(langosIRParser.Stack_cmdsContext ctx) {
        if(ctx.pop() != null) return visitPop(ctx.pop());
        if(ctx.pop() != null) return visitPush(ctx.push());
        return  "";
    }
    @Override public String visitProgram(langosIRParser.ProgramContext ctx) {
        if(ctx.import_() != null) return visitImport_(ctx.import_());
        if(ctx.class_full() != null) return visitClass_full(ctx.class_full());
        if(ctx.flow_control() != null) return visitFlow_control(ctx.flow_control());
        if(ctx.scope_control() != null) return visitScope_control(ctx.scope_control());
        if(ctx.map_control() != null) return visitMap_control(ctx.map_control());
        if(ctx.stack_cmds() != null) return visitStack_cmds(ctx.stack_cmds());
        if(ctx.lbl() != null) return visitLbl(ctx.lbl());
        if(ctx.func() != null) return visitFunc(ctx.func());
        return "";
    }
    @Override public String visitEntry_point(langosIRParser.Entry_pointContext ctx) {
        return ctx.program().stream()
            .map(this::visitProgram).reduce("",String::concat);
    }

}
