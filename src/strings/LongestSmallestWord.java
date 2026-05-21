package strings;

public class LongestSmallestWord {
    public static void main(String[] args) {
        String str = "I love selenium automation";

        String[] words = str.split(" ");

        String longest = words[0];

        for(String word : words) {
//      replace with < for smallest
            if(word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println(longest);
    }
}
