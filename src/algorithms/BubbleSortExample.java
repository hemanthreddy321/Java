package algorithms;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Outer loop: Controls how many passes we make through the array.
        // After each pass, the largest remaining element "bubbles up" to its correct position at the end.
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop: Compares adjacent elements.
            // We use 'arr.length - i - 1' because the last 'i' elements are already sorted.
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Compare current element with the next one
                if (arr[j] > arr[j + 1]) {

                    // If the left element is bigger, they are in the wrong order. Swap them!
                    int temp = arr[j];       // Store current value in a temporary variable
                    arr[j] = arr[j + 1];     // Move the smaller value to the left
                    arr[j + 1] = temp;       // Put the larger value (from temp) to the right
                }
            }
        }

        // Print the final result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
// Logic for Descending Order
for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
        // Change > to < for descending
        if (arr[j] < arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
        }
                }
                }
*/


