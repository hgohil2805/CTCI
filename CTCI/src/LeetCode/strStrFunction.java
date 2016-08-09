package LeetCode;

/**
 * Created by hg71335 on 7/29/2016.
 */
public class strStrFunction {

    public static void main(String args[]) {
        strStrFunction obj = new strStrFunction();
        System.out.println(obj.strStr("mississippi", "issip"));
    }


    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        if(l1 < l2){
            return -1;
        }
        if(l2 == 0){
            return 0;
        }

        int threshold = l1 - l2;

        for(int i = 0; i <= threshold ;++i){
            if(haystack.substring(i, i + l2).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
