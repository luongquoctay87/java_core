package algorithms.dynamic_programming;

public class DynamicProgramming {

    public static void main(String[] args) {
        // System.out.println(fibonacci(1));

        System.out.println(greatestCommonDivisor(9, 3));
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Tim USCLN cua 2 so x va y
    static int greatestCommonDivisor(int x, int y) {
        if (y == 0) {
            return x;
        }

        return greatestCommonDivisor(y, x % y);
    }

}
