package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 9/1/2016.
 */
public class sortColorsArray {

    public static void main(String args[]){
        sortColorsArray obj = new sortColorsArray();
        int nums[] = {0,1,2,0,1,2,0,1,2};
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        for(int i = 0;i<=end;){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start++] = temp;
                i++;
            }
            else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end--] = temp;

            }
            else {
                i++;
            }
        }
    }
}
