package strings;
public class AlphanumericCheck {
    public static void main(String[] args) {
        String input = "Java123"; // java-123 or java@123
        boolean isValid = true;

        for (char c : input.toCharArray()) {
            // Check if the character is NOT a letter or a digit
            if (!Character.isLetterOrDigit(c)) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Result: Alphanumeric");
        } else {
            System.out.println("Result: Not Alphanumeric");
        }
    }
}
