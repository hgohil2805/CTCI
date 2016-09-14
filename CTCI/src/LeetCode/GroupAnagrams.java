package LeetCode;

import java.util.*;

/**
 * Created by iceman on 9/13/2016.
 */
public class GroupAnagrams {
    public static void main(String args[]){
        GroupAnagrams obj = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = obj.groupAnagrams(strs);
        for(List<String> r : result){
            System.out.println(r.toString());
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if(!map.containsKey(keyStr)){
                map.put(keyStr,new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }
        for(String key : map.keySet()){
            Collections.sort(map.get(key));
        }
        return new ArrayList<List<String>>(map.values());
    }
}
