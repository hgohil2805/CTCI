package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 5/14/2016.
 */
public class PascalTriangle {

    public static void main(String args[]){
        PascalTriangle obj = new PascalTriangle();
        List<List<Integer>> returnList = obj.generate(5);

        for(List<Integer> n: returnList){
            System.out.println(n.toString());
        }

    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();

        if(numRows == 0)
            return returnList;

        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        returnList.add(pre);

        for(int i = 2; i <= numRows; i++){
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int  j = 0 ; j < pre.size() - 1; j++){
                curr.add(pre.get(j) + pre.get(j+1));
            }
            curr.add(1);
            returnList.add(curr);
            pre = curr;
        }
        return returnList;
    }
}
