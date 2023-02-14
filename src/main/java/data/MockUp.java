package data;

import java.util.ArrayList;
import java.util.List;

public class MockUp {

    public static List<Order> orderList() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Iphone 14", "Mobile", "Apple", 1, 580.25));
        orders.add(new Order(2, "Iphone 14 Pro", "Mobile", "Apple", 1, 700));
        orders.add(new Order(3, "Samsung Galaxy", "Mobile", "Samsung", 1, 400));
        orders.add(new Order(4, "Samsung Watch5", "Watch", "Samsung", 2, 650));
        orders.add(new Order(5, "MacBook pro", "Laptop", "Apple", 2, 1300));
        orders.add(new Order(6, "Nokia 2630", "Mobile", "", 1, 100));
        return orders;
    }
}
