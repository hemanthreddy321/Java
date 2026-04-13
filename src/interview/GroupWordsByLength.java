package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {
    public static void main(String[] args) {
        String[] words = {"apple", "bat", "car", "door", "elephant", "fan", "grape"};

        // 1. Initialize the HashMap
        Map<Integer, List<String>> groups = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            // 2. Check if the length (key) is already in the map
            if (!groups.containsKey(length)) {
                // 3. If not, create a new list for this length and add it to the map
                groups.put(length, new ArrayList<>());
            }

            // 4. Retrieve the list (which now definitely exists) and add the word
            List<String> list = groups.get(length);
            list.add(word);
        }

        // Print the result
        System.out.println(groups);
    }
}
