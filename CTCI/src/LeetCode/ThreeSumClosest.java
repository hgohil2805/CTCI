package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 9/10/2016.
 */
public class ThreeSumClosest {

    public static void main(String args[]){
        ThreeSumClosest obj = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        System.out.println(obj.threeSumClosest(nums,1));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int low,high;
        for(int i = 0; i < nums.length;i++){
            low = i + 1;
            high = nums.length - 1;
            while (low < high){
                if(nums[low] + nums[high] == target - nums[i])
                    return target;
                else if(nums[low] + nums[high] > target - nums[i]){
                    while(low < high && nums[low] + nums[high] > target - nums[i])
                        high--;
                    if(Math.abs(nums[i]+ nums[low] + nums[high + 1] - target) < Math.abs(closest - target)){
                        closest = nums[i] + nums[low] +nums[high+1];
                    }
                }
                else{
                    while(low<high&&nums[low]+nums[high]<target-nums[i]) low++;
                    if(Math.abs(nums[i]+nums[low-1]+nums[high]-target)<Math.abs(closest-target))
                        closest=nums[i]+nums[low-1]+nums[high];
                }
            }
        }
        return closest;
    }

}
