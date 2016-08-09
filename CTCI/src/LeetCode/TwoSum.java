package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hg71335 on 8/3/2016.
 */
public class TwoSum {

    public static void main(String args[]){
        TwoSum obj = new TwoSum();
        int[] testArray = {0,4,3,0};
        System.out.println(Arrays.toString(obj.twoSum(testArray,0)));
    }

    public int[] twoSum(int[] nums, int target) {
        if(nums == null){
            return null;
        }

        int[] returnArray = new int[2];

        Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length ; i++){
            if(mapper.containsKey(target-nums[i])){
                returnArray[0] = mapper.get(target-nums[i]);
                returnArray[1] = i;
            }
            mapper.put(nums[i],i);
        }
        return returnArray;
    }
}
