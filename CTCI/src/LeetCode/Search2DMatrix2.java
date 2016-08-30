package LeetCode;

/**
 * Created by iceman on 8/30/2016.
 */
public class Search2DMatrix2 {

    public static void main(String args[]){
        Search2DMatrix2 obj = new Search2DMatrix2();
        int[][] nums = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,12,19},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println("9 exists : "+obj.searchMatrix(nums,9));
        System.out.println("121 exists : "+obj.searchMatrix(nums,121));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row <= matrix.length-1 && col>=0){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target){
                col--;
            }
            else if(matrix[row][col] < target){
                row++;
            }
        }
        return false;
    }
}
