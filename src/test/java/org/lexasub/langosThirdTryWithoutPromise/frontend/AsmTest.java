package org.lexasub.langosThirdTryWithoutPromise.frontend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lexasub.langosThirdTryWithoutPromise.frontend.utils.PairString;

import java.util.LinkedList;
import java.util.stream.Stream;

public class AsmTest {
    @Test
    void testPOP(){
        Assertions.assertEquals(Asm.POP("test"), "POP test\n");
    }
    @Test
    void testPUSH(){
        Assertions.assertEquals(Asm.PUSH("test"), "PUSH test\n");
    }
    @Test
    void testGetArg(){
        Assertions.assertEquals(Asm.getArg("test"), Asm.POP("test"));
    }
    @Test
    void testSetArg(){
        Assertions.assertEquals(Asm.setArg("test"), Asm.PUSH("test"));
    }
    @Test
    void testCreateFunction(){
        String type=null;
        String name="calc";
        String args="";
        String body="";
        String function = Asm.createFunction(type, name, args, body);
        Assertions.assertTrue(function.matches(Asm.LABEL("FUNCTION_" + name)+"ENTERSCOPE\n" + Asm.RET()+"EXITSCOPE\n"));
    }
    @Test
    void testNEQ(){
        Assertions.assertEquals(Asm.NEQ("test"), "NEQ test\n");
    }
    @Test
    void testEQ(){
        Assertions.assertEquals(Asm.EQ("test"), "EQ test\n");
    }
    @Test
    void testJMP(){
        Assertions.assertEquals(Asm.JMP("test"), "JMP test\n");
    }
    @Test
    void testRET(){
        Assertions.assertEquals(Asm.RET(), "RET\n");
    }
    @Test
    void testLABEL(){
        Assertions.assertEquals(Asm.LABEL("test"), "test:\n");
    }
    @Test
    void testIntoScope(){
        Assertions.assertEquals(Asm.intoScope("test"), "INTOSCOPE test\n");
    }
    @Test
    void testCreateLambda(){
        String r = "[\\u0030-\\u003a\\u0041-\\u005b\\u0061-\\u007b]{10}";
        Stream<String> args = new LinkedList<String>().stream();
        String body = "";
        PairString lambda = Asm.createLambda(args, body);
        String regex = "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n";
        Assertions.assertTrue(lambda.a.matches(regex));
        Assertions.assertTrue(lambda.b.matches("BEGIN_lambda_"+r));
    }
	@Test
    void testMOVMEMBER(){
        Assertions.assertEquals(Asm.MOVMEMBER("r0", "f"), "MOVMEMBER r0, f\n");
    }
	@Test
    void testRETURN(){
        Assertions.assertEquals(Asm.RETURN(), "RETURN\n");
    }
	@Test
    void testCONTINUE(){
        Assertions.assertEquals(Asm.CONTINUE(), "CONTINUE\n");
    }
	@Test
    void testBREAK(){
        Assertions.assertEquals(Asm.BREAK(), "BREAK\n");
    }
	@Test
    void testCALL(){
        Assertions.assertEquals(Asm.CALL("test"), "CALL test\n");
    }
	@Test
    void testIMPORT(){
        LinkedList<String> args = new LinkedList<String>();
        args.push("s");
        args.push("e");
        args.push("rr");
        Assertions.assertEquals(Asm.IMPORT(args.stream()), "IMPORT rr/e/s\n");
    }
	@Test
    void testMAP(){
        Assertions.assertTrue(Asm.MAP("a", "b").matches("MAP a, b\n"));
    }
	@Test
    void testPAIRMAP(){
        Assertions.assertTrue(Asm.PAIRMAP("a", "b", "c").matches("PAIRMAP a, b, c\n"));
    }
    @Test
    void testMAPo(){
        Assertions.assertTrue(Asm.MAPo("a", "b").matches("MAPo a, b\n"));
    }
    @Test
    void testPAIRMAPo_(){
        Assertions.assertTrue(Asm.PAIRMAPo_("a", "b", "c").matches("PAIRMAPo_ a, b, c\n"));
    }
    @Test
    void testPAIRMAP_o(){
        Assertions.assertTrue(Asm.PAIRMAP_o("a", "b", "c").matches("PAIRMAP_o a, b, c\n"));
    }
    @Test
    void testPAIRMAPoo() {
        Assertions.assertTrue(Asm.PAIRMAPoo("a", "b", "c").matches("PAIRMAPoo a, b, c\n"));
    }
    @Test
    void testSetArgLastRes(){
        Assertions.assertTrue(Asm.setArgLastRes().matches("LAST_RES_TO_STACK\n"));
    }
    //TODO?? printTest?
}
