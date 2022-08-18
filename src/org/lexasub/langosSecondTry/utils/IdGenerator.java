package org.lexasub.langosSecondTry.utils;

import java.util.LinkedList;
import java.util.Random;

public class IdGenerator {
    static LinkedList<String> lambdas = new LinkedList<>();
    static LinkedList<String> elems = new LinkedList<>();
    static LinkedList<String> function_name = new LinkedList<>();
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
        return getString(lambdas, "lambda_");
    }

    public static String element() {
        return getString(elems, "element_");
    }

    public static String functionCall() {
        return  getString(function_name, "function_call_");
    }

    private static String getString(LinkedList<String> e, String text) {
        while (true) {
            String s = randomString();
            if(e.stream().filter(i-> i == s).findFirst().isEmpty())
                return text + s;
        }
    }
}
