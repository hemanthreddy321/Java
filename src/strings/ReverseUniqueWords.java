package strings;

import java.util.*;

public class ReverseUniqueWords {
    public static void main(String[] args) {
        String input = "Good afternoon Good Evening";

        // Step 1: Split the sentence into individual words
        String[] words = input.split(" ");

        // Step 2: Filter out duplicates | LinkedHashSet preserves the original insertion order

        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word); // Keeps: [Good, afternoon, Evening] (Duplicate 'Good' is ignored)
        }

        // Step 3: Convert the set into an indexable array
        String[] s = set.toArray(new String[0]);
        String result = "";

        // Step 4: Reverse the order of the remaining unique words
        // Reads the array from the last element back to the first element.
        // Concatenate each word followed by a space

        for (int i = s.length - 1; i >= 0; i--) {
            result = result + s[i] + " ";
        }

        // Step 5: Print the final reversed string of unique words
        System.out.println(result.trim());
    }
}

/*

public class ReverseUniqueWords {
    public static void main(String[] args) {
        String input = "Good afternoon Good Evening";

        // 1. Split string into an array of words
        String[] words = input.split(" ");

        // 2. Add words to a LinkedHashSet to remove duplicates
        // while keeping the original order
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        // 3. Convert the Set back to a List so we can easily reverse it
        List<String> list = new ArrayList<>(uniqueWords);
        Collections.reverse(list);

        // 4. Join the words back into a single string
        String result = String.join(" ", list);

        System.out.println(result); // Output: Evening afternoon Good
    }
}

*/

