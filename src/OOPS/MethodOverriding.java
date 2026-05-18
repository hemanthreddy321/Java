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

/*This is Polymorphism.
 The reference variable (myDog) is of type Animal, but the actual object created in memory is a Dog.
 When you call myDog.makeSound(), Java checks the actual object type at runtime,
 not the reference type.Since the actual object is a Dog,
 it executes the overridden version and prints: Dog barks: Woof! Woof!.
 This mechanism is known as Runtime Polymorphism or Dynamic Method Dispatch.*/
