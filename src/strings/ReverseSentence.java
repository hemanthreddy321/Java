package strings;

public class ReverseSentence {
    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = input.split(" "); // Splits the string at each space
        StringBuilder sb = new StringBuilder();

        // Iterate backwards through the array
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
            // Add space between words but not after the last one
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + sb.toString().trim());


/*      String input = "Java is fun";
        String[] words = input.split(" ");
        String result = "";

        // Loop backwards through the words array
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i]+ " ";
        }
        System.out.println(result); // Output: "fun is Java"*/
    }
}

