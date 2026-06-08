package collections;

import java.util.*;

public class SecondLargestOccurence {
    public static void main(String[] args) {
        String str = "hemanthreddyhemanth";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //getOrDefault - It checks whether key exists in map. If present returns value, otherwise returns default value.
        System.out.println("Map: " + map);

        // Step 1: Find the absolute maximum frequency
        int maxcount = 0;
        for (int val : map.values()) {
            if (val > maxcount) {
                maxcount = val;
            }
        }

        // Step 2: Find the second largest frequency
        int secondMaxCount = 0;
        for (int val : map.values()) {
            if (val > secondMaxCount && val < maxcount) {
                secondMaxCount = val;
            }
        }

        // Step 3: Print all characters matching the second-largest frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMaxCount) {
                char secondMaxChar = entry.getKey();
                System.out.println(secondMaxChar + "====>" + secondMaxCount);
            }
        }
    }
}

