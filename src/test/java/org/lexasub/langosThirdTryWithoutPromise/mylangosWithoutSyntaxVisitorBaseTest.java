package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;
import org.mockito.Mockito;

import java.util.LinkedList;

class mylangosWithoutSyntaxVisitorBaseTest {

    private mylangosWithoutSyntaxVisitorBase v;

    @Test
    void selectFunction() {
        /*
        FunctionGeneratorsTest t = new FunctionGeneratorsTest();
        t.testIfGenerator();
        t.testWhileGenerator();
        t.testPairMapGenerator();
        t.testMapGenerator();
        t.testUserFunGenerator();
         */
    }

    @Test
    void visitImport_() {
        langosWithoutSyntaxParser.Import_Context dataService =
                Mockito.mock(langosWithoutSyntaxParser.Import_Context.class);
        LinkedList<TerminalNode> l = new LinkedList<>();
        l.add(spawnID("test7"));
        l.add(spawnID("test6"));
        l.add(spawnID("test5"));
        l.add(spawnID("test4"));
        l.add(spawnID("test3"));
        l.add(spawnID("test2"));
        l.add(spawnID("test1"));
        Mockito.when(dataService.ID()).thenReturn(l);
        String s = v.visitImport_(dataService);
        Assertions.assertEquals(s, "IMPORT test7/test6/test5/test4/test3/test2/test1\n");
    }

    private static TerminalNode spawnID(String s) {
        TerminalNode terminalNode =
                Mockito.mock(TerminalNode.class);
        Mockito.when(terminalNode.getText()).thenReturn(s);
        return terminalNode;
    }

    @Test
    void visitType_name() {
        langosWithoutSyntaxParser.Type_nameContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Type_nameContext.class);
       Mockito.when(dataService.ID()).thenReturn(spawnID("s"));
       Assertions.assertEquals(v.visitType_name(dataService),"ID s\n" );
    }

    @Test
    void visitClass_name() {
    }

    @Test
    void visitVar_name() {
    }

    @Test
    void visitMember_name() {
    }

    @Test
    void visitNamspce_obj() {
    }

    @Test
    void visitid() {
    }

    @Test
    void visitid2() {
    }

    @Test
    void testVisitid() {
    }

    @Test
    void visitId_strong() {
    }
}