package strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = str.split(" ");
        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}

/*public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Java is fun";
        // 1. Split string into words by spaces
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            // 2. Reverse each word and append it
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        // 3. Trim to remove the final extra space
        result.toString().trim();
        System.out.println((result)); // Output: avaJ si nuf
    }
}*/
