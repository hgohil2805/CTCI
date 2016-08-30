package LeetCode;

import java.util.Arrays;

/**
 * Created by iceman on 8/30/2016.
 */
public class SpiralMatrix2 {

    public static void main(String args[]){
        SpiralMatrix2 obj = new SpiralMatrix2();
        int[][] result = obj.generateMatrix(4);
        System.out.println(Arrays.deepToString(result));
    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        if(n == 0)
            return matrix;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n-1;
        int num = 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int  i = colStart; i<=colEnd;i++){
                matrix[rowStart][i] = num++;
            }
            rowStart++;

            for(int i = rowStart; i<=rowEnd;i++){
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            for(int i = colEnd;i >=colStart;i--){
                if(rowStart <= rowEnd){
                    matrix[rowEnd][i] = num++;
                }
            }
            rowEnd--;

            for(int i = rowEnd; i >= rowStart;i--){
                if(colStart <= colEnd){
                    matrix[i][colStart] = num++;
                }
            }
            colStart++;
        }
        return matrix;
    }
}
