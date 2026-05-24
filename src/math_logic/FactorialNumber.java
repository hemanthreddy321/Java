package math_logic;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        //5= 5x4x3x2x1
    }
}
