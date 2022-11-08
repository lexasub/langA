package org.lexasub.langosThirdTryWithoutPromise.backMiddleend;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {

        //Asm.pretty = true;//Set output with tabs
        //Asm.print(visit(getParser("test")));
        LLVMAsm.pretty = true;
        org.lexasub.langosThirdTryWithoutPromise.frontend.langosWithoutSyntaxParser r =
                org.lexasub.langosThirdTryWithoutPromise.frontend.IO.getParser("test");
        String asm = org.lexasub.langosThirdTryWithoutPromise.frontend.IO.visit(r);
        LLVMAsm.print(visit(getParser(asm)));
    }

    public static langosIRParser getParser(String data) throws IOException {
        CharStream stream = CharStreams.fromString(data);//fromFileName(filemame, StandardCharsets.UTF_8);
        langosIRLexer lexer = new langosIRLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langosIRParser parser = new langosIRParser(tokens);
        return parser;
    }

    public static String visit(langosIRParser parser) {
        mylangosIRVisitor visitor = new mylangosIRVisitor();
        return visitor.visitEntry_point(parser.entry_point());
    }

}