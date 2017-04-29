package Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by iceman on 2/27/2017.
 */
public class KRepeatingSubString {
    public static void main(String args[]){
        KRepeatingSubString obj = new KRepeatingSubString();
        System.out.println(obj.longestSubstring("aaabb",3));
    }

    public int longestSubstring(String s, int k) {
        int resultLength = 0;
        Map<Character, Integer> map = new HashMap<>(26);

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), 1);
        }

        List<Integer> singleLocations = new ArrayList<Integer>();
        for(Character  m : map.keySet()){
            if(map.get(m) == 1){
                singleLocations.add(s.indexOf(m));
            }
        }

        for(int i=0; i<singleLocations.size(); i++){
            int subStart = 0;
            int subEnd = singleLocations.get(i);
            while(subEnd < s.length()){
                int subLength = subEnd - subStart;
                if(subLength < k){
                    subStart = subEnd + 1;
                    subEnd = singleLocations.get(i+1);
                }
                else{
                    subLength = longestSubstring(s.substring(subStart, subEnd), k);
                    resultLength = Math.max(resultLength, subLength);
                }
            }
        }
        return resultLength;
    }
}
