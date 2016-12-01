package Code;

import java.util.Arrays;

/**
 * Created by iceman on 11/30/2016.
 */
public class AssignCookies {

    public static void main(String args[]) {
        AssignCookies obj = new AssignCookies();
        int g[] = {10, 9, 8, 7};
        int s[] = {5, 6, 7, 8};

        System.out.println(obj.findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                j++;
                i++;
            } else if(s[j] < g[i]){
                j++;
            }
            else{
                i++;
            }

        }
        return count;
    }
}
