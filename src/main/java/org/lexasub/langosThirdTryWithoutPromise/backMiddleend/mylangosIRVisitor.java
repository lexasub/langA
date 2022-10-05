package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;


public class mylangosIRVisitor extends mylangosIRVisitorBase {
    @Override public String visitIntoscope(langosIRParser.IntoscopeContext ctx) {
        //globalTree = globalTree.findChild(ctx.ID())
        return "";
    }
    @Override public String visitScope_control(langosIRParser.Scope_controlContext ctx) {
        if(ctx.intoscope() != null) return visitIntoscope(ctx.intoscope());
        if(ctx.OUTOFSCOPE() != null){
            //globalTree = globalTree.parent()
            return "";
        }
        if(ctx.ENTERSCOPE() != null) {return "ENTERSCOPE\n";}
        if(ctx.EXITSCOPE() != null) {return "EXITSCOPE\n";}
        return "";
    }
    @Override public String visitClass(langosIRParser.ClassContext ctx) { return visitChildren(ctx); }
    @Override public String visitEndclass(langosIRParser.EndclassContext ctx) { return visitChildren(ctx); }
    @Override public String visitClass_full(langosIRParser.Class_fullContext ctx) { return visitChildren(ctx); }

    @Override public String visitImport_(langosIRParser.Import_Context ctx) { return visitChildren(ctx); }
    @Override public String visitMap_control(langosIRParser.Map_controlContext ctx) { return visitChildren(ctx); }
    @Override public String visitMap(langosIRParser.MapContext ctx) { return visitChildren(ctx); }
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
    @Override public String visitStack_cmds(langosIRParser.Stack_cmdsContext ctx) { return visitChildren(ctx); }
    @Override public String visitProgram(langosIRParser.ProgramContext ctx) { return visitChildren(ctx); }
    @Override public String visitEntry_point(langosIRParser.Entry_pointContext ctx) {
        return ctx.program().stream()
            .map(this::visitProgram).reduce("",String::concat);
    }

}
