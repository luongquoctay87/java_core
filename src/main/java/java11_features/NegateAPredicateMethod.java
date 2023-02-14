package java11_features;

import data.MockUp;
import data.Order;

import java.util.List;
import java.util.function.Predicate;

public class NegateAPredicateMethod {

    public static void main(String[] args) {
        List<Order> people = MockUp.orderList();

        System.out.println("--- Vendor is blank ---");
        people.stream().filter(order -> order.getVendor().isBlank()).forEach(System.out::println);


        System.out.println("\n--- Vendor is not blank---");
        people.stream().filter(Predicate.not(Order::isVendor)).forEach(System.out::println);
    }
}
