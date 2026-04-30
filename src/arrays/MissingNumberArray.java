package arrays;

public class MissingNumberArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // 3 is missing
        int n = 6; // The range is 1 to 6

// 1. Expected sum (1+2+3+4+5+6)
        int expectedSum = n * (n + 1) / 2;

// 2. Actual sum (1+2+4+5+6)
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

// 3. The difference is your missing number
        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}
