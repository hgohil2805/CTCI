package LeetCode;

/**
 * Created by iceman on 8/17/2016.
 */

import java.util.Arrays;

/**
 *
 * For example:
 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * */
public class SingleNumbers3 {

    public static void main(String args[]){
        SingleNumbers3 obj = new SingleNumbers3();
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(obj.singleNumber(nums)));
    }

    public int[] singleNumber(int[] nums) {
        int diff = 0;

        for(int num : nums){
            diff ^= num;
        }

        //diff now contains the XOR between the two different numbers

        //diff now equals the last set bit
        diff &= -diff;

        int[] rets = {0,0}; //return array

        for(int num : nums){
            if((num & diff ) == 0){
                rets[0] ^= num;
            }
            else{
                rets[1] ^= num;
            }
        }
        return rets;
    }

}
