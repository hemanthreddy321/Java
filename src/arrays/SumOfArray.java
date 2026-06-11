package arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 10, 25};
        int sum = 0;
        // Loop through array elements and get the sum
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
