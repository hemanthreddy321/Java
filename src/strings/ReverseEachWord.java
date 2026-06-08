package strings;

import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "java is fun";
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }
        // Add this line to print the final reversed string
        // .trim() removes the extra space added at the very end of the loop
        System.out.println(result.trim());
    }
}

/*

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Java Selenium TestNG";

        // Split the sentence into individual words using spaces
        String[] words = input.split(" ");
        String result = "";

        // Loop through each word in the array
        for (String word : words) {
            // Use StringBuilder's built-in reverse method for simplicity
            StringBuilder sb = new StringBuilder(word);

            // Append the reversed word and a space to the result string
            result += sb.reverse().append(" ").toString();
        }

        // Trim removes the trailing space added in the loop
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result.trim());
    }
}

*/
