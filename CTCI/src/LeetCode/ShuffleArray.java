package LeetCode;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by iceman on 8/17/2016.
 */
public class ShuffleArray {

    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};

        ShuffleArray obj = new ShuffleArray(nums);

        System.out.println("Shuffled Array "+Arrays.toString(obj.shuffle()));
        System.out.println("Original Order: "+Arrays.toString(obj.reset()));
    }


    int[] nums = null;
    private Random random;

    public ShuffleArray(int[] nums) {
        this.nums = nums;
        random = new Random();

    }
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] ret = nums.clone();

        for(int i = 0 ; i < ret.length; i++){
            int randomNumber  = this.random.nextInt(i + 1);
            swap(ret, i , randomNumber);
        }
        return ret;
    }

    public void swap(int[] a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
