package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 8/15/2016.
 */
public class RotateArray {
    public static void main(String args[]){
        RotateArray obj = new RotateArray();
        //int[] test = {1,2,3,4,5,6,7};
        int[] test = {1};
        obj.rotate(test,2);
        System.out.println(Arrays.toString(test));
    }


    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end ){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
