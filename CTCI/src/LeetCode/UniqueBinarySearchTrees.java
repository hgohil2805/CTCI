package LeetCode;

/**
 * Created by iceman on 8/26/2016.
 */

/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * <p/>
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 */
public class UniqueBinarySearchTrees {

    public static void main(String args[]){
        UniqueBinarySearchTrees obj = new UniqueBinarySearchTrees();
        System.out.println("Unique BST : " + obj.numTrees(3));
    }

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = G[1] = 1;

        for(int i = 2; i <= n;i++){
            for(int j = 1 ; j <= i ;j++){
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
