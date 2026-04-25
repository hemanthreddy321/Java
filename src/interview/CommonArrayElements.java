package interview;

public class CommonArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8};
        int [] arr1 = {2,4,6,8};

        for(int i =0; i<arr.length;i++){
            for(int j=0; j<arr1.length;j++){
                if(arr[i]==arr1[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

/*
        for (int k : arr) {
        for (int i : arr1) {
        if (k == i) {
        System.out.println(k);
                }
        }
        }*/

/*int[] arr1 = {1, 2, 3, 4};
int[] arr2 = {3, 4, 5, 6};

HashSet<Integer> set = new HashSet<>();
for (int num : arr1) set.add(num);

for (int num : arr2) {
        if (set.contains(num)) {
        System.out.println("Common element: " + num);
    }
            }*/

