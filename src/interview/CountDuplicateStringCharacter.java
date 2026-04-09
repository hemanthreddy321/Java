package interview;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateStringCharacter {
    public static void main(String[] args) {
        String s1 = "hemanthea";

        char[] ch = s1.toCharArray();

        Map<Character, Integer> charCount = new HashMap<>();

        // Build the frequency map
        for (char c : ch) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
