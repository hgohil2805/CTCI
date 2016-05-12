package LeetCode;

/**
 * Created by iceman on 5/12/2016.
 */
public class HouseRobber {

     /*
    Dynamic programming
    Bottom-up approach
    Since we cannot rob 2 adjacent houses, generally, we cannot rob house[n] and house [n-1] at the same night
    So the basic idea is to see if house[n-1] has been robbed
    If house[n-1] has been robbed, then the optimal approach should be max{robbedmoney(n-1), robbedmoney(n-2)+nums[n]}
    If house[n-1] hasn't been robbed, then the optimal approach should be robbedmoney(n-2)+nums[n]
    */

    public static void main(String args[]){
        int[] nums = {2,5,7,8,9,10};
        HouseRobber obj = new HouseRobber();
        System.out.println(obj.rob(nums));
    }


    public int rob(int[] nums) {
        if(nums.length <= 0)
            return 0;

        int[] robbedMoney = new int[nums.length];  //robbedmoney[i] array is used to store the maximum amount of money that can be robbed from the first i houses.

        for(int i = 0; i < nums.length ; i++){
            if(i == 0){
                robbedMoney[i] = nums[i];
            }
            else if(i == 1){
                robbedMoney[i] = Math.max(nums[i],nums[i - 1]);
            }
            else{
                robbedMoney[i] = Math.max(robbedMoney[i - 2] + nums[i], robbedMoney[i - 1]);
            }
        }

        return robbedMoney[nums.length - 1];
    }
}
