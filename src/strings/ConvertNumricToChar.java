package strings;
public class ConvertNumricToChar {
    public static void main(String[] args) {
        String str = "a2b3c4";

        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is a letter (a, b, c...)
            if (Character.isAlphabetic(str.charAt(i))) {
                // Print the letter once initially
                System.out.print(str.charAt(i));
            } else {
                // If it's a number, convert the char '2' into the integer 2
                int a = Character.getNumericValue(str.charAt(i));

                // Loop starts at 1 because the letter was already printed once above.
                // It prints the PREVIOUS character (i-1) 'a' times total.
                for (int j = 1; j < a; j++) {
                    System.out.print(str.charAt(i - 1));
                    // change to i+1 for i/p - 2a3b4c
                }
            }
        }
    }
}



/*public class CompressCharToNumeric {
    public static void main(String[] args) {
        String str = "aabbbcccc";

        for (int i = 0; i < str.length(); i++) {
            int count = 1; // Every character exists at least once

            // While the next character is the same as the current one...
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++; // Increase the count
                i++;     // Skip the next character in the outer loop
            }

            // Print the character and the total count found
            // The "" ensures the output is treated as a String, not an integer addition
            System.out.print(str.charAt(i) + "" + count);
        }
    }
}
*/

