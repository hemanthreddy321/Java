package algorithms;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Track if any numbers were swapped in a pass
        boolean swapped;

        // Outer loop: Runs up to N-1 times to pass through the array
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false; // Reset flag at the start of each pass

            // Inner loop: Compares adjacent numbers.
            // Ignores the last 'i' elements because they are already sorted.
            for (int j = 0; j < arr.length - i - 1; j++) {

                // If left number is bigger than right number, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark that a swap happened
                }
            }

            // Optimization: If no numbers were swapped, the array is already sorted!
            if (!swapped) {
                break; // Exit the loop early to save time
            }
        }

        // Print the sorted array
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


