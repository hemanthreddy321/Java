package collections;

import java.util.*;

public class MapKeyAndValueSorter {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 10);
        map.put("Orange", 30);
        map.put("Banana", 20);

        // 1. Get keys into a list
        ArrayList<String> keys = new ArrayList<String>(map.keySet());

        // 2. Sort keys (Ascending)
        Collections.sort(keys);

//        For Descending, uncomment:
//        Collections.reverse(keys);

        // 3. Put into LinkedHashMap
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (String key : keys) {
            sortedMap.put(key, map.get(key));
        }

        System.out.println("Sorted by Keys: " + sortedMap);
    }
}

/*public class MapKeyAndValueSorter {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 10);
        map.put("Orange", 30);
        map.put("Banana", 20);

        // 1. Get values into a list
        ArrayList<Integer> values = new ArrayList<Integer>(map.values());

        // 2. Sort values (Ascending)
        Collections.sort(values);
//        For Descending, uncomment:
//        Collections.reverse(values);

        // 3. Match keys to sorted values
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Integer val : values) {
            for (String key : map.keySet()) {
                // If the map value matches the current sorted value, add it
                if (map.get(key).equals(val)) {
                    sortedMap.put(key, val);
                }
            }
        }

        System.out.println("Sorted by Values: " + sortedMap);
    }
}*/

