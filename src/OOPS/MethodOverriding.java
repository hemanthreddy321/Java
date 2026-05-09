package oops;

class Animal {
    // Parent method
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the parent method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Upcasting

        myAnimal.makeSound(); // Prints: AnimalType makes a sound
        myDog.makeSound();    // Prints: Dog barks: Woof! Woof!
    }
}

