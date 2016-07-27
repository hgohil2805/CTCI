package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iceman on 7/26/2016.
 */
public class IsomorphicStrings {

    public static void main(String args[]){
        IsomorphicStrings obj = new IsomorphicStrings();
        System.out.println(obj.isIsomorphic("a","a"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        Map<Character, Integer> m2 = new HashMap<Character, Integer>();

        for(Integer i = 0; i < s.length(); i++) {

            if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }
}
