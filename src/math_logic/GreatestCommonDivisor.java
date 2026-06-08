package math_logic;

public class GreatestCommonDivisor {
    static void main() {
        int a = 36;
        int b = 60;
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD: " + gcd);
    }
}


/*
Explanation:
We want the largest number that divides both 36 and 60 without a remainder.
The loop starts at 1 and goes up to the smaller number (36).
At each step, we check if i divides both numbers (using %, the remainder operator).
If it does, we update gcd to that value.

For example:
        36 % 12 == 0 and 60 % 12 == 0, so 12 is a divisor of both.
        Later, the loop finds gcd = 12 as the largest common divisor.
        So the program prints GCD: 12.
*/
