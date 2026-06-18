package collections;

import java.util.*;

public class LogSearcher {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("reset", "login", "help");

        boolean found = false;

        for (String s : list) {
            if (s.contains("login")) {
                System.out.println(s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}
