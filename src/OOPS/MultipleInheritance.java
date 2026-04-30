package oops;

interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
class AllInOne implements Printer, Scanner {
    public void print() { System.out.println("Printing..."); }
    public void scan() { System.out.println("Scanning..."); }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("--- Multiple Inheritance Output ---");
        AllInOne machine = new AllInOne();
        machine.print();
        machine.scan();
    }
}
