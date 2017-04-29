package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 9/6/2016.
 */
public class LexicographicalNumbers {

    public static void main(String args[]){
        LexicographicalNumbers obj = new LexicographicalNumbers();
        System.out.println(obj.lexicalOrder(40).toString());
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < 10; ++i) {
                lexicalOrderHelper(result,i,n);
        }
        return result;
    }

    public void lexicalOrderHelper(List<Integer> result, int current, int n) {
        if (current > n) {
            return;
        }
        result.add(current);
        for (int i = 0; i < 10; ++i) {
            if (10 * current + i > n)
                return;
            lexicalOrderHelper(result, 10 * current + i, n);
        }
    }


}
