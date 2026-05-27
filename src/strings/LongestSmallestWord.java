package strings;

public class LongestSmallestWord {

    public static void main(String[] args) {

        String str = "I love selenium automation";

        String[] words = str.split(" ");

        // Initialize
        String longest = words[0];
        String secondLongest = "";

        String smallest = words[0];
        String secondSmallest = "";

        for (String word : words) {

            // Longest and Second Longest
            if (word.length() > longest.length()) {

                secondLongest = longest;
                longest = word;
            } else if (word.length() > secondLongest.length() && !word.equals(longest)) {

                secondLongest = word;
            }

            // Smallest and Second Smallest
            if (word.length() < smallest.length()) {

                secondSmallest = smallest;
                smallest = word;
            } else if ((secondSmallest.equals(" ") || word.length() < secondSmallest.length()) && !word.equals(smallest)) {

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