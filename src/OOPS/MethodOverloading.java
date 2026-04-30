package oops;

class Calculator {
    // 1. Overloaded method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // 2. Overloaded method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(5, 10));          // Calls method 1
        System.out.println(cal.add(5, 10, 15));      // Calls method 2
        System.out.println(cal.add(5.5, 4.5));       // Calls method 3
    }
}

