package collections;

import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        // Transaction 1
        list.add(1234L);
        list.add(8888999992222L);
        list.add(5000L);

        // Transaction 2
        list.add(1234566L);
        list.add(8888999992222L); // DUPLICATE
        list.add(5000L);          // DUPLICATE

        // 1. Convert List to Set to remove "duos"
        Set<Long> set = new LinkedHashSet<>(list);

        // 2. Convert back to List (if you need it as a List again)
        List<Long> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("Unique List: " + listWithoutDuplicates);
    }
}

/*List<Integer> list = Arrays.asList(1, 2, 2, 3); // Original list with duplicates
Set<Integer> uniqueSet = new LinkedHashSet<>();

// The "For-Each" loop
for (Integer i : list) {
        // The "If" check: "If the set doesn't already have this number..."
        if (!uniqueSet.contains(i)) {
        uniqueSet.add(i); // ...add it.
    }
            }

            System.out.println(uniqueSet); // Output: [1, 2, 3]*/

