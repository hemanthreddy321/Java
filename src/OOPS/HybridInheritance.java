package oops;

// Base class
class Person {
    void sleep() { System.out.println("Person sleeps."); }
}

// Hierarchical: Two classes extend Person
class Teacher extends Person {
    void teach() { System.out.println("Teacher teaches."); }
}

class Student extends Person {
    void study() { System.out.println("Student studies."); }
}

// Interfaces for Multiple Inheritance
interface Cricketer {
    void play();
}

interface Singer {
    void sing();
}

// Hybrid: Multilevel (StudentTeacher -> Teacher -> Person) + Multiple (2 interfaces)
class StudentTeacher extends Teacher implements Cricketer, Singer {
    public void play() { System.out.println("Playing cricket."); }
    public void sing() { System.out.println("Singing song."); }
}

public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("--- Hybrid Inheritance Output ---");
        StudentTeacher obj = new StudentTeacher();
        obj.sleep();   // From Person
        obj.teach();   // From Teacher
        obj.play();    // From Cricketer
        obj.sing();    // From Singer
    }
}