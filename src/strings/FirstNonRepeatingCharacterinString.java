package strings;
/*
public class FirstNonRepeatingCharacterinString {

    public static void main(String args[]) {
        String inputStr = "java articles java";
        boolean flag = true;

        for (char i : inputStr.toCharArray()) {
            // if current character is the last occurrence in the string
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("There is no non-repeating character in input string");
    }
}
*/


import java.util.*;

public class FirstNonRepeatingCharacterinString {
    public static void main(String[] args) {
        String s1 = "Java articles java";
        // Convert to lowercase if you want 'J' and 'j' to be treated as the same
        char[] ch = s1.toLowerCase().toCharArray();

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Build the frequency map
        for (char c : ch) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character is: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
/*Replace it with this line: to get first repeated character
if(entry.getValue() > 1)*/

/*

    String str = "automation";

    for(int i = 0; i < str.length(); i++) {

    int count = 0;

    for(int j = 0; j < str.length(); j++) {

        if(str.charAt(i) == str.charAt(j)) {
            count++;
        }
        }

        if(count == 1) {
            System.out.println(str.charAt(i));
            break;
        }
        }

*/
