package LeetCode;

/**
 * Created by iceman on 9/12/2016.
 */
public class NumberOfIslands {
    public static void main(String args[]){
        NumberOfIslands obj = new NumberOfIslands();
        char[][] nums = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println("count : "+obj.numIslands(nums));
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numIslandHelper(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void numIslandHelper(char[][] array, int i, int j) {
        if (j >= array[0].length || i >= array.length || i < 0 || j < 0 || array[i][j] == '2' || array[i][j] == '0') {
              return ;
        }

        if(array[i][j] == '1'){
            array[i][j] = '2';
        }
        numIslandHelper(array,i+1,j);
        numIslandHelper(array,i - 1,j);
        numIslandHelper(array,i,j+1);
        numIslandHelper(array,i,j-1);
    }
}
