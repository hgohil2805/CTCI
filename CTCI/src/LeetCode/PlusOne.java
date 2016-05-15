package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 5/14/2016.
 */
public class PlusOne {

    public static void main(String args[]){
        PlusOne obj = new PlusOne();
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(obj.plusOne(digits)));
    }
    public int[] plusOne(int[] digits) {
        if(digits == null)
            return null;
        int carry = 1;
        for (int i = digits.length - 1; i >=0 ; i--){
            digits[i] = digits[i] + carry;
            if(digits[i] <= 9){
                return digits;
            }
            digits[i] = 0;
        }
        int newNum[] = new int[digits.length + 1];
        newNum[0] = 1;
        return newNum;
    }
}
