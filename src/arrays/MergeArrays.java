package arrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        // Create a new array with the combined size of both source arrays
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements from the first array into the start of the merged array
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from the second array, starting where the first one left off
        for (int i = 0; i < arr2.length; i++) {
            // Index logic: skip the length of arr1 to avoid overwriting data
            mergedArray[arr1.length + i] = arr2[i];
        }

        // Convert the array to a readable string format and print it
        System.out.println(Arrays.toString(mergedArray));
    }
}
