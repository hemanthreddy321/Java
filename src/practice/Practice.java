package practice;

public class Practice {
    static void main() {
        String text = "Order ID: 12345 successfully created";
        String orderId = text.split(":")[1].trim().split(" ")[0];
        System.out.println(orderId);
    }
}
/*

String[] words = text.split(":");
String order = words[1].trim();
String[] id = order.split(" ");
String idNo = id[0];

System.out.println(Arrays.toString(words));
System.out.println(order);
System.out.println(idNo);

*/
