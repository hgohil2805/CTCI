package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by iceman on 8/19/2016.
 */
public class KFrequentElements {

    public static void main(String args[]){
        KFrequentElements obj = new KFrequentElements();
        int[] input = {1,1,1,2,2,3};
        System.out.println(obj.topKFrequent(input,3).toString());
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length + 1];
        Map<Integer, Integer> frequency = new HashMap<Integer,Integer>();

        for(int n : nums ){
            frequency.put(n, frequency.getOrDefault(n,0) + 1);
        }

        for(int key : frequency.keySet()){
            int freq = frequency.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<Integer>();
            }
            buckets[freq].add(key);
        }

        List<Integer> result = new ArrayList<Integer>();


        for(int pos = buckets.length - 1; pos >= 0 && result.size() < k ; pos--){
            if(buckets[pos] != null){
                result.addAll(buckets[pos]);
            }
        }

        return result;
    }
}
