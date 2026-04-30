package strings;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "testing selenium testing automation selenium";

        // Split text into words and add to a LinkedHashSet to maintain order
        String[] words = text.split(" ");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        // Join them back together
        String result = String.join(" ", uniqueWords);
        System.out.println(result); // Output: testing selenium automation
    }
}

