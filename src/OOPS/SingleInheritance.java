package OOPS;

class AnimalType {
    void eat() { System.out.println("This animal eats food."); }

}
class Cat extends AnimalType {
    void meow() { System.out.println("The cat meows."); }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance Output ---");
        Cat d = new Cat();
        d.eat();  // Inherited from AnimalType
        d.meow(); // Child's own method
    }
}

