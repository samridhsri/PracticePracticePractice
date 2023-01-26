package usefulStuff.arrays;

import java.util.HashMap;

public class removeDuplicatesSortedArray {

    static void removeDuplicatesSortedArray(int[] arr){
        int[] arr_new = new int[arr.length];
        int j=0;
        HashMap arr_map = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(!arr_map.containsKey(arr[i])){
                arr_map.put(arr[i],true);
                arr_new[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i<arr_new.length;i++){
            System.out.print(arr_new[i] + " ");
        }
        }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4};
        removeDuplicatesSortedArray(arr);
    }
}

//change arr_new to arr for leetcode question
