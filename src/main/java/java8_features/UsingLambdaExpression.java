package java8_features;

public class UsingLambdaExpression {


    public static void main(String[] args) {
        greeting();
        calculate(9, 3);
        Speak speak = new Speak();
        speak.say();


    }

    public static void greeting() {
        Sayable hello = () -> {
            System.out.println("Hello world !");
        };
        Sayable morning = () -> {
            System.out.println("Good morning !");
        };
        hello.say();
        morning.say();


    }

    public static void calculate(int x, int y) {
        Calculator add = (a, b) -> {
            System.out.println(a + b);
        };
        add.reckon(x, y);

        Calculator device = (a, b) -> {
            System.out.println(a / b);
        };
        device.reckon(x, y);
    }
}
