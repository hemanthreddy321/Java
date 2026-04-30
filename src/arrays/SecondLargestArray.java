package arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 9, 21, 21, 7};
        Integer first = null, second = null;

        for (int n : nums) {
            if (first == null || n > first) {
                second = first;
                first = n;
            } else if ((second == null || n > second) && n != first) {
                second = n;
            }
        }

        if (second != null) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No distinct second largest value.");
        }
    }
}
