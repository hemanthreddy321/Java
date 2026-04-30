package strings;

import java.util.*;

public class ReverseUniqueWords {
    public static void main(String[] args) {
        String input = "Good afternoon Good Evening";
        String[] words = input.split(" ");
        Set<String> s = new HashSet<>();
        for (String a : words) {
            s.add(a);
        }
        System.out.println(s);

        String[] v = s.toArray(new String[0]);
        String result = "";
        for (int i = v.length - 1; i >= 0; i--) {
            result = result + v[i] + " ";
        }
        System.out.println(result);
    }
}