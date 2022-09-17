package org.lexasub.langosThirdTryWithoutPromise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lexasub.langosThirdTryWithoutPromise.utils.PairString;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;

import static org.lexasub.langosThirdTryWithoutPromise.FunctionGenerators.*;

class FunctionGeneratorsTest {

    private final String r = "[\\u0030-\\u003a\\u0041-\\u005b\\u0061-\\u007b]{10}";

    @Test
    void testIfGenerator() {//TODO fix IDs
        Function g = ifGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(j)->g(j)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(k)->p(k)")));
        String res = (String) g.apply(l.stream());
        String regex = "CALL BEGIN_lambda_" + r + "\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP k\n" +
                "CALL_p:\n" +
                "PUSH k\n" +
                "CALL p\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "EQ lbl_" + r + "\n" +
                "CALL BEGIN_lambda_" + r + "\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "JMP lbl_" + r + "\n" +
                "CALL BEGIN_lambda_" + r + "\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP j\n" +
                "CALL_g:\n" +
                "PUSH j\n" +
                "CALL g\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "ENDIF_lbl_" + r + ":\n";
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
        String regex = "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "EQ lbl_" + r + "\n" +
                "CALL BEGIN_lambda_" + r + "\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP j\n" +
                "CALL_g:\n" +
                "PUSH j\n" +
                "CALL g\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "JMP BEGIN_lambda_" + r + "\n" +
                "ENDWHILE_lbl_" + r + ":\n";
        Assertions.assertTrue(res.matches(regex));
    }

    @Test
    void testPairMapGenerator() {
        String r8 = "[\\u0030-\\u003a\\u0041-\\u005b\\u0061-\\u007b]{8}";
        Function g = pairMapGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(j)->g(j)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(h)->h(h)")));
        String res = (String) g.apply(l.stream());
        String regex = "JMP lbl_" + r + "\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP h\n" +
                "CALL_h:\n" +
                "PUSH h\n" +
                "CALL h\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP j\n" +
                "CALL_g:\n" +
                "PUSH j\n" +
                "CALL g\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "ENDMAP_lbl_" + r + ":\n" +
                "PAIRMAP BEGIN_lambda_" + r8 + ", BEGIN_lambda_" + r8 + ", BEGIN_lambda_" + r8 + "\n";
        //TODO may be fix(r8)
        Assertions.assertTrue(res.matches(regex));
    }

    @Test
    void testMapGenerator() {
        String r8 = "[\\u0030-\\u003a\\u0041-\\u005b\\u0061-\\u007b]{8}";
        Function g = mapGenerator();
        LinkedList<PairString> l = new LinkedList<>();
        l.push(findBeginInOneLambda(Asm.getIIR("(i)->f(i)")));
        l.push(findBeginInOneLambda(Asm.getIIR("(h)->h(h)")));
        String res = (String) g.apply(l.stream());
        String regex = "JMP lbl_" + r +  "\n" +
                "JMP END_lambda_" + r +  "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP h\n" +
                "CALL_h:" + "\n" +
                "PUSH h" + "\n" +
                "CALL h\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "ENDMAP_lbl_" + r + ":\n" +
                "MAP BEGIN_lambda_" + r8 + ", BEGIN_lambda_" + r8 +
                "\n";
        //TODO may be fix(r8)
        Assertions.assertTrue(res.matches(regex));
    }

    @Test
    void testUserFunGenerator() {
        Function g = userFunGenerator("myfunc");
        LinkedList<PairString> l = new LinkedList<>();
        String iir = Asm.getIIR("(i)->f(i)");
        Assertions.assertTrue(iir.matches("" +
                "JMP END_lambda" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n"));
        l.push(findBeginInOneLambda(iir));
        String res = (String) g.apply(l.stream());
        String regex = "CALL_myfunc:\n" +
                "JMP END_lambda_" + r + "\n" +
                "BEGIN_lambda_" + r + ":\n" +
                "ENTERSCOPE\n" +
                "POP i\n" +
                "CALL_f:\n" +
                "PUSH i\n" +
                "CALL f\n" +
                "RET\n" +
                "EXITSCOPE\n" +
                "END_lambda_" + r + ":\n" +
                "PUSH BEGIN_lambda_" + r + ":\n\n" +
                "CALL myfunc\n";
        Assertions.assertTrue(res.matches(regex));
    }
}