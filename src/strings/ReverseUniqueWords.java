package strings;

import java.util.*;

public class ReverseUniqueWords {
    public static void main(String[] args) {
        String input = "Good afternoon Good Evening";

        // Split the sentence into an array using space as the separator
        String[] words = input.split(" ");

        // Create a HashSet to store unique words
        // Note: HashSet does NOT maintain the original order of words
        Set<String> s = new HashSet<>();
        for (String a : words) {
            s.add(a); // Only adds the word if it's not already in the set
        }
        System.out.println(s); // Prints the unique words (order will be random)

        // Convert the Set back into a String array to allow index-based access
        String[] v = s.toArray(new String[0]);

        String result = "";
        // Loop through the array backwards to reverse the order
        for (int i = v.length - 1; i >= 0; i--) {
            // Concatenate each word followed by a space
            result = result + v[i] + " ";
        }

        // Print the final reversed string of unique words
        System.out.println(result);
    }
}

/*import java.util.*;

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
}*/

