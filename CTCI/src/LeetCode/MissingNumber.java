package LeetCode;

/**
 * Created by iceman on 8/22/2016.
 */
public class MissingNumber {

    public static void main(String args[]){
        MissingNumber obj = new MissingNumber();
        int[] test = {0,1,2,4};
        System.out.println("Missing Number is : "+obj.missingNumber(test));
    }

    public int missingNumber(int[] nums) {
        int result = nums.length;
        for(int i = 0 ; i < nums.length; i++){
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }
}
