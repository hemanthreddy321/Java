package oops;
/*Diamond Palindrome
    A
   / \
B       C
   \ /
    D
*/
interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

class C implements A, B {
    @Override
    public void show() {
        // Resolving ambiguity explicitly
        A.super.show(); // or B.super.show()
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); // Calls A's show
    }
}
