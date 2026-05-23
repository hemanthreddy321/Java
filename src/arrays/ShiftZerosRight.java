package arrays;

import java.util.Arrays;

public class ShiftZerosRight {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 3, 0, 0, 0};
        int nextNonZero = 0;

        for (int i = 0; i < a.length; i++) {
            // Whenever we find a non-zero, we swap it with the 'nextNonZero' position
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[nextNonZero];
                a[nextNonZero] = temp;

                // Move the pointer forward for the next non-zero found
                nextNonZero++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}

/*public class ShiftZerosLeft {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 3, 0, 0, 0};

        // Start from the very last index of the array
        int nextNonZero = a.length - 1;

        // Traverse the array backwards from right to left
        for (int i = a.length - 1; i >= 0; i--) {
            // If the current element is non-zero, swap it
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[nextNonZero];
                a[nextNonZero] = temp;

                // Move the pointer one step to the left
                nextNonZero--;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}*/

