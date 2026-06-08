package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatedAndNonRepeatedChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the input string:");
        String input = sc.nextLine();
        System.out.println("Input: " + input);

        // LinkedHashMap keeps the insertion order of characters intact
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count occurrences of each character (ignoring spaces)
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        char firstRepeatedChar = ' ';
        char firstNonRepeatedChar = ' ';

        // Step 2: Extract the first repeated and non-repeated characters
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Find first non-repeated (count == 1)
            if (entry.getValue() == 1 && firstNonRepeatedChar == ' ') {
                firstNonRepeatedChar = entry.getKey();
            }
            // Find first repeated (count > 1)
            if (entry.getValue() > 1 && firstRepeatedChar == ' ') {
                firstRepeatedChar = entry.getKey();
            }
        }

        System.out.println("Output:");
        System.out.println("First Repeated Char: " + firstRepeatedChar);
        System.out.println("First Non-Repeated Char: " + firstNonRepeatedChar);

        sc.close();
    }
}
