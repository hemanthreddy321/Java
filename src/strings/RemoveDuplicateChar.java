package strings;

import java.util.HashSet;

public class RemoveDuplicateChar {

    public static String removeDuplicates(String str) {
        HashSet<Character> hs = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!hs.contains(c)) {
                hs.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        System.out.println(removeDuplicates(input)); // Output: "geksfor"
    }
}

/*class ReadFileStream {
    public static void main(String[] args) {
        String s = "Selenium";
        Set<String> set = new LinkedHashSet<>(Arrays.asList(s.split("")));

        System.out.println(set);
//        o/p = [S, e, l, n, i, u, m]
    }
}*/

