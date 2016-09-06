package LeetCode;

import java.util.Stack;

/**
 * Created by iceman on 9/6/2016.
 */
public class StringDecode {

    public static void main(String args[]){
        StringDecode obj = new StringDecode();
        System.out.println("Decoded String is : "+obj.decodeString("3[a]2[bc]"));
    }

    public String decodeString(String s) {
        String res = "";
        Stack<Integer> count = new Stack<Integer>();
        Stack<String> result = new Stack<String>();

        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = 10 * num + (s.charAt(index) - '0');
                    index++;
                }
                count.push(num);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int repeatCount = count.pop();
                for (int i = 0; i < repeatCount; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += s.charAt(index++);
            }
        }
        return res;
    }
}
