package org.lexasub.langosThirdTryWithoutPromise.frontend.utils;

import java.util.Iterator;
import java.util.Objects;

public class AsmUtils {
    public static boolean pretty = false;
    private static String tab = "";

    protected static String IMPORT_Sys(Iterator<String> it) {
        return "";
    }

    protected static String endScope() {
        return untabulate() + p("EXITSCOPE\n");
    }

    protected static String untabulate() {
        return (pretty) ? "UNTAB\n" : "";
    }

    protected static String tabulate() {
        return (pretty) ? "TAB\n" : "";
    }

    protected static String p(String r) {
        // System.out.print("\t" + r);
        return tab + r;
    }

    protected static String newScope() {
        return p("ENTERSCOPE\n") + tabulate();
    }

    public static String MOV(String src_reg, String dest_reg) {//TODO src_reg - normalF_res, but not dfakof34_res
        if (Objects.equals(dest_reg, "lambda_res"))
            return p("MOV " + dest_reg + ", " + src_reg + "\n");
        return p("MOV " + dest_reg + ", " + src_reg + "\n");
    }

    public static String getReturn(String dst_reg, String func_name) {
        return MOV(func_name + "_res", dst_reg);
    }

    public static String EQ(String check, String lbl) {
        return p("EQ " + check + ", " + lbl + "\n");
    }

    public static String EQCALL_THEN_JMP(String check, String lbl, String last) {
        return p("EQCALL_THEN_JMP " + check + ", " + lbl + ", " + last + "\n");
    }


    public static String NEQCALL_THEN_JMP_EXTENDED(String check, String ifFalse, String jmpToAfterCall, String jmpIfTrue) {
        return p("NEQCALL_THEN_JMP_EXTENDED " + check + ", " + ifFalse + ", " + jmpToAfterCall + ", " + jmpIfTrue + "\n");

    }

    public static String JMP(String lbl) {
        return p("JMP " + lbl + "\n");
    }

    public static String RET() {
        return p("RET\n");
    }

    public static String RET(String reg) {
        return p("RET " + reg + "\n");
    }

    public static String LABEL(String lbl) {
        return p(lbl + ":\n");
    }

    public static String CONTINUE() {
        return p("CONTINUE\n");
    }

    public static String BREAK() {
        return p("BREAK\n");
    }

    public static String CALL(String s) {
        return CALL("i32", s);
    }

    public static String CALL(String type, String s) {
        return p("CALL " + type + ", " + s + "\n");
    }

    public static String MAP(String lblCollBeg, String lblLambdaBegin) {
        return p("MAP " + lblCollBeg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAP(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAP " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String MAPo(String lblCollBeg, String lblLambdaBegin) {
        return p("MAPo " + lblCollBeg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAP_o(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAP_o " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAPo_(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAPo_ " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String PAIRMAPoo(String lblColl1Beg, String lblColl2Beg, String lblLambdaBegin) {
        return p("PAIRMAPoo " + lblColl1Beg + ", " + lblColl2Beg + ", " + lblLambdaBegin + "\n");
    }

    public static String ENDCLASS(String className) {
        return p("ENDCLASS " + className + "\n");
    }

    public static String CLASS(String className) {
        return p("CLASS " + className + "\n");
    }


    public static String declareMember(String type, String name) {
        return p("MEMBER " + type + ", " + name + "\n");
    }

    public static String GET_ELEMENT_PTR(String r, String base, String member) {
        return p("GET_ELEMENT_PTR " + r + ", " + base + ", " + member + "\n");
    }

    public static String FUNCTION_ARGUMENT(String typeName, String varName) {
        return p("FUNCTION_ARGUMENT " + typeName + ", " + varName + "\n");
    }

}
