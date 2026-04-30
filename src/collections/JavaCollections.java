package collections;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers); // [9, 7, 5, 3, 1]
    }
}
// Iterating
/*
ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    for (String c : colors) {
        System.out.println(c);
    }*/

//Iterator
/*ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

Iterator<String> it = colors.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
        }
        }*/
