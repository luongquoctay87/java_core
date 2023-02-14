package java9_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @SafeVarargs Annotation
 * It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
 * Apply on final method, private method, static method constructor
 * Not apply on Override method
 */
public class SafeVar {

    public static void main(String[] args) {
        SafeVar p = new SafeVar();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");

        List<String> list1 = new ArrayList<String>();
        list.add("Laptop1");
        list.add("Tablet1");
        p.display(list,list1);
    }

    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        Arrays.stream(products).forEach(System.out::println);
    }
}
