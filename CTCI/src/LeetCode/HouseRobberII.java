package LeetCode;

/**
 * Created by iceman on 9/7/2016.
 */
public class HouseRobberII {

    public static void main(String args[]){
        HouseRobberII obj = new HouseRobberII();
        int[] nums = {1,2,3,4};
        System.out.println(obj.rob(nums));
    }

    private int rob(int[] num, int lo, int hi) {
        int include = 0, exclude = 0;
        for (int j = lo; j <= hi; j++) {
            int i = include, e = exclude;
            include = e + num[j];
            exclude = Math.max(e, i);
        }
        return Math.max(include, exclude);
    }

    public int rob(int[] nums){
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums,0,nums.length - 2), rob(nums,1,nums.length - 1));
    }

}
