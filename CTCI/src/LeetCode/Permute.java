package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 8/29/2016.
 */
public class Permute {

    public static void main(String args[]){
        Permute obj = new Permute();
        int[] nums = {1,2,3};
        List<List<Integer>> answer = obj.permute(nums);
        for(List l : answer){
            System.out.println(l.toString());
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(nums[0]);
        returnList.add(l0);

        for(int i = 1 ; i < nums.length; ++i){
            List<List<Integer>> subAnswers = new ArrayList<List<Integer>>();
            for(int j = 0 ; j <= i ; ++j){
                for(List<Integer> l : returnList){
                    List<Integer> subList = new ArrayList<>(l);
                    subList.add(j,nums[i]);
                    subAnswers.add(subList);
                }
            }
            returnList = subAnswers;
        }
        return returnList;
    }
}
