package interview;

public class ReverseString {

    public static String reverse(String input) {
        String reversedString = "";
        for (int i = 0; i< input.length(); i++) {
            reversedString = input.charAt(i)+reversedString;
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String input = "hemanth";
        String reversedString = reverse(input);
        System.out.println(reversedString);
    }
}

/*
public class ReverseAndCapitalize {
    public static void main(String[] args) {
        String input = "java";

        // Step 1: Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Step 2: Capitalize the first letter of the reversed string
        // Check if string is not empty to avoid exceptions
        if (reversed.length() > 0) {
            String result = reversed.substring(0, 1).toUpperCase() + reversed.substring(1);
            System.out.println("Original: " + input);
            System.out.println("Result: " + result); // Output: Avaj
        }
    }
}*/
