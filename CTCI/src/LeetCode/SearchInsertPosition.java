package LeetCode;

/**
 * Created by iceman on 8/28/2016.
 */
public class SearchInsertPosition {

    public static void main(String args[]) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.println("Position of 2 is: "+obj.searchInsert(nums, 2));

    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;


        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
