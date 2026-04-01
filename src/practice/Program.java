package practice;

public class Program {
    public static void main(String[] args) {
        String name = "hemanth";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println(("It is not a palindrome"));
        }
    }
}
