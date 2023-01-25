package Searching;

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int k){
        int n = arr.length;
        int high = n-1;
        int low = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]>k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to find: ");
        int key = sc.nextInt();

        System.out.println("Element found at: " + binarySearch(arr, key));
    }
}
