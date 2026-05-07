package math_logic;

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
