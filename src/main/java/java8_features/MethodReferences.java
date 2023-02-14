package java8_features;

public class MethodReferences {

    public static void main(String[] args) {
        Calculator addition = MethodReferences::addition;
        Calculator subtraction = MethodReferences::subtraction;
        Calculator multiplication = MethodReferences::multiplication;
        Calculator division = MethodReferences::division;

        addition.reckon(9, 3);
        subtraction.reckon(9, 3);
        multiplication.reckon(9, 3);
        division.reckon(9, 3);

    }

    static void addition(int a, int b) {
        System.out.println(a + b);
    }

    static void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    static void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    static void division(int a, int b) {
        System.out.println(a / b);
    }
}
