package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 6/5/2016.
 */
public class PascalTriangle2 {
    public static void main(String args[]){
        PascalTriangle2 obj = new PascalTriangle2();
        System.out.println(obj.getRow(2).toString());
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> previous = new ArrayList<Integer>();


        previous.add(1);

        if(rowIndex == 0){
            return previous;
        }

        for(int i = 1 ; i <= rowIndex ; i++){
            List<Integer> current = new ArrayList<Integer>();
            current.add(1);
            for(int j = 0 ; j < previous.size() - 1; j++){
                current.add(previous.get(j) + previous.get(j+1));
            }
            current.add(1);
            previous = current;
        }
        return previous;
    }

}
