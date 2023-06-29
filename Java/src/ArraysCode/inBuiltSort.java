package ArraysCode;

import java.util.Arrays;

public class inBuiltSort {

    public static void main(String[] args) {
        int[][] arr= {{25,32}, {5,28}, {76,5}};
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Now we sort");
        Arrays.sort(arr, (a,b)->(Integer.compare(a[1],b[1])));
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
