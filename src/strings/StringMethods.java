package strings;

public class StringMethods {
    public static void main(String[] args) {

        String a = "javatraining";

        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("t"));
        System.out.println(a.substring(3, 6));
        System.out.println(a.substring(5));
        System.out.println(a.concat("rahul teaches"));
        System.out.println(a.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        String arr[] = a.split("t");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("t", "s"));
    }
}
/* Convert 3rd letter to Uppecase
public class Main {
    public static void main(String[] args) {
        String name = "hemanth";

        // Extract parts of the string and modify the 3rd letter (index 2)
        String result = name.substring(0, 2) +
                Character.toUpperCase(name.charAt(2)) +
                name.substring(3);

        // Print the final text
        System.out.println(result);
    }
}
*/
