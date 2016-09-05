package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 9/5/2016.
 */
public class SetMatrixZeroes {

    public static void main(String args[]){
        SetMatrixZeroes obj = new SetMatrixZeroes();
        int[][] nums = {{1,2,3,4},{1,0,1,1},{1,3,9,0}};
        obj.setZeroes(nums);
        System.out.println(Arrays.deepToString(nums));
    }

    public void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0)
                matrix[i][0] = 0;
        }
    }
}
