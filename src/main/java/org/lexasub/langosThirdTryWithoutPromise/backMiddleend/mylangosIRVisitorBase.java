package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

public class mylangosIRVisitorBase extends langosIRBaseVisitor<String> {

    @Override public String visitJmp(langosIRParser.JmpContext ctx) {
        return LLVMAsm.JMP(ctx.ID().getText());
    }
    @Override public String visitEq(langosIRParser.EqContext ctx) {
        return LLVMAsm.EQ(ctx.ID().getText());
    }
    @Override public String visitNeq(langosIRParser.NeqContext ctx) {
        return LLVMAsm.NEQ(ctx.ID().getText());
    }
    @Override public String visitJmps(langosIRParser.JmpsContext ctx) {
        if(ctx.jmp() != null) return visitJmp(ctx.jmp());
        if(ctx.eq() != null) return visitEq(ctx.eq());
        if(ctx.neq() != null) return visitNeq(ctx.neq());
        return "";
    }
    @Override public String visitLbl(langosIRParser.LblContext ctx) {
        return LLVMAsm.LBL(ctx.ID().getText());
    }
}
