package arrays;

import java.util.Arrays;

public class ShiftZeros {
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

