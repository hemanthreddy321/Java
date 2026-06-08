package math_logic;

/*
    A Fibonacci series is a sequence of numbers where each number is the
    sum of the two preceding ones, starting from 0 and 1 (e.g.0 1 1 2 3 5 8 13 21 34))
*/

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, c, count = 10;
        System.out.print(a + " " + b);
        for (int i = 2; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }
}
