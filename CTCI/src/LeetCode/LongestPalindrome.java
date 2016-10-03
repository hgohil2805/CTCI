package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by iceman on 10/3/2016.
 */
public class LongestPalindrome {
    public static void main(String args[]){
        LongestPalindrome obj = new LongestPalindrome();
        String s = "abccccdd";
        System.out.println("Length of longest palindrome : "+obj.longestPalindrome(s));
    }

    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(set.remove(c))
                count++;
            else
                set.add(c);
        }
        return set.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
