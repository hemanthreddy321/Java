package collections;

import java.util.*;

public class NthDynamicOccurrence {

    public static void main(String[] args) {

        String str = "automationtesting";
        int n = 2;

        // FIX 1: Use LinkedHashMap to preserve the original character order
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

        // Use LinkedHashSet to maintain unique frequency order
        Set<Integer> uniqueValues = new LinkedHashSet<>(map.values());
        List<Integer> list = new ArrayList<>(uniqueValues);

        // FIX 2: Choose your sorting behavior
        // To find LARGEST frequencies:
        Collections.sort(list, Collections.reverseOrder());

        // To find SMALLEST frequencies (uncomment line below and comment line above):
        // Collections.sort(list);

        // Edge case check to avoid IndexOutOfBoundsException
        if (n > list.size()) {
            System.out.println("There is no " + n + "th distinct frequency available.");
            return;
        }

        int target = list.get(n - 1);

        /*
        Zero-Indexed Lists: Java lists start counting at index 0.
        The Math: To find the (n)-th item, you must subtract 1.
        If (n = 1) (1st item), it reads index 0.
        If (n = 2) (2nd item), it reads index 1.
        */

        // Print characters matching the target frequency in original order
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == target) {
                System.out.println(n + "th Target Occurrence: " + entry.getKey() + " -> " + target);
                break; // Remove this break if you want to see ALL characters with this frequency
            }
        }
    }
}
