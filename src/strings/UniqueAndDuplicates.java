package strings;
import java.util.*;

public class UniqueAndDuplicates {
    public static void main(String[] args) {
        // Using Strings
        String name = "hemanthreddy";
        Set<Character> seen = new LinkedHashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();
        for (char c : name.toCharArray()) {
            if (!seen.add(c)) {
//                seen.add(c);
                duplicates.add(c);
            }
        }
        System.out.println("Duplicates: " + duplicates);
        System.out.println("Unique characters: " + seen);
    }
}

/*public class UniqueAndDuplicates {
    public static void main(String[] args) {
        // Using Arrays
        Integer[] arr = {100, 100, 101, 101, 200, 202};
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                seen.add(num);
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Unique elements: " + seen);
    }
}*/


