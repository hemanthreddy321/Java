package practice;

public class Strings {
    public static void main(String[] args) {
        // String s = "Hello"; - String Literal
        // string class creates new object everytime in memory (String a = new String("hello");
        String original = "Hemanth";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        String name = "MADAM";
        String reverse = "";
        for (int i = 0; i < name.length() ; i++) {
            reverse = name.charAt(i) +reverse;
        }
        System.out.println(reverse);
        // equals - compapres the content of string
        // == - compares the reference of string objects
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println(("It is not a palindrome"));
        }
    }
}
/*
Convert a String to an Array
public class Main {
    public static void main(String[] args) {
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        for (char i : myArray) {
            System.out.println(i);
        }
    }
}*/

/*
Remove Whitespace at the Beginning and End
String text = "   Java   ";
String trimmed = text.trim();

System.out.println(trimmed); // "Java"

Remove All Whitespace(spaces, tabs, and newlines)
String text = "  Java \t is \n fun  ";
String noSpaces = text.replaceAll("\\s+", "");

System.out.println(noSpaces); // "Javaisfun"*/
