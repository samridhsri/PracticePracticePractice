package ArraysCode;

public class SlidingWindow {

    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1; i++){
            int sum = 0;
            int j = i;

            while(sum<target && j<nums.length){
                sum+=nums[j];
                j++;

                if(sum==target){
                    min = Math.min(min, j-i);
                    System.out.println(min);

                }
            }
        }
        return min;
    }


    public static void subArraySumMax(int[] arr, int k){
        int res = 0;
        for(int i=0; i<k; i++){
            res+=arr[i];
        }
        int curr;
        for(int i=k; i<arr.length; i++){
            curr = res - arr[i-k] + arr[i];
            res = Math.max(res, curr);
        }
        System.out.println(res);
    }

        public static void subArrayMinSum(int[] arr, int k){
        int res = 0;
        for(int i=0; i<k; i++){
            res+=arr[i];
        }
        int curr;
        for(int i=k; i<arr.length; i++){
            curr = res - arr[i-k] + arr[i];
            res = Math.min(res, curr);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr1[] = {12, 30, 65, 80, 3, 0, 11};
        int arr2[] = {12, 30, 65, 80, 3, 11};
        int arr3[] = {1,2,3,4,5,6,1,2,3};
        int arr4[] = {2,3,1,2,4,3};
//        subArraySumMax(arr3, 3);
//        subArrayMinSum(arr3,3);
        System.out.println(minSubArrayLen(7, arr4));

        System.out.println();
    }
}
