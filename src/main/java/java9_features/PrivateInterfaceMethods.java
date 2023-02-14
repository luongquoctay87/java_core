package java9_features;


public interface PrivateInterfaceMethods {

    default void sayHello() {
       speak();
       goodbye();
    }

    private void speak() {
        System.out.println("Welcome to Java 9");
    }

    // new feature in java 9
    private static void goodbye() {
        System.out.println("Good bye!");
    }

    void create();
}
