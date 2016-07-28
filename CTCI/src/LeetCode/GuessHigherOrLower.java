package LeetCode;

/**
 * Created by iceman on 7/28/2016.
 */
public class GuessHigherOrLower {

    public int guessNumber(int n) {
        int i = 1;
        int j  = n;

        while(i < j){
            int mid = i + (j - i)/ 2;
            if(guess(mid) == 0){
                return mid;
            }
            else if (guess(mid) == 1){
                i = mid + 1;
            }
            else{
                j = mid;
            }
        }
        return 0;
    }

    int guess(int n){
        int guess = 10;
        if(n == guess)
            return 0;
        if(n < guess)
            return -1;
        else
            return 1;
    }
}
