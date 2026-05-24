package arrays;

public class MissingNumberArray {
    public static void main(String[] args) {
        // Input array
        int num[] = {1, 2, 4, 5};

        // Total numbers expected
        int n = 5;

        // Sum of numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Store actual sum of array elements
        int actualSum = 0;

        // Calculate actual sum
        for (int i : num) {
            actualSum += i;
        }

        // Missing number
        int missing = expectedSum - actualSum;

        System.out.println("Missing Number: " + missing);
    }
}
