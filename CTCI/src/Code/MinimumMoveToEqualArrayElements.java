package Code;

/**
 * Created by iceman on 12/1/2016.
 */
public class MinimumMoveToEqualArrayElements {

    public static void main(String args[]){
        MinimumMoveToEqualArrayElements obj = new MinimumMoveToEqualArrayElements();
        System.out.println("Minimum number of elements required : "+obj.minMoves(new int[]{1,2,3}));
    }

    public int minMoves(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - min * nums.length;
    }
}
