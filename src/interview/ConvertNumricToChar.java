package interview;
public class ConvertNumricToChar {

    public static void main(String[] args) {
        String str = "a2b3c4"; //output = aabbbcccc
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print(str.charAt(i));
            } else {
                int a = Character.getNumericValue(str.charAt(i));
                for (int j = 1; j < a; j++) {
                    System.out.print(str.charAt(i - 1));
                }
            }
        }
    }
}


/*public class CompressCharToNumeric {

    public static void main(String[] args) {
        String str = "aabbbcccc"; // Output: a2b3c4

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Look ahead to see if the next characters are the same
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // Move the main pointer forward
            }

            // Print the character and its count
            System.out.print(str.charAt(i) + "" + count);
        }
    }
}*/

