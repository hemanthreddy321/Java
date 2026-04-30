package arrays;

import java.util.*;

public class ArrayShuffle {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};
        List<String> list = Arrays.asList(fruits);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
