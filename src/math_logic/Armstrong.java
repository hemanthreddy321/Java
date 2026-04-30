package math_logic;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += (int) Math.pow(digit, digits);
            num /= 10;
        }

        if (result == original) System.out.println(original + " is Armstrong");
        else System.out.println(original + " is not Armstrong");
    }
}