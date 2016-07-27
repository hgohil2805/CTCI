package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 7/27/2016.
 */
public class mergeSortedArrays {
    public static void main(String args[]){
        mergeSortedArrays obj = new mergeSortedArrays();
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 6;
        int[] nums2 = {3,4,5};
        obj.merge(nums1,3,nums2,3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m+n;
        while(--p>=0){
            if(p1 < 0 || (p2 >=0 && nums1[p1] < nums2[p2])){
                nums1[p] = nums2[p2--];
            }
            else{
                nums1[p] = nums1[p1--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
