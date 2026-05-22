package strings;

import java.util.Arrays;
import java.util.Scanner;

public class EvenIndexWords {
//Extract Words at Even Index Positions
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.println("Please enter the input string:");
        String input = sc.nextLine();

        System.out.println("Input: " + input);

        // Split sentence into words
        String[] words = input.split(" ");

        // Output array size
        String[] outputArr = new String[(words.length + 1) / 2];

        int index = 0;

        // Store words from even positions
        for (int i = 0; i < words.length; i++) {

            if (i % 2 == 0) {
                outputArr[index] = words[i];
                index++;
            }
        }

        // Print output
        System.out.println("Output: " + Arrays.toString(outputArr));

//        i/p -java articles java articles
//        o/p - [java, java]

                sc.close();
    }
}
