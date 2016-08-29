package LeetCode;

/**
 * Created by iceman on 8/29/2016.
 */
public class MaxSubArray {

    public static void main(String args[]){
        MaxSubArray obj = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sub Array Normal is : "+obj.maxSubArrayNormal(nums));
        System.out.println("Max Sub Arraay DP is : "+obj.maxSubArrayDP(nums));
    }


    public int maxSubArrayDP(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1 ; i < nums.length; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i - 1]  : 0);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public int maxSubArrayNormal(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i = 1 ; i < nums.length ; ++i){
            maxEndingHere = Math.max(maxEndingHere + nums[i],nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
