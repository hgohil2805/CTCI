package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by iceman on 9/7/2016.
 */
public class SubsetsII {

    public static void main(String args[]) {
        SubsetsII obj = new SubsetsII();
        int nums[] = {2, 2, 2, 3, 4};
        for (List<Integer> list : obj.subsetsWithDup(nums)) {
            System.out.println(list.toString());
        }

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        subsetsWithDupHelper(result, current, 0, nums);
        return result;
    }

    public void subsetsWithDupHelper(List<List<Integer>> result, List<Integer> current, int pos, int[] nums) {
        if (pos <= nums.length) {
            result.add(current);
        }
        int i = pos;
        while (i < nums.length) {
            current.add(nums[i]);
            subsetsWithDupHelper(result, new ArrayList<>(current), i + 1, nums);
            current.remove(current.size() - 1);
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            }
        }
        return;
    }
}
