package LeetCode;
import java.util.*;
// https://leetcode.com/problems/single-number/
public class singleNumber {
    public int singleNumberBruteForce(int[] nums) {
//        Here I used a hashSet
        Set<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                ans.remove(nums[i]);
            } else {
                ans.add(nums[i]);
            }
        }
        return ans.iterator().next();
    }

    public int singleNumberOptimised(int[] nums) {
        // Used XOR here
        int ans = nums[0];
        for(int i=1; i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
