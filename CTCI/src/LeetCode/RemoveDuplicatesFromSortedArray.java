package LeetCode;

/**
 * Created by iceman on 5/15/2016.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String args[]){
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,2};
        System.out.println(obj.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;

        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[j] == nums[i]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i+1;
    }
}
