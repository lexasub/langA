package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.lexasub.langosSecondTry.langosWithoutSyntaxLexer;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IO {
    public static void main(String[] args) throws IOException {
        CharStream stream = CharStreams.fromFileName("/home/su/IdeaProjects/langA/test", StandardCharsets.US_ASCII);
        langosWithoutSyntaxLexer lexer = new langosWithoutSyntaxLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langosWithoutSyntaxParser parser = new langosWithoutSyntaxParser(tokens);

        Asm.pretty = true;//Set output with tabs
        mylangosWithoutSyntaxVisitor visitor = new mylangosWithoutSyntaxVisitor();
        Asm.print(visitor.visitEntry_point(parser.entry_point()));
    }

}