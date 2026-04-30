package oops;

// 1. The Interface (Defines 'What' to do)
interface Camera {
    void takePhoto();
}

// 2. Implementation (Defines 'How' to do it)
class SonyCamera implements Camera {
    public void takePhoto() {
        System.out.println("Click! Photo taken using Sony Lens.");
    }
}

class SamsungCamera implements Camera {
    public void takePhoto() {
        System.out.println("Click! Photo taken using Samsung Lens.");
    }
}

// 3. Main Class
public class InterfaceAbstraction {
    public static void main(String[] args) {
        // Interface reference pointing to an object
        Camera myCam = new SonyCamera();
        myCam.takePhoto(); // Output: Click! Photo taken using Sony Lens.

        myCam = new SamsungCamera();
        myCam.takePhoto(); // Output: Click! Photo taken using Samsung Lens.
    }
}

