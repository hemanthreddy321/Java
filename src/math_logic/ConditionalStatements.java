package math_logic;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Conditional Statements - If,nested if,else if, else

        int age = 26;
        boolean citizen = true;

        if (age >= 18) {
            System.out.println("Eligible for Vote");
            if (citizen) {
                System.out.println("Indian Citizen");
            } else if (!citizen) {
                System.out.println("Not Indian Citizen");
            }
        } else {
            System.out.println("You are not eligible for Vote");
        }

        // Switch Statements

        int floorNumber = 3;

        switch (floorNumber) {

            case 0: {
                System.out.println("Floor 0");
                break;
            }
            case 1: {
                System.out.println("Floor 1");
                break;
            }
            case 2: {
                System.out.println("Floor 2");
                break;
            }
            case 3: {
                System.out.println("Floor 3");
                break;
            }
            case 4: {
                System.out.println("Floor 4");
                break;
            }
            case 5: {
                System.out.println("Floor 5");
                break;
            }
            default: {
                System.out.println("You haven't clicked any button in lift");
            }
        }

    }
}
