package algorithms;

import java.util.*;

public class LogParser {
    public static void main(String[] args) {
        // The original log string containing our data
        String input = "timestamp=2026-05-20T10:15:32Z level=INFO service=AuthService message=\"User login successful\" userId=12345";

        // Create an empty map to store the final key-value pairs
        Map<String, String> map = new LinkedHashMap<>();

        // Step 1: Remove all double quotes from the text immediately
        // This removes the biggest headache and keeps things simple
        input = input.replace("\"", "");

        // Step 2: Cut the text into an array of words wherever there is a space
        String[] parts = input.split(" ");

        // Trackers to hold the item we are currently building
        String currentKey = "";
        String currentValue = "";

        // Step 3: Loop through every word in the array
        for (String part : parts) {

            // Check if the current word contains an '=' sign
            if (part.contains("=")) {

                // If currentKey is NOT empty, it means we just finished
                // building a previous pair. Save it to the map now.
                if (!currentKey.isEmpty()) {
                    map.put(currentKey, currentValue);
                }

                // Split this word into exactly 2 pieces: before '=' and after '='
                String[] pair = part.split("=", 2);
                currentKey = pair[0];   // [0] gets the left side key (e.g., "message")
                currentValue = pair[1]; // [1] gets the right side value (e.g., "User")
            }
            // If the word does NOT have an '=', it is a continuation word
            else {
                // Add a space and glue this word to the current value
                // (e.g., glues "login" and "successful" back to "User")
                currentValue = currentValue + " " + part;
            }
        }

        // Step 4: Save the final item because the loop ends
        // before the last pair can hit the save line inside the loop
        if (!currentKey.isEmpty()) {
            map.put(currentKey, currentValue);
        }

        // Print the nicely structured map to the screen
        System.out.println(map);
    }
}


/*
import java.util.*;

class Main {
    public static void main(String[] args) {

        String input = "timestamp=2026-05-20T10:15:32Z level=INFO service=AuthService message=\"User login successful\" userId=12345";

        Map<String,String> map = new LinkedHashMap<>();

        String [] arr = input.split(" ");
        String key = "";
        for(String str : arr){

            if(str.contains("=")){
                String[] parts = str.split("=",2);
                key = parts[0];
                map.put(key, parts[1].replace("\"",""));
            }else{
                map.put(key, map.get(key) + " " + str.replace("\"",""));
            }
        }
        System.out.println(map);
    }
}*/
