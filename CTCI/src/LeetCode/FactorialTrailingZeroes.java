package LeetCode;

/**
 * Created by iceman on 6/5/2016.
 */
public class FactorialTrailingZeroes {

    public static void main(String args[]){
        FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
        System.out.println(obj.trailingZeroes(20));
    }
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n/5 + trailingZeroes(n/5);
    }
}
