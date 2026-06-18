package strings;

import java.util.*;

public class IndexWordExtractor {
    public static void main(String[] args) {
        String text = "java articles java articles";
        String[] words = text.split(" ");

        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                even.add(words[i]);
            } else {
                odd.add(words[i]);
            }
        }

        System.out.println("Even Index Output: " + even);
        System.out.println("Odd Index Output:  " + odd);
    }
}
