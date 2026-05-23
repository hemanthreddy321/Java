package strings;

import java.util.Scanner;

public class WordCharacterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read sentence from user
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        System.out.println("Word and Character Count:");

        // Loop through each word
        for (String word : words) {

            System.out.println(word + " -> " + word.length() + " characters");
        }
        //hello how are you
        sc.close();
    }
}
