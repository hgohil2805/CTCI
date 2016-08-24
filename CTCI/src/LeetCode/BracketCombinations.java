package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 8/24/2016.
 */
public class BracketCombinations {

    public static void main(String args[]){
        BracketCombinations obj = new BracketCombinations();
        System.out.println(obj.generateParenthesis(3).toString());
    }


    public List<String> generateParenthesis(int n) {
        List<String> returnList = new ArrayList<String>();
        generateParenthesisHelper(returnList,"",0,0,n);
        return returnList;
    }

    public void generateParenthesisHelper(List<String> returnList, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            returnList.add(str);
            return;
        }

        if(open < max){
            generateParenthesisHelper(returnList, str +"(",open + 1, close, max);
        }
        if(close < open){
            generateParenthesisHelper(returnList, str + ")", open, close + 1, max);
        }

    }
}
