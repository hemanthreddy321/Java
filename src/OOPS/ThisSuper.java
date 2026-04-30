package OOPS;

class Parent {
    String name = "Parent Class";

    void show() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    String name = "Child Class"; // This 'hides' the parent's name variable

    void display() {
        // 'this' refers to the current class variable
        System.out.println("Variable using this: " + this.name);

        // 'super' refers to the parent class variable
        System.out.println("Variable using super: " + super.name);
    }

    @Override
    void show() {
        System.out.println("Message from Child");
    }

    void testMethods() {
        this.show();   // Calls the overridden version in Child
        super.show();  // Calls the original version in Parent
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Child obj = new Child();

        System.out.println("--- Variable Comparison ---");
        obj.display();

        System.out.println("\n--- Method Comparison ---");
        obj.testMethods();
    }
}

