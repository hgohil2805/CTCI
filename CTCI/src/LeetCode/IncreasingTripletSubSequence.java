package LeetCode;

/**
 * Created by iceman on 9/2/2016.
 */
public class IncreasingTripletSubSequence {

    public static void main(String args[]){
        IncreasingTripletSubSequence obj = new IncreasingTripletSubSequence();
        int[] nums = {1,3,4,5,6};
        int[] wrongNums = {5,4,3,2};

        System.out.println("Correct nums is : "+obj.increasingTriplet(nums));
        System.out.println("Wrong nums is : "+obj.increasingTriplet(wrongNums));
    }

    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] <= min){
                min = nums[i];
            }
            else if(nums[i] < secondMin){
                secondMin = nums[i];
            }
            else if(nums[i] > secondMin){
                return true;
            }
        }
        return false;
    }

}
