package LeetCode;
import java.util.*;

public class topKFrequentIntegers {
    public int[] topKFrequent(int[] nums, int k) {
        //create a HashMap to map (value -> frequency)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count = count+1;
                map.put(nums[i],count);
            }
            else{
                int count = 1;
                map.put(nums[i],count);
            }
        }
        //yahan tak bas map ki hai cheezein

        int maxfreq = 0;
        // make a new variable to keep a tab on Maximum Frequency (Kis integer ki sabse zyaada frequency hai)
        for(int freq : map.values()){
            maxfreq = Math.max(maxfreq,freq);
        }

        //Make a bucket here, jahan index honge frequency and array[index] is uss frequency ke kitne integers hai
        //This array is an array of arrays

        List<List<Integer>> listOfIntegers = new ArrayList<>(maxfreq+1);
        for(int i=0;i<=maxfreq;i++){
            listOfIntegers.add(new ArrayList<Integer>());
        }

        //IMPORTANT: Initialise the array with empty arrays

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            listOfIntegers.get(value).add(key);
        }

        //Add all the relevant keys to corresponding value index

        //make new array ans
        List<Integer> ans = new ArrayList<>();
        for(int j=maxfreq; j>=0;j--){
            if(k==0) break;
            if(listOfIntegers.get(j).isEmpty()){
                continue;

            }

            else{
                k = k-listOfIntegers.get(j).size();
                ans.addAll(listOfIntegers.get(j));

            }


        }

        //make new array with name result
        //copy everything from ans to result
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;

    }
}
