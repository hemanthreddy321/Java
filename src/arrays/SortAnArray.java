package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates array sorting and manipulation techniques in Java.
 */
public class SortAnArray {

    /**
     * Sorts and prints an array of car brands alphabetically.
     */
    private static void processCarBrands() {
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        System.out.println("Sorted car array: " + Arrays.toString(cars));
        System.out.println("Individual car brands:");

        for (String car : cars) {
            System.out.println(car);
        }
    }

    /**
     * Converts an integer array to a list and sorts it in descending order.
     */
    private static void processNumbersInReverse() {
        Integer[] numbers = {1, 3, 2, 5, 7, 6, 9, 8, 11, 10};
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        numberList.sort(Collections.reverseOrder());

        for (Integer number : numberList) {
            System.out.println(number);
        }

        System.out.println("Numbers in reverse order: " + numberList);
    }

    static void main(String[] args) {
        processCarBrands();
        processNumbersInReverse();
    }
}
