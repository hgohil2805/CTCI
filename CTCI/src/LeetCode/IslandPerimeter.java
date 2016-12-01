package LeetCode;

/**
 * Created by iceman on 11/28/2016.
 */
public class IslandPerimeter {
    public static void main(String args[]) {
        IslandPerimeter obj = new IslandPerimeter();
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
    }

    public int islandPerimeter(int[][] grid) {
        int count = 0;

        for(int i = 0 ; i < grid.length;i++){
            for(int  j = 0 ; j < grid[i].length;j++){

                if(grid[i][j] == 1){
                    /*if()*/
                }
                else
                    continue;
            }
        }
        return 0;
    }
}
