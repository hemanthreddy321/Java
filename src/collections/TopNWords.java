package collections;

import java.util.*;

public class TopNWords {
    public static void main(String[] args) {

        // 1. Define sample text and the number of top words to find
        String text = "apple banana apple orange banana apple cherry";
        int N = 2;

        // 2. Split the text into individual words using spaces
        String[] words = text.split("\\s+");

        // 3. Count the frequency of each word using a Map
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // 4. Print the top N words by finding and removing the highest count map entry
        for (int i = 0; i < N && !wordCountMap.isEmpty(); i++) {
            String maxWord = "";
            int maxCount = 0;

            // Loop through the map to find the word with the highest count
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxWord = entry.getKey();
                }
            }

            // Print the highest word found in this round
            System.out.println(maxWord + ": " + maxCount);

            // Remove it so the next iteration finds the next highest word
            wordCountMap.remove(maxWord);
        }
    }
}
