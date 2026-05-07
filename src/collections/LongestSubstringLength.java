package collections;

import java.util.HashMap;

public class LongestSubstringLength {
    public static void main(String[] args) {
        String s = "abcabc";
        // Stores character as Key and its most recent index as Value
        HashMap<Character, Integer> map = new HashMap<>();

        // 'j' is the start of the current window, 'longest' tracks the max length found
        int j = 0, longest = 0;

        // 'i' is the end of the current window
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If character was seen before, we may need to shrink the window from the left
            if (map.containsKey(currentChar)) {
                // Potential new start is the index after the last occurrence of this char
                int newJ = map.get(currentChar) + 1;

                // Only move 'j' forward; never move it backward (prevents reusing old indices)
                if (newJ > j) {
                    j = newJ;
                }
            }

            // Update/insert the current character's latest position
            map.put(currentChar, i);

            // Calculate current window size (i - j + 1) and update 'longest' if it's a new record
            int newLength = i - j + 1;
            if (newLength > longest) {
                longest = newLength;
            }
        }

        System.out.println("Length of longest substring: " + longest);
    }
}
