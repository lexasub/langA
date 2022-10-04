package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lexasub.langosThirdTryWithoutPromise.frontend.mylangosWithoutSyntaxVisitor;
import org.lexasub.langosThirdTryWithoutPromise.langosWithoutSyntaxParser;
import org.mockito.Mockito;

import java.util.LinkedList;

import static org.lexasub.langosThirdTryWithoutPromise.TestHelper.*;

class mylangosWithoutSyntaxVisitorTest {
    private mylangosWithoutSyntaxVisitor v  = new mylangosWithoutSyntaxVisitor();

    @Test
    void testVisitElement() {
        langosWithoutSyntaxParser.ElementContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.ElementContext.class);
        langosWithoutSyntaxParser.ExprContext s = spawnExpr(spawnID("s"));
        Mockito.when(dataService.expr()).thenReturn(s);
        String actual = v.visitElement(dataService);
        Assertions.assertEquals("s\n", actual);
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
    void testVisitWith_(){
        langosWithoutSyntaxParser.With_Context wc = Mockito.mock(langosWithoutSyntaxParser.With_Context.class);

        TerminalNode test = spawnID("test");
        langosWithoutSyntaxParser.ExprContext ec = spawnExpr(test);
        langosWithoutSyntaxParser.Parened_exprContext pec = Mockito.mock(langosWithoutSyntaxParser.Parened_exprContext.class);
        Mockito.when(pec.expr()).thenReturn(ec);
        Mockito.when(wc.parened_expr()).thenReturn(pec);
        langosWithoutSyntaxParser.With_synonymContext sc = Mockito.mock(langosWithoutSyntaxParser.With_synonymContext.class);
        Mockito.when(sc.ID()).thenReturn(test);
        Mockito.when(wc.with_synonym()).thenReturn(sc);
        langosWithoutSyntaxParser.With_bodyContext r = Mockito.mock(langosWithoutSyntaxParser.With_bodyContext.class);
        Mockito.when(r.expr()).thenReturn(ec);

        LinkedList<langosWithoutSyntaxParser.With_bodyContext> t = new LinkedList<>();
        t.add(r);
        t.add(r);

        Mockito.when(wc.with_body()).thenReturn(t);
        String actual = v.visitWith_(wc);
        Assertions.assertTrue(actual.matches("test\n" +
                "POP test\n" +
                "test\n" +
                "\n" +
                "test\n" +
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