package strings;

public class ReverseInOriginalOrder {
    public static void main(String[] args) {
        String input = "ABC123@#!";

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch); // Kept in original order
            } else {
                specialChars.append(ch); // Captures symbols
            }
        }

        //  reverse the letters and digits
        letters.reverse();
        digits.reverse();

        // Combine everything: Reversed Letters +  Digits + Symbols
        String output = letters.toString() + digits.toString() + specialChars.toString();

        System.out.println("Result: " + output);
        // Output for "ABC123@#!" will be "CBA321@#!"
    }
}
