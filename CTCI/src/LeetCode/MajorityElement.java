package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 4/23/2016.
 */
public class MajorityElement {
    public static void main(String args[]){
        MajorityElement obj = new MajorityElement();
        int[] nums = {1,1,1,1,2,3};
        System.out.println("Majority element is: "+obj.majorityElement(nums));
    }

    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
