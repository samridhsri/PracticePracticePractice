package LeetCode;
//https://leetcode.com/problems/binary-search/
public class binarySearch {
    public int search(int[] nums, int target) {
        int i=0;
        int j = nums.length-1;
        if(nums.length==0){
            return -1;
        }
        int mid=-1;

        while(i<=j){
            mid = (i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                j = mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }
}
