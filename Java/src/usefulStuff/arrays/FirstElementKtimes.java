package usefulStuff.arrays;

import java.util.HashMap;

public class FirstElementKtimes {

    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap arr_a = new HashMap();
        for(int i=0;i<n;i++){
            if(!arr_a.containsKey(a[i])){
                arr_a.put(a[i], 1);
                if((int) arr_a.get(a[i])==k){
                    return a[i];
                }
            }
            else{
                arr_a.put(a[i], (int) arr_a.get(a[i]) + 1);
                if((int) arr_a.get(a[i])==k){
                    return a[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int A[] = {1, 7, 4, 3, 4, 8, 7};
        int N = 7;
        int K = 2;
        System.out.println(firstElementKTime(A,N,K));
    }
}
