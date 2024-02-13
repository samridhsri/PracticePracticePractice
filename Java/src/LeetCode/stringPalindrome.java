package LeetCode;
// https://leetcode.com/problems/valid-palindrome/
public class stringPalindrome {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(Character.isLetterOrDigit(arr[i])){
                s1.append(Character.toLowerCase(arr[i]));
            }
        }
        for(int i=arr.length-1; i>=0; i--){
            if(Character.isLetterOrDigit(arr[i])){
                s2.append(Character.toLowerCase(arr[i]));
            }
        }
        if(s1.toString().equals(s2.toString())){
            return true;
        }
        return false;
    }
}
