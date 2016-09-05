package LeetCode;

/**
 * Created by iceman on 9/5/2016.
 */
public class WiggleSubSequence {

    public static void main(String args[]){
        WiggleSubSequence obj = new WiggleSubSequence();
        int[] nums = {1,1,7,4,9,2,5};
        System.out.println("Wiggle length : "+obj.wiggleMaxLength(nums));
    }


    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int count = 1;
        Boolean prevInc = null;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1] && (prevInc == null || !prevInc)) {
                prevInc = true;
                count++;
            } else if(nums[i] < nums[i - 1] && (prevInc == null || prevInc)) {
                prevInc = false;
                count++;
            }
        }
        return count;
    }
}
