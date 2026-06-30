package strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateStringCharacter {
    public static void main(String[] args) {
        String s1 = "hemanthea";
        char[] ch = s1.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : ch) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}

// To find only unique
// Programming
// entry.getValue()==1
// LINKED HASHMAP