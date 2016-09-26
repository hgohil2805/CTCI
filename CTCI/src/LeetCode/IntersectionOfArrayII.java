package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by iceman on 9/25/2016.
 */
public class IntersectionOfArrayII {
    public static void main(String args[]){
        IntersectionOfArrayII obj = new IntersectionOfArrayII();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(obj.intersect(nums1,nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i = 0 , j = 0; i < nums1.length && j < nums2.length;){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        int[] returnArray = new int[result.size()];
        int i = 0;
        for(Integer r : result){
            returnArray[i++] = r;
        }
        return returnArray;
    }
}
