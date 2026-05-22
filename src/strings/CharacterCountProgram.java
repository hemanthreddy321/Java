package strings;

import java.util.Scanner;

public class CharacterCountProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Please enter the input string:");
        String input = sc.nextLine();

        System.out.println("Input: " + input);
        System.out.println("Input Length: " + input.length());

        // Initialize counters
        int upperCaseLetterCount = 0;
        int lowerCaseLetterCount = 0;
        int digitsCount = 0;
        int specialCharacterCount = 0;

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Loop through each character
        for (char ch : characters) {

            if (Character.isUpperCase(ch)) {
                upperCaseLetterCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseLetterCount++;
            } else if (Character.isDigit(ch)) {
                digitsCount++;
            } else {
                specialCharacterCount++;
            }
        }

        // Print output
        System.out.println("Output:");
        System.out.println("Upper case letter count: " + upperCaseLetterCount);
        System.out.println("Lower case letter count: " + lowerCaseLetterCount);
        System.out.println("Digits count: " + digitsCount);
        System.out.println("Special Character count: " + specialCharacterCount);

        sc.close();
    }
}
