package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 8/16/2016.
 */
public class CountingBits {

    public static void main(String args[]) {
        CountingBits obj = new CountingBits();
        System.out.println(Arrays.toString(obj.countBits(15)));
    }


    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        ret[0] = 0;
        int power = 1;
        for (int i = 1, t = 0; i <= num; i++, t++) {
            if (i == power) {
                power = power * 2;
                t = 0;
            }
            ret[i] = ret[t] + 1;
        }
        return ret;
    }

}
