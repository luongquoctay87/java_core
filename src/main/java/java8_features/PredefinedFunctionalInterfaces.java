package java8_features;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.
public class PredefinedFunctionalInterfaces {

    public static void main(String[] args) {
        // Consumer<T> It represents an operation that accepts a single argument and returns no result.
        Consumer<String> message = PredefinedFunctionalInterfaces::message;
        Consumer<Integer> i = PredefinedFunctionalInterfaces::print;
        message.accept("Hello vietnam !");
        i.accept(5+6);


    }

    static int sum(List<Integer> list) {
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        return sum;
    }

    static void print(int x) {
        System.out.println(x);
    }

    static void message(String message) {
        System.out.println(message);
    }
}
