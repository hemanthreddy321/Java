package strings;

public class AlphanumericCheck {
    public static void main(String[] args) {
        // Test inputs: "Java123" (True), "java-123" (False), "java@123" (False)
        String input = "Java123";
        boolean isValid = true;

        // Convert string to character array and check each character
        for (char c : input.toCharArray()) {
            // Flag as invalid if a character is neither a letter nor a digit
            if (!Character.isLetterOrDigit(c)) {
                isValid = false;
                break; // Exit loop early since we already found a non-alphanumeric character
            }
        }

        // Print final verdict
        if (isValid) {
            System.out.println("Result: Alphanumeric");
        } else {
            System.out.println("Result: Not Alphanumeric");
        }
    }
}
