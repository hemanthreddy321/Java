package math_logic;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;       // The original number to reverse
        int reversed = 0;     // Variable to store the final result

        // Loop runs until all digits are processed (num becomes 0)
        while (num != 0) {
            // 1. Get the last digit using remainder (e.g., 1234 % 10 = 4)
            int digit = num % 10;

            // 2. Shift existing reversed digits left and add the new digit
            reversed = reversed * 10 + digit;

            // 3. Remove the last digit from the original number (e.g., 1234 / 10 = 123)
            num = num / 10;
        }

        // Print the final reversed number: 4321
        System.out.println(reversed);
    }
}

