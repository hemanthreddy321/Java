package interview;

import java.util.HashMap;

public class CountOccurencesOfCharacter {
    public static void main(String[] args) {
        String str = "hemanth";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

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
