package OOPS;

class Employee {
    // 1. Private variables (Data Hiding)
    private String name;
    private int age;

    // 2. SETTER for Name: Allows updating the value
    public void setName(String newName) {
        this.name = newName;
    }

    // 3. GETTER for Name: Allows reading the value
    public String getName() {
        return name;
    }

    // 4. SETTER for Age: Includes logic to prevent invalid data
    public void setAge(int newAge) {
        if (newAge > 0 && newAge < 100) {
            this.age = newAge;
        } else {
            System.out.println("Error: Please enter a valid age.");
        }
    }

    // 5. GETTER for Age
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // emp.name = "John"; // This would throw a COMPILE ERROR

        // Setting values using Setters
        emp.setName("Alice");
        emp.setAge(25);

        // Accessing values using Getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());

        // Testing validation logic
        emp.setAge(-5); // Output: Error: Please enter a valid age.
    }
}

