package usefulStuff.arrays;

import java.util.HashMap;

public class CheckArrayEqual {
    public static boolean check(long A[],long B[],int N)
    {
        HashMap arr_A = new HashMap();
        HashMap arr_B = new HashMap();

        for(int i=0; i<A.length; i++){
            if(!arr_A.containsKey(A[i])){
                arr_A.put(A[i],1);
            }
            else{
                arr_A.replace(A[i], (int) arr_A.get(A[i])+1);
            }
            if(!arr_B.containsKey(B[i])){
                arr_B.put(B[i],1);
            }
            else{
                arr_B.replace(B[i], (int) arr_B.get(B[i])+1);
            }


        }
        return arr_A.equals(arr_B);
    }

    public static void main(String[] args) {
        long[] arr1 = {1,2,5,4,5};
        long[] arr2 = {5,1,2,4,5};

        System.out.println(check(arr1, arr2, 5));

    }
}
