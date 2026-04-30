package interview;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);

        // Iterating over entries (Key and Value)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

/*map.forEach((key, value) -> {
        System.out.println(key + " => " + value);
});*/

/*Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
Map.Entry<String, Integer> entry = iterator.next();
    System.out.println(entry.getKey() + " : " + entry.getValue());
        // iterator.remove(); // Safely remove current element if needed
        }*/


/* KEYS AND VALUES
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}*/
