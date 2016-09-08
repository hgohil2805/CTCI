package LeetCode;

/**
 * Created by iceman on 9/8/2016.
 */
public class LongestSubstringwithKRepeating {

    public static void main(String args[]) {
        LongestSubstringwithKRepeating obj = new LongestSubstringwithKRepeating();
        String s = "aaabb";
        System.out.println(obj.longestSubstring(s, 3));
    }

    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        return longestSubstringHelper(str, 0, s.length(), k);
    }

    public int longestSubstringHelper(char[] str, int start, int end, int k) {
        if (end < start) return 0;
        if (end - start < k) return 0;
        int[] count = new int[26];
        for (int i = start; i < end; i++) {
            int index = str[i] - 'a';
            count[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) continue;
            if (count[i] < k) {
                for (int j = start; j < end; j++) {
                    if (str[j] == i + 'a') {
                        int left = longestSubstringHelper(str, start, j, k);
                        int right = longestSubstringHelper(str, j + 1, end, k);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end - start;
    }
}
