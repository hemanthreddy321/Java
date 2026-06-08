package arrays;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "Selenium", "Java", "TestNG"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // USE '==' to '.equals()' for reliable String comparison
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
