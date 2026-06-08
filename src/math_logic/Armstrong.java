package math_logic;

/*
An Armstrong number is equal to the sum of its digits raised to the power of the number of digits.
For 153 (3 digits):
        - First digit: 1³ = 1
        - Second digit: 5³ = 125
        - Third digit: 3³ = 27
Now add them: 1 + 125 + 27 = 153.
*/
public class Armstrong {
    public static void main(String[] args) {
        int num = 153; // The number to check
        int original = num; // Store the original value to compare later
        int result = 0; // Variable to accumulate the sum of powers

        // Convert to String to easily count how many digits the number has
        int digits = String.valueOf(num).length();

        // Loop until all digits have been processed
        while (num != 0) {
            // Get the last digit using the remainder operator (%)
            int digit = num % 10;

            // Raise the digit to the power of total 'digits' and add to result
            result += (int) Math.pow(digit, digits);

            // Remove the last digit from the number using integer division
            num /= 10;
        }

        // Check if the calculated sum matches the original input
        if (result == original) {
            System.out.println(original + " is Armstrong");
        } else {
            System.out.println(original + " is not Armstrong");
        }
    }
}
