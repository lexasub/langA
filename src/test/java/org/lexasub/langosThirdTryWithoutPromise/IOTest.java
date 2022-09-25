package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.misc.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IOTest {

    private static String testPath = "/tmp/test";
    private static String readFile (String s) {
        Path path = Paths.get(s);
        try {
            return Files.readAllLines(path).stream()
                    .map(i -> i + "\n")
                    .reduce("", String::concat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Stream<Pair<String,String >> readFiles(String folderPath){

        Stream<Pair<String,String >> filesInFolder = null;
        String folderPath2 = "src/test/java/org/lexasub/langosThirdTryWithoutPromise/testResults";
        try {
            filesInFolder = Files.walk(Paths.get(folderPath))
                    .filter(Files::isRegularFile)
                    .map((i) -> {
                        try {
                            return new Pair<>(
                                    Files.readString(i), //readSource
                                    readFile(folderPath2+"/"+i.toFile().getName()) //readNeeded
                            );
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return filesInFolder;
    }
    @Test
    void testVisit() throws IOException {
        LinkedList<Pair<String, String>> m = new LinkedList<>();
        m.add(new Pair<>("import a.g.b;", "IMPORT a/g/b\n"));
        String folderPath = "src/test/java/org/lexasub/langosThirdTryWithoutPromise/testFiles";
        Stream<Pair<String,String >> rStream = readFiles(folderPath);
        m.addAll(rStream.collect(Collectors.toList()));
        String s1 = "";
        String s2 = "";
        writeSource(s1, 999);
        matchIR(s2, 999);
        testMap(m);
    }


    private static void testMap(LinkedList<Pair<String, String>> m) throws IOException {
        Iterator<Pair<String, String>> it = m.iterator();
        for(int i = 0; it.hasNext(); ++i) {
            Pair<String, String> next = it.next();
            writeSource(next.a, i);
            matchIR(next.b, i);
        }
    }

    private static void matchIR(String s, int i) throws IOException {
        String result = IO.visit(IO.getParser(testPath + i + ".txt"));
        boolean matches = result.matches(s);
        if(!matches) System.out.println("IO_RES:\n" + result + "IO_PATTERN:\n" + s);
        Assertions.assertTrue(matches);
    }

    private static void writeSource(String s, int i) throws IOException {
        DataOutputStream cout = createFile(testPath + i + ".txt");
        System.out.println("IO_TEST:\n" + s);
        cout.writeBytes(s);
        cout.close();
    }


    private static DataOutputStream createFile(String first) throws FileNotFoundException {
        Path filePath = Path.of(first);
        FileOutputStream outputStream = new FileOutputStream(filePath.toFile());
        DataOutputStream cout = new DataOutputStream(outputStream);
        return cout;
    }
}