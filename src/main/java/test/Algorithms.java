package test;

import java.util.Arrays;

public class Algorithms {


    public static void main(String[] args) {
//        List<String> l1 = List.of("Duel", "Deul", "duel", "Fuel", "Flue");
//        List<String> l2 = List.of("Duel", "Fuel");
//        compareString(l1, l2);
//        compareString("abcdeX", "abcdeX");
//        processLog_Java11();
        // processLog_Java8();
        call();

    }


    /**
     * Tìm đối số lớn nhất từ mảng
     */
    static int call() {
        int[] inputArr = {3, 2, -2, 5, 7, -3};

        inputArr = Arrays.stream(inputArr).sorted().toArray();
        for (int i = inputArr.length - 1; i >= 0; i--) {
            for (int j = inputArr.length - 1; j >= 0; j--) {
                int x = inputArr[i];
                int y = inputArr[j];
                if (x == y * -1) {
                    return x;
                }
            }
        }
        return 0;
    }

//    private static void processLog_Java8() throws IOException {
//        Stream<String> lines = Files.lines(Paths.get("H:/workspace/java/system.log"));
//        List<String> result = lines.filter(s -> s.contains("204"))
//                .map(s -> {
//                    s = s.substring(s.indexOf("GET") + 4, s.indexOf("HTTP") - 1);
//                    s = s.substring(s.lastIndexOf("/") + 1);
//                    return s;
//                })
//                .collect(Collectors.toList());
//        System.out.println(result);
//    }
//
//    private static void processLog_Java11() throws IOException {
//        String content = Files.readString(Path.of("H:/workspace/java/system.log"));
//
//        List<String> java11 = content.lines()
//                .filter(s -> s.contains("204"))
//                .map(s -> {
//                    s = s.substring(s.indexOf("GET") + 4, s.indexOf("HTTP") - 1);
//                    s = s.substring(s.lastIndexOf("/") + 1);
//                    return s;
//                })
//                .collect(Collectors.toList());
//        System.out.println(java11);
//    }
//
//    // compare list string
//    private static void compareString(List<String> l1, List<String> l2) {
//
//        for (String s1 : l1) {
//            for (String s2 : l2) {
//                if (compareString(s1, s2) == 0) {
//                    System.out.println(s1);
//                }
//            }
//        }
//
//    }
//
//
//    // compare strings
//    private static int compareString(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            // System.out.println("Length is different");
//            return s1.length() - s2.length();
//        }
//
//        for (int i = 0; i < s2.length(); i++) {
//            int c1 = s1.charAt(i);
//            int c2 = s2.charAt(i);
//            System.out.println(c1);
//            if (c1 != c2) {
//                // System.out.println("It's not equal");
//                return c1 - c2;
//            }
//        }
//        // System.out.println("It's equal");
//        return 0;
//    }
}
