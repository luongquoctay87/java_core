package java11_features;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CollectionToArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "PHP", "Python");
        String[] strings = list.toArray(String[]::new);
        Arrays.stream(strings).parallel().forEach(System.out::println);

    }
}
