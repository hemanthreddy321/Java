package arrays;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "Selenium", "Java", "TestNG"};
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==(arr[j])) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}

//Unique elements

/*class Main {
    public static void main(String[] args) {
        String[] arr = {"Java", "Selenium", "Java", "TestNG"};
        for(int i=0; i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }
}*/
