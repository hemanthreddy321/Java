package math_logic;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 29;  // Number used to check
        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + (isPrime ? " is prime" : " is not prime"));
    }
}

/*
int num = 29;
boolean isPrime = true;

if (num <= 1) {
    isPrime = false;
} else {
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }
}
System.out.println(num + (isPrime ? " is a Prime number" : " is not a Prime number"));
 */

/*
Explanation:
We start with the number 29. Since 29 is greater than 1, the loop checks
if it can be divided evenly by any number from 2 up to the square root of 29 (about 5.38).
The numbers 2, 3, 4, and 5 do not divide 29 without a remainder, so the program concludes that 29 is prime.
*/
