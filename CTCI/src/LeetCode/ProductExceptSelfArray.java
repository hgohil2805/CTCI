package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 8/19/2016.
 */
public class ProductExceptSelfArray {
    public static void main(String args[]){
        ProductExceptSelfArray obj = new ProductExceptSelfArray();
        int[] nums = {2,3,4,5};
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

}
