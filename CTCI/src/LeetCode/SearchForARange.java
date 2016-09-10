package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 9/10/2016.
 */
public class SearchForARange {

    public static void main(String args[]){
        SearchForARange obj = new SearchForARange();
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(obj.searchRange(nums,8)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1,-1};
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            int mid = (i + j) / 2;
            if(nums[mid] < target)
                i = mid + 1;
            else
                j = mid;
        }
        if(nums[i] != target){
            return ret;
        }else
            ret[0] = i;

        j = nums.length - 1;
        while (i < j){
            int mid = (i + j) / 2 + 1;
            if(nums[mid] > target)
                j = mid - 1;
            else
                i = mid;
        }
        ret[1] = j;
        return ret;
    }
}
