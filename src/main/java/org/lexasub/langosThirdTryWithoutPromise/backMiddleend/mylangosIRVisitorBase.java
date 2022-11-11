package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.IdGenerator;

public class mylangosIRVisitorBase extends langosIRBaseVisitor<String> {
    private StringBuilder toFuncEnd = new StringBuilder();
    public String toFuncEndPop(){
        String s = toFuncEnd.toString();
        toFuncEnd = new StringBuilder();
        return s;
    }

    @Override public String visitJmp(langosIRParser.JmpContext ctx) {
        return LLVMAsm.JMP(ctx.ID().getText());
    }
    @Override public String visitEq(langosIRParser.EqContext ctx) {
        return LLVMAsm.EQ(ctx.ID(0).getText(),ctx.ID(1).getText());
    }

    @Override
    public String visitEQCALL_THEN_JMP(langosIRParser.EQCALL_THEN_JMPContext ctx) {
        String check = ctx.ID(0).getText();
        String callLbl = ctx.ID(1).getText();
        String jmpTo = ctx.ID(2).getText();
        String lblName = "EQCALL_THEN_JMP_" + check + "_" + callLbl + "_" + jmpTo;
        String lbl = IdGenerator.lbl() + "_";
        String lblRet = IdGenerator.lbl() + "_";
        toFuncEnd.append(LLVMAsm.LBL(lblName))
                .append(LLVMAsm.EQ(check, lbl, lblRet))
                .append(LLVMAsm.LBL(lbl))
                .append(LLVMAsm.CALL(callLbl))
                .append(LLVMAsm.JMP(jmpTo));
        return LLVMAsm.JMP(lblName) + LLVMAsm.LBL(lblRet);
    }
    @Override
    public String visitNEQCALL_THEN_JMP_EXTENDED(langosIRParser.NEQCALL_THEN_JMP_EXTENDEDContext ctx) {
        String check = ctx.ID(0).getText();
        String ifFalse = ctx.ID(1).getText();
        String jmpTo = ctx.ID(2).getText();
        String jmpTrue = ctx.ID(3).getText();

        String lblName = "NEQCALL_THEN_JMP_EXTENDED_" + check + "_" + ifFalse + "_" + jmpTo;
        String lbl = IdGenerator.lbl() + "_";
        toFuncEnd.append(LLVMAsm.LBL(lblName))
                .append(LLVMAsm.NEQ(check, lbl, jmpTrue))
                .append(LLVMAsm.LBL(lbl))
                .append(LLVMAsm.CALL(ifFalse))
                .append(LLVMAsm.JMP(jmpTo));
        return LLVMAsm.JMP(lblName);
    }
    @Override public String visitJmps(langosIRParser.JmpsContext ctx) {
        if(ctx.jmp() != null) return visitJmp(ctx.jmp());
        if(ctx.eq() != null) return visitEq(ctx.eq());
        if(ctx.eQCALL_THEN_JMP() != null) return visitEQCALL_THEN_JMP(ctx.eQCALL_THEN_JMP());
        if(ctx.nEQCALL_THEN_JMP_EXTENDED() != null) return visitNEQCALL_THEN_JMP_EXTENDED(ctx.nEQCALL_THEN_JMP_EXTENDED());
        return "";
    }
    @Override public String visitLbl(langosIRParser.LblContext ctx) {
        return LLVMAsm.LBL(ctx.ID().getText());
    }
}
