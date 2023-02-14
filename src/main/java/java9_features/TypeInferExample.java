package java9_features;

public class TypeInferExample {

    public static void main(String[] args) {
        int a = 10, b = 3;

        add(a, b);
        multi(a, b);
        welcome();
    }

    static void add(int a, int b) {
        AnonymousInnerClasses<Integer> classes = new AnonymousInnerClasses<>() {
            @Override
            Integer calculate(int x, int y) {
                return x + y;
            }
        };
        System.out.println("a + b = " + classes.calculate(a, b));
    }

    static void multi(int a, int b) {
        AnonymousInnerClasses<Integer> classes = new AnonymousInnerClasses<Integer>() {
            @Override
            Integer calculate(int x, int y) {
                return x - y;
            }
        };
        System.out.println("a - b = " + classes.calculate(a, b));
    }

    static void welcome() {
        Sayable<?> welcome = new Sayable<Object>() {
            @Override
            Object say(String message) {
                return message;
            }
        };
        System.out.println(welcome.say("Welcome to Jav 9"));
    }
}
