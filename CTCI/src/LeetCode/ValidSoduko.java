package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by iceman on 7/3/2016.
 */
public class ValidSoduko {
    public static void main(String args[]){
        ValidSoduko obj = new ValidSoduko();

    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character>[] setXX = new HashSet[9];
        Set<Character>[] setYY = new HashSet[9];
        Set<Character>[] setXY = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            setXX[i] = new HashSet<Character>();
            setYY[i] = new HashSet<Character>();
            setXY[i] = new HashSet<Character>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if(!setXX[i].add(board[i][j])){
                    return false;
                }
                if(!setYY[j].add(board[i][j])){
                    return false;
                }
                if(!setXY[(j / 3)* 3 + i / 3].add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

}

