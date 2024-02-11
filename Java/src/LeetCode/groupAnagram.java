package LeetCode;
import java.util.*;
//https://leetcode.com/problems/group-anagrams/
public class groupAnagram {
    public String sortStrings(String str){
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);
        String result = new String(chArr);
        return result;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();
        for(String s : strs){
            String sortedString = sortStrings(s);
            List<String> mapList = new ArrayList<>();
            if(resultMap.containsKey(sortedString)){
                mapList = resultMap.get(sortedString);
                mapList.add(s);
                resultMap.put(sortedString, mapList);
            }
            else{

                mapList.add(s);
                resultMap.put(sortedString, mapList);
            }
        }
        List<List<String>> result = new ArrayList<>();

        for(List<String> strList : resultMap.values()){
            result.add(strList);
        }
        return result;
    }
}
