package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();
        capitals.put("England", "London");
        capitals.put("Germany", "Berlin");

        System.out.println("--- 1. Entry Set ---");
        // 1. entrySet() -> Both Keys and Values
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("--- 2. Lambda ForEach ---");
        // 2. lambda forEach() -> Concise Loop
        capitals.forEach((k, v) -> System.out.println(k + "=>" + v));

        System.out.println("--- 3. Iterator ---");
        // 3. iterator() -> Safe for Modifying Map
        Iterator<Map.Entry<String, String>> it = capitals.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("--- 4. KeySet Lookup ---");
        // 4. keySet() -> Keys Only (and Manual Lookup)
        for (String key : capitals.keySet()) {
            System.out.println("Key: " + key + ", Value: " + capitals.get(key));
        }

        System.out.println("--- 5. Values Only ---");
        // 5. values() -> Values Only
        for (String value : capitals.values()) {
            System.out.println("Value: " + value);
        }
    }
}
