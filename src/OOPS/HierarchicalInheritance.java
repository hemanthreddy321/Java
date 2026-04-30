package OOPS;

class Shape {
    void display() { System.out.println("This is a shape."); }
}
class Circle extends Shape {
    void circleArea() { System.out.println("Calculating Circle area."); }
}
class Square extends Shape {
    void squareArea() { System.out.println("Calculating Square area."); }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("--- Hierarchical Inheritance Output ---");
        Circle c = new Circle();
        Square s = new Square();
        c.display();   c.circleArea();
        s.display();   s.squareArea();
    }
}
