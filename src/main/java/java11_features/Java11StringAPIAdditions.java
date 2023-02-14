package java11_features;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//https://www.baeldung.com/java-11-string-api
public class Java11StringAPIAdditions {

    public static void main(String[] args) {
        strip();
        stripWithLambda();
        differenceBetweenStripAndTrim();
        repeat();
        isBlank();
        lines();
    }

    private static void lines() {
        String multilineStr = "This is\n \n a multiline\n string.";

        long lineCount = multilineStr.lines()
                .filter(Predicate.not(String::isBlank)) // .filter(line->!line.isBlank())
                .count();
        System.out.println(lineCount);
    }


    /**
     * The isBlank() instance method returns true if the string is empty or contains only whitespace. Otherwise, it returns false:
     */
    private static void isBlank() {
        String test = "\n\t\u2005  ";
        if (test.isBlank())
            System.out.println("Blank");
        else
            System.out.println("Not Blank");
    }

    /**
     * It returns a string whose value is the concatenation of the string repeated n times, where n is passed as a parameter:
     */
    static void repeat() {
        String test = "Hello";
        System.out.println(test.repeat(3) + " Ong Tay");
    }

    /**
     * strip*() determines whether the character is whitespace or not based on Character.isWhitespace(). In other words,  it is aware of Unicode whitespace characters.
     * This is different from trim(), which defines space as any character that is less than or equal to the Unicode space character (U+0020).
     */
    static void differenceBetweenStripAndTrim() {
        String test = "\n\t  hello   \u0020";

        System.out.println("-- strip()--");
        if (test.strip().equals("hello")) {//remove dc ca khoang trang, tab, new line, \
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println("-- trim()--");
        if (test.trim().equals("hello")) { // No xac dinh khoang trang dua tren unicode(U+0020)
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    static void stripWithLambda() {
        String string = "Hello Darling\n My name is Tay. \nI come from Vietnam\n\nBest regard";
        List<String> lines = string.lines()
                .filter(line->!line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        for (String s: lines) {
            System.out.println(s);
        }
    }
    static void strip() {
        String str = " Hello, World ";

        // print the string without any function
        System.out.println("String is");
        System.out.println("#" + str + "#");
        System.out.println();

        // using strip() method
        System.out.println("Using strip()");
        System.out.println("#" + str.strip() + "#");
        System.out.println();

        // using stripLeading() method
        System.out.println("Using stripLeading()");
        System.out.println("#" + str.stripLeading() + "#");
        System.out.println();

        // using stripTrailing() method
        System.out.println("Using stripTrailing()");
        System.out.println("#" + str.stripTrailing() + "#");
    }

}
