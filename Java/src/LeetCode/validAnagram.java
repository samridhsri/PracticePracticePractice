package LeetCode;
import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram
public class validAnagram {
    public HashMap<Character, Integer> makeMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int value = 1;
            if(map.containsKey(s.charAt(i))){
                value = map.get(s.charAt(i));
                map.put(s.charAt(i),value+1);
            }
            else{
                map.put(s.charAt(i),value);
            }
        }
        return map;
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> countS = makeMap(s);
        HashMap<Character, Integer> countT = makeMap(t);

        return countS.equals(countT) ? true : false;

    }
}
