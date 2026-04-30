package oops;

abstract class WildAnimal {
    // Abstract method (no body) - Subclasses MUST implement this
    abstract void makeSound();

    // Regular method (has a body)
    void sleep() {
        System.out.println("Zzz...");
    }
}

class Lion extends WildAnimal {
    // Providing the implementation for the abstract method
    void makeSound() {
        System.out.println("Roars!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // WildAnimal wildAnimal = new WildAnimal(); // ERROR: Cannot instantiate

        Lion lion = new Lion();
        lion.makeSound(); // Show functionality
        lion.sleep();     // Inherited functionality
    }
}

//Using Interface (Pure Abstraction)



