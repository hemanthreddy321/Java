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

/*class Main {
    public static void main(String[] args) {
        int[] a = {20, 22, 18, 35};
        int [] b = {48, 22, 87, 18};

        for(int i=0;i<a.length;i++){
            int count =0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                    break;
                }
            }
            if(count>=1){
                System.out.println(a[i]);
            }
        }
    }
}*/
