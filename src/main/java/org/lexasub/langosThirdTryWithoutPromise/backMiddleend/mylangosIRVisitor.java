package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;


public class mylangosIRVisitor extends mylangosIRVisitorBase {
    @Override public String visitIntoscope(langosIRParser.IntoscopeContext ctx) { return visitChildren(ctx); }
    @Override public String visitScope_control(langosIRParser.Scope_controlContext ctx) { return visitChildren(ctx); }
    @Override public String visitClass(langosIRParser.ClassContext ctx) { return visitChildren(ctx); }
    @Override public String visitEndclass(langosIRParser.EndclassContext ctx) { return visitChildren(ctx); }
    @Override public String visitClass_full(langosIRParser.Class_fullContext ctx) { return visitChildren(ctx); }
    @Override public String visitImport_(langosIRParser.Import_Context ctx) { return visitChildren(ctx); }
    @Override public String visitMap(langosIRParser.MapContext ctx) { return visitChildren(ctx); }
    @Override public String visitMapo(langosIRParser.MapoContext ctx) { return visitChildren(ctx); }
    @Override public String visitPairmap(langosIRParser.PairmapContext ctx) { return visitChildren(ctx); }
    @Override public String visitPairmap_o(langosIRParser.Pairmap_oContext ctx) { return visitChildren(ctx); }
    @Override public String visitPairmapo_(langosIRParser.Pairmapo_Context ctx) { return visitChildren(ctx); }
    @Override public String visitPairmapoo(langosIRParser.PairmapooContext ctx) { return visitChildren(ctx); }
    @Override public String visitPop(langosIRParser.PopContext ctx) { return visitChildren(ctx); }
    @Override public String visitPush(langosIRParser.PushContext ctx) { return visitChildren(ctx); }
    @Override public String visitFlow_control(langosIRParser.Flow_controlContext ctx) { return visitChildren(ctx); }
    @Override public String visitJmps(langosIRParser.JmpsContext ctx) { return visitChildren(ctx); }
    @Override public String visitJmp(langosIRParser.JmpContext ctx) { return visitChildren(ctx); }
    @Override public String visitEq(langosIRParser.EqContext ctx) { return visitChildren(ctx); }
    @Override public String visitNeq(langosIRParser.NeqContext ctx) { return visitChildren(ctx); }
    @Override public String visitCall(langosIRParser.CallContext ctx) { return visitChildren(ctx); }
    @Override public String visitLbl(langosIRParser.LblContext ctx) { return visitChildren(ctx); }
    @Override public String visitStack_cmds(langosIRParser.Stack_cmdsContext ctx) { return visitChildren(ctx); }
    @Override public String visitMap_control(langosIRParser.Map_controlContext ctx) { return visitChildren(ctx); }
    @Override public String visitProgram(langosIRParser.ProgramContext ctx) { return visitChildren(ctx); }
    @Override public String visitEntry_point(langosIRParser.Entry_pointContext ctx) { return visitChildren(ctx); }

}
