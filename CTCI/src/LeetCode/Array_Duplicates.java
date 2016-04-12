package LeetCode;

import java.util.HashSet;


/**
 * Created by iceman on 4/12/2016.
 */
public class Array_Duplicates {

    public static void main(String args[]){
        Array_Duplicates obj = new Array_Duplicates();
        int[] test = {1,2,2};
        System.out.println(obj.containsDuplicate(test));
    }

    public boolean containsDuplicate(int[] nums) {
        if(nums ==null || nums.length < 1){
            return false;
        }
        HashSet<Integer> unique = new HashSet<Integer>();

        for(int n: nums){
            if(unique.contains(n))
                return true;
            else{
                unique.add(n);
            }
        }
        return false;
    }
}
