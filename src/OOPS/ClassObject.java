package OOPS;

class Cars {
    String brand;
    int speed;

    // 1. The Constructor
    // It must have the SAME NAME as the class and NO return type
    Cars(String b, int s) {
        brand = b;
        speed = s;
        System.out.println("Object created for: " + brand);
    }

    void displayInfo() {
        System.out.println(brand + " is running at " + speed + " km/h");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        // 2. Initialize values directly during object creation
        Cars cars1 = new Cars("Tesla", 120);
        Cars cars2 = new Cars("BMW", 150);

        cars1.displayInfo();
        cars2.displayInfo();
    }
}

