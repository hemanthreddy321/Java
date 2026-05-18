package arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 9, 21, 21, 7};

        // Start both trackers at the lowest possible integer value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : nums) {
            // Case 1: Found a new largest number
            if (n > first) {
                second = first; // Old largest becomes second largest
                first = n;      // Update largest
            }
            // Case 2: Found a number smaller than 'first' but larger than 'second'
            else if (n > second && n != first) {
                second = n;     // Update second largest
            }
        }

        // If 'second' changed from its initial value, a valid second largest exists
        if (second != Integer.MIN_VALUE) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No distinct second largest value.");
        }
    }
}
