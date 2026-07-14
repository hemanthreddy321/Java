package strings;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "selenium";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.print(ch +" ");
            }
        }
    }
}
