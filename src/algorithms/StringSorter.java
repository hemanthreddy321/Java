package algorithms;

public class StringSorter {
    public static void main(String[] args) {
        String[] arr = {"Zebra", "Apple", "Mango", "Banana", "Orange"};

        System.out.println("Before Sorting:");
        for (String s : arr) System.out.print(s + " ");

        // Manual Sorting Logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // compareTo returns > 0 if arr[i] is lexicographically greater than arr[j]
                if (arr[i].compareTo(arr[j]) > 0) {
                    // Swapping the strings
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");
        for (String s : arr) System.out.print(s + " ");
    }
}
