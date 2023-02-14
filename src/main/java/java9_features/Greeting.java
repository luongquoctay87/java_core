package java9_features;

public class Greeting implements PrivateInterfaceMethods {

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        PrivateInterfaceMethods greeting = new Greeting();
        greeting.sayHello();
    }

    @Override
    public void create() {
        System.out.println("I'm going to create api");
    }
}
