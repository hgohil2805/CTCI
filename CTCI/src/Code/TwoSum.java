package Code;

import java.util.Arrays;

/**
 * Created by iceman on 8/22/2016.
 */
public class TwoSum {

    public static void main(String args[]){
        TwoSum obj = new TwoSum();
        int[] nums = {2,5,7,11,15};
        System.out.println("Combo of index : " + Arrays.toString(obj.twoSum(nums,9)));

    }

    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        if(numbers == null || numbers.length < 2){
            return indices;
        }
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int value = numbers[left] + numbers[right];
            if(value == target){
                indices[0] = left + 1;
                indices[1] = right + 1;
                break;
            }
            else if(value > target){
                right--;
            }
            else{
                left++;
            }
        }
        return indices;
    }
}
