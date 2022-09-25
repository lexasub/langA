package org.lexasub.langosThirdTryWithoutPromise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lexasub.langosThirdTryWithoutPromise.utils.PairString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;

import static org.lexasub.langosThirdTryWithoutPromise.FunctionGenerators.*;

class FunctionGeneratorsTest {

    public String getFileContent(String filename){
        try {
            return Files.readString(Paths.get (filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testIfGenerator() {//TODO fix IDs
        Function g = ifGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(j)->g(j)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(k)->p(k)")));
        String res = (String) g.apply(l.stream());
        String regex = getFileContent("src/test/java/org/lexasub/langosThirdTryWithoutPromise/FunctionGeneratorRegex/testIfGenerator");
        Assertions.assertTrue(res.matches(regex));
    }

    private PairString findBeginInOneLambda(String iir) {
        String s = Arrays.stream(iir.split("\n")).filter(i -> i.matches("BEGIN_lambda_.*")).findFirst().get();
        s = s.substring(0, s.length() - 1);
        return new PairString(iir, s);
    }

    @Test
    void testWhileGenerator() {
        Function g = whileGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(j)->g(j)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        String res = (String) g.apply(l.stream());
        String regex = getFileContent("src/test/java/org/lexasub/langosThirdTryWithoutPromise/FunctionGeneratorRegex/testWhileGenerator");
        Assertions.assertTrue(res.matches(regex));
    }

    @Test
    void testPairMapGenerator() {
        Function g = pairMapGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(j)->g(j)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(h)->h(h)")));
        String res = (String) g.apply(l.stream());
        String regex = getFileContent("src/test/java/org/lexasub/langosThirdTryWithoutPromise/FunctionGeneratorRegex/testPairMapGenerator");
        //TODO may be fix(r8)
        Assertions.assertTrue(res.matches(regex));
    }

    @Test
    void testMapGenerator() {
        Function g = mapGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(h)->h(h)")));
        String res = (String) g.apply(l.stream());
        String regex = getFileContent("src/test/java/org/lexasub/langosThirdTryWithoutPromise/FunctionGeneratorRegex/testMapGenerator");
        //TODO may be fix(r8)
        Assertions.assertTrue(res.matches(regex));
    }

    @Test
    void testUserFunGenerator() {
        Function g = userFunGenerator("myfunc");
        LinkedList<PairString> l = new LinkedList<>();
        String iir = Asm.getIIR("(i)->f(i)");
        String r = "[\\u0030-\\u003a\\u0041-\\u005b\\u0061-\\u007b]{10}";
        Assertions.assertTrue(iir.matches("JMP END_lambda_"+r+"\n" +
                "BEGIN_lambda_"+r+":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_"+r+":\n" +
                "PUSH BEGIN_lambda_"+r+"\n"));
        l.push(findBeginInOneLambda(iir));
        String res = (String) g.apply(l.stream());
        String regex = "CALL_myfunc:\n" +
                "JMP END_lambda_"+r+"\n" +
                "BEGIN_lambda_"+r+":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_"+r+":\n" +
                "PUSH BEGIN_lambda_"+r+"\n" +
                "PUSH BEGIN_lambda_"+r+"\n" +
                "CALL myfunc\n";
        Assertions.assertTrue(res.matches(regex));
    }
}