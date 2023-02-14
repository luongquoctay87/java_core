package java9_features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9StreamAPI {

    public static void main(String[] args) {
//        takeWhile();

        dropWhile();

//        ofNullable();

//        iterate();

    }

    private static void iterate() {
        // create a stream using iterate
        Stream<Integer> stream
                = Stream.iterate(2,
                i -> i <= 100, i -> i * 2);

        // print Values
        stream.forEach(System.out::println);
    }

    private static void ofNullable() {
        Stream<Integer> val
                = Stream.ofNullable(null);
        val.forEach(System.out::println);
    }

    /**
     * Stream dropWhile method returns result on the basis of order of stream elements.
     * Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.
     * Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of elements that match the given predicate.
     */
    private static void dropWhile() {
        List<Integer> list
                = Stream.of(2, 2, 3, 2, 5, 6, 7, 8, 9, 10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * Stream takeWhile method takes each element that matches its predicate. It stops when it gets unmatched element.
     * It returns a subset of elements that contains all matched elements, other part of stream is discarded.
     */
    private static void takeWhile() {
        List<Integer> noResult
                = Stream.of(1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println("No result: " + noResult);

        List<Integer> result = Stream.of(2, 2, 3, 2, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println("Result: " + result);
    }
}
