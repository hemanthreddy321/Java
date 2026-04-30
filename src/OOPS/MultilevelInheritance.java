package oops;

class Vehicle {
    void move() { System.out.println("Moving..."); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Driving a car..."); }
}
class ElectricCar extends Car {
    void charge() { System.out.println("Charging battery..."); }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("--- Multilevel Inheritance Output ---");
        ElectricCar tesla = new ElectricCar();
        tesla.move();   // From Vehicle
        tesla.drive();  // From Car
        tesla.charge(); // From ElectricCar
    }
}
