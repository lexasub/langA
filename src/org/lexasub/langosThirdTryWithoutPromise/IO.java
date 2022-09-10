package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.lexasub.langosSecondTry.langosWithoutSyntaxLexer;
import org.lexasub.langosSecondTry.langosWithoutSyntaxParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*File file = new File(scanner.next());
        InputStream stream = new DataInputStream(new FileInputStream(file));*/
        //scanner.next()
        CharStream stream = CharStreams.fromFileName("/home/su/IdeaProjects/langA/test", StandardCharsets.US_ASCII);
        langosWithoutSyntaxLexer lexer = new langosWithoutSyntaxLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langosWithoutSyntaxParser parser = new langosWithoutSyntaxParser(tokens);
        MylangosWithoutSyntaxVisitor visitor = new MylangosWithoutSyntaxVisitor();
        String s = visitor.visitEntry_point(parser.entry_point());
        System.out.print(s);

    }
}