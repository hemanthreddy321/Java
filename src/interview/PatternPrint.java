package interview;

public class PatternPrint {
    public static void main(String[] args) {
        int rows = 4; // Total number of rows
        int num = 1;  // Starting number

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment number after printing
            }
            // Move to the next line
            System.out.println();
        }
    }
}
