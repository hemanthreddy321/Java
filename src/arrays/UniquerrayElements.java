package arrays;

import java.util.HashSet;

public class UniquerrayElements {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 8};
        int[] arr1 = {2, 4, 6, 8};

        System.out.println("--- Common elements using traditional loops ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                // Compares index by index
                if (arr[i] == arr1[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

        System.out.println("\n--- Common elements using for-each loops ---");
        for (int i : arr) {
            for (int j : arr1) {
                // Compares values directly without index variables
                if (i == j) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("\n--- Common elements using HashSet ---");
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        // Add all elements from the first array to the set
        for (int num : a) {
            set.add(num);
        }

        // Check if elements from the second array exist in the set
        for (int num : b) {
            if (set.contains(num)) {
                System.out.println("Common element: " + num);
            }
        }

        System.out.println("\n--- Unique single elements ---");
        String[] str = {"Java", "Selenium", "Java", "TestNG"};

        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                // Fixed: Changed '==' to '.equals()' for accurate String comparison
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            // If the element was only found exactly 1 time, it is unique
            if (count == 1) {
                System.out.println(str[i]);
            }
        }
    }
}
