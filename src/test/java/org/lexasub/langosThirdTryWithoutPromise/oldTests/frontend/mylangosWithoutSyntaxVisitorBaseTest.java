package org.lexasub.langosThirdTryWithoutPromise.oldTests.frontend;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lexasub.langosThirdTryWithoutPromise.frontend.langosWithoutSyntaxParser;
import org.lexasub.langosThirdTryWithoutPromise.frontend.mylangosWithoutSyntaxVisitorBase;
import org.lexasub.langosThirdTryWithoutPromise.langosWithoutSyntaxParser;
import org.mockito.Mockito;

import java.util.LinkedList;

import static org.lexasub.langosThirdTryWithoutPromise.oldTests.TestHelper.*;

class mylangosWithoutSyntaxVisitorBaseTest {

    private mylangosWithoutSyntaxVisitorBase v  = new mylangosWithoutSyntaxVisitorBase();

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
    void testVisitImport_() {
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
        Assertions.assertEquals("IMPORT test7/test6/test5/test4/test3/test2/test1\n", s);
    }
    @Test
    void testVisitType_name() {
        langosWithoutSyntaxParser.Type_nameContext dataService = spawnTypeName("s");
       Assertions.assertEquals("ID s\n", v.visitType_name(dataService));
    }

    @Test
    void testVisitClass_name() {
        langosWithoutSyntaxParser.Class_nameContext dataService = spawnClassName("s");
        Assertions.assertEquals("s", v.visitClass_name(dataService));
    }


    @Test
    void testVisitVar_name() {
        langosWithoutSyntaxParser.Var_nameContext dataService = spawnVarName("s");
        Assertions.assertEquals("s", v.visitVar_name(dataService));
    }

    @Test
    void testVisitMember_name() {
        langosWithoutSyntaxParser.Member_nameContext dataService = spawnMemberName("s");
        Assertions.assertEquals("ID s\n", v.visitMember_name(dataService));
    }

    @Test
    void testVisitNamspce_obj() {
        langosWithoutSyntaxParser.Namspce_objContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Namspce_objContext.class);
        LinkedList<TerminalNode> l = new LinkedList<>();
        l.add(spawnID("test7"));
        l.add(spawnID("test6"));
        l.add(spawnID("test5"));
        l.add(spawnID("test4"));
        l.add(spawnID("test3"));
        l.add(spawnID("test2"));
        l.add(spawnID("test1"));
        Mockito.when(dataService.ID()).thenReturn(l);
        String s = v.visitNamspce_obj(dataService);
        Assertions.assertEquals("INTOSCOPE test7\n" +
                "INTOSCOPE test6\n" +
                "INTOSCOPE test5\n" +
                "INTOSCOPE test4\n" +
                "INTOSCOPE test3\n" +
                "INTOSCOPE test2\n" +
                "INTOSCOPE test1\n", s);
    }

   /* @Test
    void testVisitid() {
        Assertions.assertEquals("ID s\n", v.visitid(spawnID("s")));
    }

    @Test
    void testVisitid2() {
        Assertions.assertEquals("s", v.visitid2(spawnID("s")));
    }
*/
    @Test
    void testVisitid_() {
        Assertions.assertEquals("s", v.visitid("s"));
    }

    @Test
    void testVisitId_strong() {
        langosWithoutSyntaxParser.Id_strongContext dataService =
                Mockito.mock(langosWithoutSyntaxParser.Id_strongContext.class);
        TerminalNode s = spawnID("s");
        Mockito.when(dataService.ID()).thenReturn(s);
        Assertions.assertEquals("ID s\n", v.visitId_strong(dataService));
    }

}