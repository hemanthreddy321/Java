package interview;

import java.util.Scanner;

public class AlphanumericCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean isValid = true;

        // Check if input is empty
        if (input.isEmpty()) {
            isValid = false;
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i); // Access character at specific index

                // Manual check using ASCII ranges:
                // Numbers: '0'-'9' (ASCII 48-57)
                // Uppercase: 'A'-'Z' (ASCII 65-90)
                // Lowercase: 'a'-'z' (ASCII 97-122)
                if (!((c >= '0' && c <= '9') ||
                        (c >= 'A' && c <= 'Z') ||
                        (c >= 'a' && c <= 'z'))) {
                    isValid = false;
                    break; // Stop immediately if a non-alphanumeric character is found
                }
            }
        }

        if (isValid) {
            System.out.println("Result: Alphanumeric");
        } else {
            System.out.println("Result: Not Alphanumeric (contains spaces or symbols)");
        }

        sc.close();
    }
}
