package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by iceman on 9/8/2016.
 */
public class LetterCombinationPhoneNumber {

    public String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};

    public static void main(String args[]) {
        LetterCombinationPhoneNumber obj = new LetterCombinationPhoneNumber();
        System.out.println("Letter combo is :" + obj.letterCombinations("23"));
        System.out.println("Letter combo empty is :" + obj.letterCombinations(""));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        if(digits == null || digits.length() == 0)
            return result;
        letterCombinationsHelper("", digits, 0, result);
        return result;
    }

    public void letterCombinationsHelper(String prefix, String digits, int offset, List<String> result) {
        if (offset >= digits.length()) {
            result.add(prefix);
            return;
        }
        String letters = keys[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationsHelper(prefix + letters.charAt(i), digits, offset + 1, result);
        }
    }

}
