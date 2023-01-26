package usefulStuff.arrays;

public class convertToZigzag {

//    arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]

    public static void swap(int a, int b){
        int c = a;
        a = b;
        b = c;
    }
    public static void zigZag(int a[], int n){
        for(int i=0; i<a.length-1; i++){
            if(i%2==0 && a[i]>a[i+1]){
//                swap(a[i],a[i+1]);
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
            if(i%2!=0 && a[i]<a[i+1]){
//                swap(a[i],a[i+1]);
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }
    }
    public static void main(String[] args) {
        int Arr[] = {4, 3, 7, 8, 6, 2, 1};
        int N = 7;
        zigZag(Arr,N);
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }

    }
}
