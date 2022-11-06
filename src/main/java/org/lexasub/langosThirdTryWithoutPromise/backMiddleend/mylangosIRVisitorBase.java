package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

public class mylangosIRVisitorBase extends langosIRBaseVisitor<String> {

    @Override public String visitJmp(langosIRParser.JmpContext ctx) {
        return LLVMAsm.JMP(ctx.ID().getText());
    }
    @Override public String visitEq(langosIRParser.EqContext ctx) {
        return LLVMAsm.EQ(ctx.ID(0).getText(),ctx.ID(1).getText());
    }
    @Override public String visitJmps(langosIRParser.JmpsContext ctx) {
        if(ctx.jmp() != null) return visitJmp(ctx.jmp());
        if(ctx.eq() != null) return visitEq(ctx.eq());
        return "";
    }
    @Override public String visitLbl(langosIRParser.LblContext ctx) {
        return LLVMAsm.LBL(ctx.ID().getText());
    }
}
