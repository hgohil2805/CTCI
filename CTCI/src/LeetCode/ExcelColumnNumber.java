package LeetCode;

/**
 * Created by iceman on 4/23/2016.
 */
public class ExcelColumnNumber {
    public static void main(String args[]){
        ExcelColumnNumber obj = new ExcelColumnNumber();
        String s = "AA";
        System.out.println("Value is: "+obj.titleToNumber(s));
    }

    public int titleToNumber(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        int i = s.length() - 1;
        int value = 0;
        int t = 0;
        while(i >= 0){
            char curr = s.charAt(i);
            value = (int) (value + Math.pow(26,t) * (curr-'A' +1));
            t++;
            i--;
        }
        return value;
    }
}
