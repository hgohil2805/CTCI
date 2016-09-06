package LeetCode;

/**
 * Created by iceman on 9/6/2016.
 */
public class RemoveDuplicatesII {

    public static void main(String args[]) {
        RemoveDuplicatesII obj = new RemoveDuplicatesII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println("Processed array : " + obj.removeDuplicates(nums));
    }


    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        }
        return i;
    }
}
