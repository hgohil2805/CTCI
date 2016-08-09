package LeetCode;

import java.util.Arrays;

/**
 * Created by hg71335 on 7/29/2016.
 */
public class CommonPrefix {
    public static void main(String args[]) {
        CommonPrefix obj = new CommonPrefix();
        String[] input = {"ab", "abc", "abcd", "abc"};
        System.out.println(obj.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0)
            return "";

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (i < b.length && a[i] == b[i]) {
                result.append(b[i]);
            } else
                return result.toString();
        }
        return result.toString();
    }
}
