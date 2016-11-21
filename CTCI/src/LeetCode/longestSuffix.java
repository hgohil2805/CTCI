package LeetCode;

/**
 * Created by iceman on 11/20/2016.
 */
public class longestSuffix {
    public static void main(String args[]){
        String a = "";
        String b = "";

        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        int count = 0;
        while(p1 >= 0 && p2 >= 0){
            if(a.charAt(p1) == b.charAt(p2))
            {
                count++;
                p1--;
                p2--;
            }
            else
                break;
        }

        if(count == 0)
            System.out.println("Null");
        else {
            System.out.println(a.substring(count - 1, a.length()));
        }}
}
