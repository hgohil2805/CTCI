package LeetCode;

/**
 * Created by iceman on 8/31/2016.
 */
public class MinimumPathSum {

    public static void main(String args[]){
        MinimumPathSum obj = new MinimumPathSum();
        int[][] nums = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,12,19},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println("Min path : "+obj.minPathSum(nums));
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (i != 0 && j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                } else if (i == 0 && j == 0) {
                    grid[i][j] = grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j]) + grid[i][j];
                }
            }
        }
        return grid[m - 1][n - 1];
    }
}
