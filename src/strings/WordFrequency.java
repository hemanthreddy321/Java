package strings;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        // 1. The input sentence
        String str = "Hemanth Reddy Hemanth Reddy";

        // 2. Split the string into an array of words wherever a space " " is found
        // Result: ["Hemanth", "Reddy", "Hemanth", "Reddy"]
        String[] arr = str.split(" ");

        // 3. Create a HashMap to store words as Keys and their counts as Values
        Map<String, Integer> map = new HashMap<>();

        // 4. Iterate through each word in the array
        for (String s : arr) {
            // Check if the word already exists in the map
            if (map.containsKey(s)) {
                // If it exists, get the current count and increment it by 1
                map.put(s, map.get(s) + 1);
            } else {
                // If it's a new word, add it to the map with a count of 1
                map.put(s, 1);
            }
        }

        // 5. Print the final map showing each word and its total frequency
        // Output: {Reddy=2, Hemanth=2}
        System.out.println(map);
    }
}
