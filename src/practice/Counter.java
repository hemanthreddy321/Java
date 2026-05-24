package practice;
// Static variable example - Shares the same memory for all objects.
public class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    public static void main(String[] args) {

        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c.show();
        c1.show();
        c2.show();
    }

    void show() {
        System.out.println("Count :" + count);
    }
}