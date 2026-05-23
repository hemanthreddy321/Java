package arrays;

import java.util.*;

public class NumberFrequency {
    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 2, 9, 5, 2, 8, 7};
        Map<Integer, Integer> map = new HashMap<>();
        for (int s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey() + "====>" + entry.getValue());
            }
        }
    }
}

