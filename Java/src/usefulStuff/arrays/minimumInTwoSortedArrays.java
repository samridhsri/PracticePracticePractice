package usefulStuff.arrays;

public class minimumInTwoSortedArrays {


    // arr1 = {2,4,6,8};
    // arr2 = {3,5,6,9,10}
//    Output: 6


//    nums1 = [1,2,3,6]
//    nums2 = [2,3,4,5]
//    Output: 2
    public static int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums2[j]>nums1[i]){
                i++;
            }
            else {
                return nums1[i];
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr1 = {1000000000,1000000000};
        int[] arr2 = {1000000000};

        System.out.println(getCommon(arr1,arr2));
//        System.out.println(1000000000-1000000000);
    }
}
