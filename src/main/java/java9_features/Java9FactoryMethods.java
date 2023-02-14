package java9_features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9FactoryMethods {

    public static void main(String[] args) {
        List<String> list = List.of("Java", "PHP", "Python");
        list.stream().forEach(System.out::println);

        Map<Integer, String> map = Map.of(1, "Vietnam", 2, "Lao", 3, "Cambodia");
        map.forEach((index, s) -> System.out.println(index + "=" + s));

        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String s:set) {
            System.out.println(s);
        }
    }
}
