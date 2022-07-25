package org.lexasub.langos;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*File file = new File(scanner.next());
        InputStream stream = new DataInputStream(new FileInputStream(file));*/
        //scanner.next()
        CharStream stream = CharStreams.fromFileName("/home/su/IdeaProjects/langA/test", StandardCharsets.ISO_8859_1);
        langosLexer lexer = new langosLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        langosParser parser = new langosParser(tokens);
        ParseTree tree = parser.entry_point();
       /* ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new langosWalker(), tree);*/
      /*  ParseTreeListener listener = new org.example.myLangosListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree); */

        MyLangosVisitor visitor = new MyLangosVisitor();
        //visitor.visit(tree);
        visitor.visitEntry_point(parser.entry_point());
        //langosParser.Entry_pointContext s = parser.entry_point();

    }
}