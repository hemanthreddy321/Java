package arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        // Initialize an array of integers containing duplicate maximum values
        int[] nums = {12, 5, 9, 21, 21, 7};

        // Use Integer objects (instead of primitive int) so they can start as null.
        // This easily handles arrays containing negative numbers or default zeros.
        Integer first = null, second = null;

        // Loop through each number 'n' in the array
        for (int n : nums) {
            // Case 1: 'n' is the first element, or it is strictly greater than the current largest number
            if (first == null || n > first) {
                second = first; // The old largest becomes the new second largest
                first = n;      // 'n' becomes the new largest
            }
            // Case 2: 'n' is smaller than 'first', but larger than 'second' (or 'second' hasn't been set yet).
            // The 'n != first' condition ensures we skip duplicate values of the largest number.
            else if ((second == null || n > second) && n != first) {
                second = n;     // 'n' becomes the new second largest
            }
        }

        // Check if a valid second-largest number was actually found
        if (second != null) {
            System.out.println("Second largest: " + second);
        } else {
            // This triggers if the array has fewer than 2 distinct numbers (e.g., {10, 10, 10})
            System.out.println("No distinct second largest value.");
        }
    }
}
