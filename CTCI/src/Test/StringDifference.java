package Test;

/**
 * Created by iceman on 1/8/2017.
 */
public class StringDifference {

    public static void main(String args[]){
        String a = "abcd";
        String b = "abcde";
        char ch = 0;

        for(int i = 0; i < a.length(); i++){
            ch ^= a.charAt(i);
            System.out.println(ch);
        }
        for(int i = 0; i < b.length(); i++){
            ch ^= b.charAt(i);
            System.out.println(ch);
        }

        System.out.println(ch);
        }
}
