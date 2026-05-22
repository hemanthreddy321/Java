package strings;

import java.util.Scanner;

public class FirstRepeatedAndNonRepeatedChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Please enter the input string:");
        String input = sc.nextLine();

        System.out.println("Input: " + input);

        char firstRepeatedChar = ' ';
        char firstNonRepeatedChar = ' ';

        // Traverse each character
        for (int i = 0; i < input.length(); i++) {

            char tempChar = input.charAt(i);

            // Ignore spaces
            if (tempChar != ' ') {

                // Check non-repeated character
                if (input.indexOf(tempChar) == input.lastIndexOf(tempChar)) {

                    if (firstNonRepeatedChar == ' ') {
                        firstNonRepeatedChar = tempChar;
                    }
                }

                // Check repeated character
                else if (firstRepeatedChar == ' ') {
                    firstRepeatedChar = tempChar;
                }
            }
        }

        // Print output
        System.out.println("Output:");
        System.out.println("First Repeated Char: " + firstRepeatedChar);
        System.out.println("First Non-Repeated Char: " + firstNonRepeatedChar);

        sc.close();
    }
}
