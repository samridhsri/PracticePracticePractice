package LeetCode;
import java.util.HashMap;
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int numberToFind = target - nums[i];
            if(map.containsKey(numberToFind)){
                result[0] = i;
                result[1] = map.get(numberToFind);
            }
            map.put(nums[i],i);
        }

        return result;
    }
}
