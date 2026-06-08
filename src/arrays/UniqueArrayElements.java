package arrays;

import java.util.HashSet;

public class UniqueArrayElements {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 5, 8};
        int[] b = {2, 4, 6, 8};

        System.out.println("--- Common elements using traditional loops ---");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }

        System.out.println("\n--- Common elements using for-each loops ---");
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("\n--- Common elements using HashSet ---");
        int[] x = {1, 2, 3, 4};
        int[] y = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        for (int num : x) {
            set.add(num);
        }

        for (int num : y) {
            // set.remove - returns true only the FIRST time it finds and deletes the match
            if (set.remove(num)) {
                System.out.println("Common element: " + num);
            }
        }

        System.out.println("\n--- Unique single elements ---");
        String[] str = {"Java", "Selenium", "Java", "TestNG"};

        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(str[i]);
            }
        }
    }
}
