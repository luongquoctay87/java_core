package java8_features;

public interface Greeting {

    default void say() {
        System.out.println("Hello, Tay");
    }

    private void speak() {
        System.out.println("I'm Java 9");
    }
}
