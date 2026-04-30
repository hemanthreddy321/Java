package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> unique = new HashSet<>(Arrays.asList(numbers));
        System.out.println(unique);
    }
}



/*public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);
    }
}*/

