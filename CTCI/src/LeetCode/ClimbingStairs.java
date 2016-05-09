package LeetCode;

/**
 * Created by iceman on 5/9/2016.
 */
public class ClimbingStairs {

    public static void main(String args[]){
        ClimbingStairs obj = new ClimbingStairs();
        System.out.println(obj.climbStairs(44 + 1));
    }

    public int climbStairs(int n) {
        if(n <= 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3;  i <= n ; i ++){
            dp[i] = dp[i - 1]+ dp[i - 2];
        }

        return dp[n];
    }
}
