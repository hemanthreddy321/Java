package strings;

public class LongestSmallestWord {
    public static void main(String[] args) {
        String str = "I love selenium automation";

        String[] words = str.split(" ");

        // Initialize both with the first word
        String longest = words[0];
        String smallest = words[0];

        for(String word : words) {
            // Check for the longest word
            if(word.length() > longest.length()) {
                longest = word;
            }
            // Check for the smallest word
            if(word.length() < smallest.length()) {
                smallest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Smallest word: " + smallest);
    }
}
