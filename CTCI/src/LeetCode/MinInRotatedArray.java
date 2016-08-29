package LeetCode;

/**
 * Created by iceman on 8/29/2016.
 */
public class MinInRotatedArray {

    public static void main(String args[]){
        MinInRotatedArray obj = new MinInRotatedArray();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("Min In Rotated Array is : "+obj.findMin(nums));
    }

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = (low + high)/2;
            if(nums[mid] < nums[high]){
                high = mid;
            }
            else if(nums[mid] > nums[high]){
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
