package LeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class fizzbuzz {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            } else if(i%3==0){
                arr.add("Fizz");
            } else if(i%5==0){
                arr.add("Buzz");
            } else{ arr.add(Integer.toString(i));}
        }
        return arr;

    }
}
