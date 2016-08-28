package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by iceman on 8/28/2016.
 */
public class DifferentWaysToAddParanthesis {
    public static void main(String args[]) {
        DifferentWaysToAddParanthesis obj = new DifferentWaysToAddParanthesis();
        System.out.println("Result of the expression is : " + obj.diffWaysToCompute("2*3-4*5").toString());
    }

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> returnList = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '-' || currentChar == '+' || currentChar == '*') {
                String p1 = input.substring(0, i);
                String p2 = input.substring(i + 1);
                List<Integer> part1Return = diffWaysToCompute(p1);
                List<Integer> part2Return = diffWaysToCompute(p2);

                for (Integer l1 : part1Return) {
                    for (Integer l2 : part2Return) {
                        int c = 0;
                        switch (currentChar) {
                            case '-':
                                c = l1 - l2;
                                break;
                            case '+':
                                c = l1 + l2;
                                break;
                            case '*':
                                c = l1 * l2;
                                break;
                        }
                        returnList.add(c);
                    }
                }
            }
        }
        if (returnList.size() == 0) {
            returnList.add(Integer.valueOf(input));
        }
        return returnList;
    }
}

