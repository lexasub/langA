package org.lexasub.langosSecondTry;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lexasub.langos.langosLexer;
import org.lexasub.langosSecondTry.utils.Promise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Stream;

public class IO {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*File file = new File(scanner.next());
        InputStream stream = new DataInputStream(new FileInputStream(file));*/
        //scanner.next()
        CharStream stream = CharStreams.fromFileName("/home/su/IdeaProjects/langA/test", StandardCharsets.ISO_8859_1);
        langosLexer lexer = new langosLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langosWithoutSyntaxParser parser = new langosWithoutSyntaxParser(tokens);
        ParseTree tree = parser.entry_point();
       /* ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new langosWalker(), tree);*/
      /*  ParseTreeListener listener = new org.example.myLangosListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree); */

        MylangosWithoutSyntaxVisitor visitor = new MylangosWithoutSyntaxVisitor();
        //visitor.visit(tree);
        Stream<Promise> res = visitor.visitEntry_point(parser.entry_point(),new Scope());
        res.map(Promise::get);//...
        //langosParser.Entry_pointContext s = parser.entry_point();

    }
}