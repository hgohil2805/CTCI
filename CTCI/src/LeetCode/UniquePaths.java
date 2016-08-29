package LeetCode;

/**
 * Created by iceman on 8/29/2016.
 */
public class UniquePaths {
    public static void main(String args[]){
        UniquePaths obj = new UniquePaths();
        System.out.println("Unique paths for robot are : "+obj.uniquePaths(3,7));
    }

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m<n){
            m = m + n;
            n = m - n;
            m = m - n;
        }

        long res = 1;
        int j = 1;
        for(int  i = m + 1 ; i <= m + n; i++,j++){
            res *= i;
            res /= j;
        }

        return (int)res;
    }
}
