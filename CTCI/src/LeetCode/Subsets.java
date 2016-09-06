package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by iceman on 9/6/2016.
 */
public class Subsets {

    public static void main(String args[]){
        Subsets obj = new Subsets();
        int[] nums = {1,2,3};
        List<List<Integer>> returnList = obj.subsets(nums);
        for(List<Integer> list : returnList){
            System.out.println(list.toString());
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        int totalNumber = 1 << nums.length;
        List<List<Integer>> collections = new ArrayList<List<Integer>>(totalNumber);
        for (int i = 0; i < totalNumber; i++) {
            List<Integer> set = new LinkedList<>();
            for(int j = 0; j < nums.length;j++){
                if((i & (1<<j)) != 0){
                    set.add(nums[j]);
                }
            }
            collections.add(set);
        }
        return collections;
    }
}
