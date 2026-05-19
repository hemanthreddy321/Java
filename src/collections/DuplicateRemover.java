package collections;

import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {

        // Create a list with some duplicate numbers
        List<Integer> list = new ArrayList<>();
        list.add(1234567);
        list.add(34568);
        list.add(40000);
        list.add(1256798);
        list.add(34568); // Duplicate
        list.add(40000); // Duplicate

        // Initialize empty sets to keep track of items
        // LinkedHashSet is used to maintain the insertion order
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        // Loop through each number in the list
        for (Integer l : list) {

            // unique.add(l) tries to add the number to the 'unique' set.
            // If the number is NEW, it adds it and returns TRUE (so !TRUE becomes FALSE).
            // If the number ALREADY EXISTS, it returns FALSE (so !FALSE becomes TRUE).
            if (!unique.add(l)) {

                // If we land here, the number is a duplicate, so we record it
                duplicates.add(l);
            }
        }

        // Print the final results
        System.out.println("Unique items: " + unique);
        System.out.println("Duplicate items: " + duplicates);
    }
}
