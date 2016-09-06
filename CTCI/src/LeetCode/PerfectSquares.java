package LeetCode;

/**
 * Created by iceman on 9/6/2016.
 */
public class PerfectSquares {
    public static void main(String args[]) {
        PerfectSquares obj = new PerfectSquares();
        System.out.println("Number of perfect squares are : " + obj.numSquares(12));
    }


    public int numSquares(int n) {
        int[] min = new int[n + 1];
        min[1] = 1;
        for (int i = 2; i <= n; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                temp = Math.min(temp, min[i - j * j] + 1);
            }
            min[i] = temp;
        }
        return min[n];
    }

}
