package strings;

import java.util.Scanner;

public class AlternateWordOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Please enter the input string:");
        String input = sc.nextLine();

        System.out.println("Input: " + input);

        // Split input into words
        String[] words = input.split(" ");

        String outputString = "";

        // Process each word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            // Even index -> convert to uppercase
            if (i % 2 == 0) {
                outputString += word.toUpperCase();
            }

            // Odd index -> reverse word
            else {
                outputString += getReverseString(word);
            }

            // Add space except after last word
            if (i != words.length - 1) {
                outputString += " ";
            }
        }

        System.out.println("Output: " + outputString);

        sc.close();
    }

    // Method to reverse a string
    public static String getReverseString(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return reverse;
    }
}