package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 4/2/2016.
 */
public class MoveZeroes {

    public static void main(String args[]){
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        int[] allZeroes = {0,0,0,0,0};
        System.out.println("Original nums : "+Arrays.toString(nums));
        /*obj.moveZeroesToBeginning(nums);*/
        obj.moveZeroes(nums);
    }

    public void moveZeroesToBeginning(int[] nums) {

        if(nums == null || nums.length < 2){
                    nums = nums;
        }

        else{
            int index = 0;
            for(int  i = 1; i < nums.length;i++){
                if(nums[i] == 0){
                    int temp  = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
                index = i;
            }

            System.out.println("nums: "+ Arrays.toString(nums));
        }
    }


    /**
     * Move all numbers to beginning. Then replace everything after lastIndex with 0
     * */

    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2){
            System.out.println(Arrays.toString(nums));
        }

        else{
                int index = 0;
                for(int i = 0; i < nums.length; i++){
                        if(nums[i] != 0){
                            nums[index] = nums[i];
                            index++;
                        }

                }

                for(int i = index;i<nums.length;i++){
                    nums[i] = 0;
                }

            System.out.println("Nums : "+Arrays.toString(nums));
        }
    }

}
