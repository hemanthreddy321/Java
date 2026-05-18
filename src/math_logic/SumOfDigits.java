package math_logic;
//Explanation:
// We use n % 10 to extract the last digit, add it to the sum, and then remove the digit with n /= 10.\

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 352;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

// Even or Odd number

/*
int number = 5;

    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    } else {
            System.out.println(number + " is odd.");
    }*/

/*
int myNum = 10; // Is this a positive or negative number?

if (myNum > 0) {
        System.out.println("The value is a positive number.");
} else if (myNum < 0) {
        System.out.println("The value is a negative number.");
} else {
        System.out.println("The value is 0.");
}*/
