public class ques {
//    “Given three integer arrays sorted in ascending order, return the smallest number that is common in all three arrays. Return -1 if there is no common number.

    public static int findMin(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,6,10,14};
        int[] arr2 = {0,4,5,6,7,8,50};
        int[] arr3 = {6,7,10,25,30,63,64};

        int i = 0;
        int j = 0;
        int k = 0;
        int flag = 0;

        int min = Integer.MAX_VALUE;
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j] && arr1[i]==arr3[k]){
                flag = 1;
            }
            if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr2[j]>arr1[i]){
                i++;
            }
            else if(arr2[j]==arr1[i]){
                if(arr3[k]<arr1[i]){
                    k++;
                }

                else if(arr3[k]==arr1[i]){
                    System.out.println(arr3[k]);
                    break;
                }
            }



        };

        if(flag==0){
            System.out.println(-1);
        }


    }
}
