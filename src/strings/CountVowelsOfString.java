package strings;

import java.util.Set;

public class CountVowelsOfString {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        String text = "HelloJava";
        int vowels = 0, consonants = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (VOWELS.contains(c))
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

/*
//Count Vowels
    String text = "Hello Java";
    int count = 0;
    for (char c : text.toLowerCase().toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
        }
        System.out.println("Vowels: " + count);
*/


/*
//Remove Vowels
String text = "Hello Java";
String result = text.replaceAll("[aeiouAEIOU]", "");

System.out.println(result);
*/

//Count Vowels and Consonants

/*
String str = "selenium";
int vowels = 0;
int consonants = 0;

for(char ch : str.toCharArray()) {

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            vowels++;
        } else {
            consonants++;
        }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
*/
