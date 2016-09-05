package LeetCode;

/**
 * Created by iceman on 9/5/2016.
 */
public class FindPeakElement {

    public static void main(String args[]) {
        FindPeakElement obj = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};

        System.out.println("Peak Element is : " + obj.findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        return findPeakElementHelper(nums, 0, nums.length - 1);
    }

    public int findPeakElementHelper(int[] nums, int start, int end) {
        if (start == end)
            return start;
        else if (start + 1 == end) {
            if (nums[start] > nums[end]) return start;
            return end;
        } else {
            int m = (start + end) / 2;
            if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) {
                return m;
            } else if (nums[m - 1] > nums[m] && nums[m] > nums[m + 1]) {
                return findPeakElementHelper(nums, start, m - 1);
            } else {
                return findPeakElementHelper(nums, m + 1, end);
            }
        }
    }
}
