package practice;

public class Practice {
    static void main() {
        String text = "Order ID: 12345 successfully created";
        String orderId = text.split(":")[1].trim().split(" ")[0];
        System.out.println(orderId);
    }
}
