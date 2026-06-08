package strings;

import java.util.*;

public class MinMaxOccurences {
    public static void main(String[] args) {
        String s = "selenium";
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Build the frequency map
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Initialize tracking variables
        char minChar = ' ';
        int minCount = Integer.MAX_VALUE;

        char maxChar = ' ';
        int maxCount = Integer.MIN_VALUE;

        // Step 3: Find both min and max in a single loop
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int currentCount = entry.getValue();
            char currentChar = entry.getKey();

            // Check for minimum
            if (currentCount < minCount) {
                minCount = currentCount;
                minChar = currentChar;
            }

            // Check for maximum
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
            }
        }

        // Step 4: Print results
        System.out.println("Min: " + minChar + " =======> " + minCount);
        System.out.println("Max: " + maxChar + " =======> " + maxCount);
    }
}

