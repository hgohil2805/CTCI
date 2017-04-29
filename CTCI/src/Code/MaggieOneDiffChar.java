package Code;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iceman on 3/6/2017.
 */
public class MaggieOneDiffChar {
    public static void main(String args[]){
        MaggieOneDiffChar obj = new MaggieOneDiffChar();
        System.out.println(obj.findTheDifference("a","aa"));
    }


    public char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); ++i) {
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            c ^= t.charAt(i);
        }
        return c;
    }

}

