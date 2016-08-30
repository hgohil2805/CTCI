package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 8/30/2016.
 */
public class Combinations {

    public static void main(String args[]){
        Combinations obj = new Combinations();
        System.out.println("Combination :"+ combine(4,2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }
    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
        }
    }
}
