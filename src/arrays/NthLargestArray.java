package arrays;

import java.util.Collections;
import java.util.TreeSet;

public class NthLargestArray {
    public static void main(String[] args) {
        Integer[] nums = {12, 5, 9, 21, 21, 7};
        int k = 2; // Target rank (e.g., 2 = 2nd largest)

        // Step 1: Filter out duplicates and sort numbers in descending order automatically
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int n : nums) {
            set.add(n);
        }

        // Step 2: Validate if we have enough distinct elements to find the K-th largest
        if (set.size() >= k) {
            int currentRank = 1; // Track our rank as we loop (1st largest, 2nd largest, etc.)

            // Step 3: Loop through the sorted elements directly without converting to an array
            for (int element : set) {
                // If our current position matches the rank we want, print and stop
                if (currentRank == k) {
                    System.out.println(k + "nd largest distinct value is: " + element);
                    break;
                }
                currentRank++; // Move to the next rank position
            }
        } else {
            System.out.println("No distinct " + k + "nd largest value available.");
        }
    }
}
