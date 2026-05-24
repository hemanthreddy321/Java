package strings;

public class AlternateWordOperation {
    public static void main(String[] args) {
        // Hardcoded input string to replace Scanner
        String text = "hello world welcome to java";
        String[] words = text.split(" ");
        String result = "";

        // Process each word based on its position
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                // Even index: convert word to uppercase
                result += words[i].toUpperCase();
            } else {
                // Odd index: reverse the word using StringBuilder
                result += new StringBuilder(words[i]).reverse().toString();
            }

            // Add a space between words, but not after the last one
            if (i != words.length - 1) {
                result += " ";
            }
        }

        // Print final output
        System.out.println("Output: " + result);
    }
}
