package math_logic;

public class Loops {

    public static void main(String[] args) {

        System.out.println("--- 1. The FOR Loop ---");
        /*
         * HOW IT WORKS: Best for when you know exactly how many times you want to loop.
         * Structure: for(initialization; condition; increment/decrement)
         * Example: Printing the 3 times table up to 10.
         */
        int x = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }


        System.out.println("\n--- 2. The WHILE Loop ---");
        /*
         * HOW IT WORKS: Best for when you don't know how many times the loop will run,
         * but you want it to keep going as long as a condition is TRUE.
         * Example: Printing the 5 times table up to 10.
         */
        int y = 5;
        int j = 1; // We have to declare the counter outside the loop

        while (j <= 10) {
            System.out.println(y + " * " + j + " = " + (y * j));
            j++; // CRITICAL: If you forget to increase 'j', the loop runs forever!
        }


        System.out.println("\n--- 3. The DO-WHILE Loop ---");
        /*
         * HOW IT WORKS: Similar to a while loop, BUT it checks the condition at the END.
         * This guarantees the code inside the loop will execute AT LEAST ONCE.
         */
        int k = 0;
        do {
            // This will print once, even though the condition below is false from the start.
            System.out.println("This says 'hi' even though k is not less than 0!");
            k++;
        } while (k < 0);


        System.out.println("\n--- 4. The BREAK Statement ---");
        /*
         * HOW IT WORKS: The 'break' keyword immediately stops and exits the current loop,
         * ignoring whatever the loop condition says.
         */
        int count = 0;
        while (count < 5) {
            if (count == 2) {
                System.out.println("The counter hit 2! Breaking the loop early.");
                // count++; // (Optional) Increment before breaking if you need to save the state
                break; // Exits the while loop completely
            }
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("Program finished.");
    }
}