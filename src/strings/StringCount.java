package strings;

public class StringCount {
    public static void main(String[] args) {
        String a = "This is a String";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                count++;
            }

        } System.out.println(count);
    }
}


//       if (a.charAt(i) == 'a')

/*
String str = "Automation";
System.out.println(str.length());
*/


/*
String words = "One Two Three Four";
int countWords = words.split("\\s").length;
System.out.println(countWords);
*/


/*
Count Digits in a String
        String text = "W3Schools was founded in 1998";
        int count = 0;

        for (char c : text.toCharArray()) {
        if (Character.isDigit(c)) {
            count++;
        }
        }

        System.out.println("Digits: " + count);
*/
