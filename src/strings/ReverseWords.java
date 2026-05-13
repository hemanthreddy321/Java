package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "  Godula   Hemanth  Reddy  ";
        String result = "";
        String word = "";

        // Scan backwards character by character
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                // Build the word forward-facing
                word = ch + word;
            } else {
                // Add the built word and the space to the final result
                result += word + " ";
                word = ""; // Reset for the next word
            }
        }
        // Flush out any remaining first word if the string didn't start with a space
        result += word;

        System.out.println(result);
    }
}
