package strings;

public class LongestSmallestWord {

    public static void main(String[] args) {

        String str = "I love selenium automation";
        String[] words = str.split(" ");

        // Initialize safely with null for the 'second' variables
        String longest = words[0];
        String secondLongest = null;

        String smallest = words[0];
        String secondSmallest = null;

        for (String word : words) {

            // Longest and Second Longest
            if (word.length() > longest.length()) {
                secondLongest = longest;
                longest = word;
            }
            // Check if it's not the longest, AND (it's the first secondLongest found OR it's longer than current secondLongest)
            else if (!word.equals(longest) && (secondLongest == null || word.length() > secondLongest.length())) {
                secondLongest = word;
            }

            // Smallest and Second Smallest
            if (word.length() < smallest.length()) {
                secondSmallest = smallest;
                smallest = word;
            }
            // Check if it's not the smallest, AND (it's the first secondSmallest found OR it's smaller than current secondSmallest)
            else if (!word.equals(smallest) && (secondSmallest == null || word.length() < secondSmallest.length())) {
                secondSmallest = word;
            }
        }

        // Output
        System.out.println("Longest Word: " + longest);
        System.out.println("Second Longest Word: " + secondLongest);

        System.out.println("Smallest Word: " + smallest);
        System.out.println("Second Smallest Word: " + secondSmallest);
    }
}
/*
public class WordFinder {
    public static void main(String[] args) {
        String sentence = "Learning Java programming is fun and rewarding";

        // Split the string into individual words by space
        String[] words = sentence.split(" ");

        // Initialize smallest and largest with the first word
        String smallest = words[0];
        String largest = words[0];

        // Traverse through the array to compare lengths
        for (String word : words) {
            // Ignore empty strings caused by multiple spaces
            if (word.length() == 0) continue;

            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Longest word: " + largest);
    }
}
*/
