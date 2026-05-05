package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class CountOccurencesOfCharacter {
    public static void main(String[] args) {
        String str = "hemanth";

        // 1. Initialize a HashMap to store Character as Key and its Count as Value
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        // 2. Convert string to char array and loop through each character
        // .toCharArray() breaks "hemanth" into ['h','e','m','a','n','t','h']

        for (char ch : str.toCharArray()) {
            // getOrDefault checks if the char exists; if yes, gets the value, else returns 0.
            // Then we add 1 to that value and put it back in the map.
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 3. To use an Iterator, we must access the "EntrySet" of the map
        // This creates an iterator that can move through Key-Value pairs
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

        System.out.println("Character Occurrences:");

        // 4. Use a while loop to check if there is a next entry in the map
        while (iterator.hasNext()) {
            // Get the next Map Entry (the Key-Value pair)
            Map.Entry<Character, Integer> entry = iterator.next();

            // Print the Key (Character) and the Value (Count)
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


/*import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        String str = "Hemanth Reddy Hemanth Reddy";
        String[] arr = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String s: arr){
        if(map.containsKey(s)){
            map.put(s,map.get(s)+1);
        }else {
            map.put(s,1);
        }
       }
        System.out.println(map);
    }
}*/
