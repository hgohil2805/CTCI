package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 8/29/2016.
 */
public class GrayCode {
    public static void main(String args[]){
        GrayCode obj = new GrayCode();
        System.out.println("Gray code list : "+obj.grayCode(2));
    }


    public List<Integer> grayCode(int n) {
        List<Integer> returnList = new ArrayList<Integer>();
        for(int i = 0 ; i < 1 << n ; i++){
            returnList.add(i ^ i >> 1);
        }
        return returnList;
    }
}
