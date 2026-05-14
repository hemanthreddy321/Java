package oops;

public class CarS {
    // Private fields enforce encapsulation best practices
    private String brand;
    private String model;
    private String color;
    private int speed;

    // Constructor to initialize all class fields
    public CarS(String brand, String model, String color, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Fixed: The JVM requires this exact signature to execute the program
    public static void main(String[] args) {
        // Instantiating Car objects using the constructor
        CarS c = new CarS("BMW", "M5", "Black", 300);
        CarS c1 = new CarS("Porsche", "911", "Silver", 330);
        CarS c2 = new CarS("Ferrari", "488 GTB", "Red", 360);

        // Modifying data safely using a setter method instead of direct access
        c.setBrand("Lamborghini");

        // Invoking instance methods to print data
        c.display();
        c1.display();
        c2.display();
    }

    // Method to display car details to the console
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("--------------------");
    }

    // Standard getters and setters for controlled data access
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
