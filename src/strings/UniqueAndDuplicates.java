package strings;

import java.util.*;

public class UniqueAndDuplicates {
    public static void main(String[] args) {
        // Using Strings
        String name = "hemanthreddy";
        Set<Character> unique = new LinkedHashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();
        for (char c : name.toCharArray()) {
            if (!unique.add(c)) {
                duplicates.add(c);
            }
        }
        System.out.println("Duplicates: " + duplicates);
        System.out.println("Unique characters: " + unique);
    }
}

/*
public class UniqueAndDuplicates {
    public static void main(String[] args) {
        // Using Arrays
        Integer[] arr = {100, 100, 101, 101, 200, 202};

        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : arr) {
            if (!unique.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Unique elements: " + unique);
    }
}
*/


