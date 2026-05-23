package arrays;

public class MultipleMissingNumber {

    public static void main(String[] args) {

        // Input array
        int arr[] = {1, 2, 4, 6, 7, 9};

        // Maximum number in range
        int n = 9;

        System.out.println("Missing Numbers:");

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {

            boolean found = false;

            // Check whether number exists in array
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If number not found, print it
            if (!found) {
                System.out.println(i);
            }
        }
    }
}