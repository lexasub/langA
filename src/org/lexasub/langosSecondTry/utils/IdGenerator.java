package org.lexasub.langosSecondTry.utils;

import java.util.LinkedList;
import java.util.Random;

public class IdGenerator {
    static LinkedList<String> lambdas = new LinkedList<>();
    static LinkedList<String> elems = new LinkedList<>();
    public static String randomString() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
    public static String lambda() {
        String s = randomString();
        while (true) {
            if(lambdas.stream().filter(i-> i == s).findFirst().isEmpty())
                return "lambda_" + s;
        }
    }

    public static String element() {
        String s = randomString();
        while (true) {
            if(elems.stream().filter(i-> i == s).findFirst().isEmpty())
                return "element_" + s;
        }
    }
}
