package collections;

import java.util.*;

public class CollectionsSorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);

        // Ascending
        Collections.sort(list);
        System.out.println("List Ascending Order: " + list);

        // Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List Descending order: " + list);
    }
}

/*public class CollectionsSorting {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(30);
        set.add(10);
        set.add(20);

        // Ascending (Default TreeSet behavior)
        Set<Integer> ascSet = new TreeSet<>(set);
        System.out.println("Set Ascending order: " + ascSet);

        // Descending (Passing a reverse comparator)
        Set<Integer> descSet = new TreeSet<>(Collections.reverseOrder());
        descSet.addAll(set);
        System.out.println("Set Descending order: " + descSet);
    }
}*/


/*
public class CollectionsSorting {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        // Ascending by Key
        Map<Integer, String> ascMap = new TreeMap<>(map);
        System.out.println("Map Ascending Order: " + ascMap);

        // Descending by Key
        Map<Integer, String> descMap = new TreeMap<>(Collections.reverseOrder());
        descMap.putAll(map);
        System.out.println("Map Descending Order: " + descMap);
    }
}*/


