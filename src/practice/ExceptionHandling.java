package practice;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
            int result = 10 / 0;              // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Something else went wrong.");
            //always use the general exceptions at the end and specific ones in the start
        }
    }
}

/*   multiple catch blocks in same line

        try {
        int result = 10 / 0;
        int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        System.out.println("Math error or array error occurred.");
        }*/
