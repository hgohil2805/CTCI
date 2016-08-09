package LeetCode;

import com.sun.deploy.util.StringUtils;

/**
 * Created by iceman on 8/9/2016.
 */
public class ValidPalindrome {
    public static void main(String args[]){
        ValidPalindrome obj = new ValidPalindrome();
        //System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
        //System.out.println(obj.isPalindrome("race a car"));
        System.out.println(obj.isPalindrome("0P"));

    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
}
