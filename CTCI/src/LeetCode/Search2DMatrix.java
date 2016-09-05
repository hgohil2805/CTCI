package LeetCode;

/**
 * Created by iceman on 9/4/2016.
 */
public class Search2DMatrix {

    public static void main(String args[]){
        Search2DMatrix obj = new Search2DMatrix();
        int[][] nums = {{1,   3,  5,  7},{10, 11, 16, 20},{23,30,24,50}};

        System.out.println("Exists : "+obj.searchMatrix(nums,50));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int start = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int end = rows * columns - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / columns][mid % columns] == target)
                return true;
            if (matrix[mid / columns][mid % columns] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

}
