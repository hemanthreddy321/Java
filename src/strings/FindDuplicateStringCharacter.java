package strings;

public class FindDuplicateStringCharacter {
    //using nested for loops and comparing array indexs
    public static void main(String[] args) {
        String s = "hackerearth";
        char[] c = s.toCharArray();
        boolean isNotDupliacte = false;

        for (int i = 0; i < s.length(); i++) {
            boolean isDupliacte = false;

            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j]) {
                    isDupliacte = true;
                    break;
                }
            }
            if (isDupliacte) {
                System.out.print(c[i]);
                isNotDupliacte = true;
            }
            if (!isNotDupliacte) {
                System.out.println("No duplicates are found");
                break;
            }
        }
    }
}