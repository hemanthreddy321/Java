package arrays;
import java.util.*;

public class NthLargestArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 9, 21, 21, 7};
        int k = 2; // Change to 3 for 3rd largest, 4 for 4th largest, etc.

        // TreeSet automatically removes duplicates and stores numbers in descending order
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int n : nums) {
            set.add(n);
        }

        // Convert to array to access the Nth largest element via index
        if (set.size() >= k) {
            System.out.println(k + "nd largest: " + set.toArray()[k - 1]);
        } else {
            System.out.println("No distinct " + k + "nd largest value.");
        }
    }
}



/*public class NthLargest {
    public static void main(String[] args) {
        int[] nums = {12, 5, 9, 21, 21, 7};
        int k = 2; // Change to 3 for 3rd largest, 4 for 4th largest, etc.

        // Integer objects start as null to easily handle negative numbers
        Integer currentMax = null;

        // Run the loop K times to peel off the top K layers
        for (int i = 0; i < k; i++) {
            Integer nextMax = null;

            // Find the highest number that is smaller than our last maximum
            for (int n : nums) {
                if (currentMax == null || n < currentMax) {
                    if (nextMax == null || n > nextMax) {
                        nextMax = n;
                    }
                }
            }

            // Move to the next layer
            currentMax = nextMax;
        }

        // Output the result
        if (currentMax != null) {
            System.out.println(k + " largest: " + currentMax);
        } else {
            System.out.println("No distinct " + k + " value.");
        }
    }
}*/
