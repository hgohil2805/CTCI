package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by iceman on 9/6/2016.
 */
public class CombinationSum {

    public static void main(String args[]) {
        CombinationSum obj = new CombinationSum();
        int[] nums = {2, 3, 6, 7};
        for (List<Integer> list : obj.combinationSum(nums, 7)) {
            System.out.println(list.toString());
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combinationSumHelper(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    public void combinationSumHelper(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target > 0) {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                current.add(candidates[i]);
                combinationSumHelper(result, current, candidates, target - candidates[i], i);
                current.remove(current.size() - 1);
            }
        } else if (target == 0) {
            result.add(new ArrayList<>(current));
        }
    }

}
