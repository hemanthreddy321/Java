package strings;

import java.util.Arrays;

public class IndexWordExtractor {
    public static void main(String[] args) {

        String text = "java articles java articles";
        String[] words = text.split(" ");

        // ==========================================
        // OPTION 1: EXTRACT EVEN INDEXES (0, 2, 4...)
        // ==========================================

        // Even math: size is total words divided by 2, rounded up
        String[] evenResult = new String[(words.length + 1) / 2];
        int evenIndex = 0;

        // Start at 0, jump by 2 to hit even indices
        for (int i = 0; i < words.length; i += 2) {
            evenResult[evenIndex] = words[i];
            evenIndex++;
        }
        System.out.println("Even Index Output: " + Arrays.toString(evenResult));


        // ==========================================
        // OPTION 2: EXTRACT ODD INDEXES (1, 3, 5...)
        // ==========================================

        // Odd math: size is total words divided by 2, rounded down
        String[] oddResult = new String[words.length / 2];
        int oddIndex = 0;

        // Start at 1, jump by 2 to hit odd indices
        for (int i = 1; i < words.length; i += 2) {
            oddResult[oddIndex] = words[i];
            oddIndex++;
        }
        System.out.println("Odd Index Output:  " + Arrays.toString(oddResult));
    }
}
