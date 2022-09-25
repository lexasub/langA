package org.lexasub.langosThirdTryWithoutPromise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.lexasub.langosThirdTryWithoutPromise.TestHelper.*;

class mylangosWithoutSyntaxVisitorTest {
    private mylangosWithoutSyntaxVisitor v  = new mylangosWithoutSyntaxVisitor();

    @Test
    void testVisitElement() {
        langosWithoutSyntaxParser.ElementContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.ElementContext.class);
        langosWithoutSyntaxParser.FunctionContext s = spawnFunction(spawnTypeName("int"),spawnVarName("s"));
        Mockito.when(dataService.function()).thenReturn(s);
        Assertions.assertEquals("s", v.visitElement(dataService));
    }
    @Test
    void testVisitFunction() {
        langosWithoutSyntaxParser.FunctionContext s = spawnFunction(spawnTypeName("int"),spawnVarName("s"));
        Assertions.assertEquals("s", v.visitFunction(s));
    }

    @Test
    void testVisitFunc_args() {
    }

    @Test
    void testVisitBraced_element() {
    }

    @Test
    void testVisitFunction_call_helper() {
    }

    @Test
    void testVisitGet_member() {
        String r = "[\\u0030-\\u003a\\u0041-\\u005b\\u0061-\\u007b]{10}";
        langosWithoutSyntaxParser.Get_memberContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Get_memberContext.class);
        langosWithoutSyntaxParser.Class_nameContext myclass = spawnClassName("myclass");
        Mockito.when(dataService.class_name()).thenReturn(myclass);
        langosWithoutSyntaxParser.Member_nameContext text = spawnMemberName("text");
        Mockito.when(dataService.member_name()).thenReturn(text);
        String actual = v.visitGet_member(dataService);
        Assertions.assertTrue(actual.matches("INTOSCOPE myclass\n" +
                "MOVMEMBER gr_" + r + ", ID text\n" +
                "\n"));
    }

    @Test
    void testVisitExprPart() {
        Assertions.assertEquals(v.visitExprPart(new langosWithoutSyntaxParser.ExprContext(null,0)), null);
    }

    @Test
    void testVisitExpr() {
    }

    @Test
    void testVisitExprFuncall() {
    }

    @Test
    void testVisitLambda_() {
    }

    @Test
    void testVisitFunction_call() {
    }

    @Test
    void testVisitMethod_call() {
    }

    @Test
    void testVisitFunction_call_() {
    }

    @Test
    void testVisitFun_name() {
    }

    @Test
    void testVisitFlow_control() {
    }

    @Test
    void testVisitReturn_expr() {
    }

    @Test
    void testVisitClass_() {
    }
}