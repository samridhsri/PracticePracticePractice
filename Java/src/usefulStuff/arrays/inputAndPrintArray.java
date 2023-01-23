package usefulStuff.arrays;

import java.util.Scanner;

public class inputAndPrintArray {
    public static void arrayInput(int[] arr, int arr_size){
        Scanner sc = new Scanner(System.in);
        arr_size = sc.nextInt();
        System.out.println(arr_size);
        arr = new int[arr_size];

        for(int i=0;i<arr_size;i++){
            arr[i] = sc.nextInt();
        }
    }
}
