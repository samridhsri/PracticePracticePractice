package usefulStuff.arrays;

import java.util.ArrayList;

public class arrayReverse {

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i = k-1; i>=0; i--){
            System.out.print(arr.get(i) + " ");
        }
        for(int i =n-1; i>k-1; i--){
            System.out.print(arr.get(i) + " ");
        }
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        for(int i = 2; i>=0; i--){
//            System.out.println(arr[i]);
//        }
//        for(int j = arr.length-1; j>=3; j--){
//            System.out.println(arr[j]);
//        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        reverseInGroups(arr, 5, 3);

//        Note: This code is working on IntelliJ IDEA but not on GFG website
    }
}
