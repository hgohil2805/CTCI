package LeetCode;

/**
 * Created by iceman on 11/28/2016.
 */
public class IslandPerimeter {
    public static void main(String args[]) {
        IslandPerimeter obj = new IslandPerimeter();
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println("Island perimeter is: "+obj.islandPerimeter(grid));
    }

    public int islandPerimeter(int[][] grid) {
        int count = 0;

        for(int i = 0 ; i < grid.length;i++){
            for(int  j = 0 ; j < grid[i].length;j++){
                if(grid[i][j] == 1){
                    count+=4;
                    if(i > 0 && grid[i - 1][j] == 1)
                        count -= 2;
                    if(j > 0 && grid[i][j - 1] == 1)
                        count -=2;
                }
            }
        }
        return count;
    }
}
