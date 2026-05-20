package algorithms;

import java.util.*;

public class LogParser {

    public static void main(String[] args) {

        // Input log string
        String input = "timestamp=2026-05-20T10:15:32Z level=INFO service=AuthService message=\"User login successful\" userId=12345";

        // Map to store key-value pairs
        Map<String, String> map = new LinkedHashMap<>();

        // Split string by spaces
        String[] arr = input.split(" ");

        // Variable to remember current key
        // Useful when value contains multiple words
        String currentKey = "";

        // Loop through each word
        for (String str : arr) {

            // Check if word contains '='
            // Means it is a new key=value pair
            if (str.contains("=")) {

                // Split into key and value
                // limit = 2 avoids extra splitting
                String[] parts = str.split("=", 2);

                // Store key
                currentKey = parts[0];

                // Store value after removing quotes
                map.put(currentKey, parts[1].replace("\"", ""));

            } else {

                // If word does not contain '='
                // it belongs to previous key value

                // Append remaining words
                map.put(currentKey, map.get(currentKey) + " " + str.replace("\"", ""));
            }
        }

        // Print final map
        System.out.println(map);
    }
}
