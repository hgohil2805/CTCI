package LeetCode;

/**
 * Created by iceman on 9/1/2016.
 */
public class MaxIncreasingSubSequence {
    public static void main(String ars[]){
        MaxIncreasingSubSequence obj = new MaxIncreasingSubSequence();
        int nums[] = {4,5,6,3};
        System.out.println("Max Increasing Subsequence length :"+obj.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for(int x : nums){
            int i = 0 ; int j = size;
            while(i != j){
                int m = (i + j) / 2;
                if(tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if(i == size) ++size;
        }
        return size;
    }
}
