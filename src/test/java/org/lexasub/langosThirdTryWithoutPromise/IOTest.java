package org.lexasub.langosThirdTryWithoutPromise;

import org.antlr.v4.runtime.misc.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.LinkedList;

class IOTest {

    @Test
    void testVisit() throws IOException {
        LinkedList<Pair<String, String>> m = new LinkedList<>();
        m.add(new Pair<>("import a.g.b;", "IMPORT a/g/b\n"));
        String s1 = "";
        String s2 = "";
        testMapPart1(s1, 999);
        testMapPart2(s2, 999);
        testMap(m);
    }

    private static void testMap(LinkedList<Pair<String, String>> m) throws IOException {
        Iterator<Pair<String, String>> it = m.iterator();
        for(int i = 0; it.hasNext(); ++i) testMapPart1(it.next().a, i);
        it = m.iterator();
        for(int i = 0; it.hasNext(); ++i) testMapPart2(it.next().b, i);
    }

    private static void testMapPart2(String s, int i) throws IOException {
        Assertions.assertEquals(s, IO.visit(IO.getParser("/tmp/test" + i + ".txt")));
    }

    private static void testMapPart1(String s, int i) throws IOException {
        DataOutputStream cout = createFile("/tmp/test" + i + ".txt");
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