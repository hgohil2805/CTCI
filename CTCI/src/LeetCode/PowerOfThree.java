package LeetCode;

/**
 * Created by iceman on 5/9/2016.
 */
public class PowerOfThree {

    public static void main(String args[]){
        PowerOfThree obj  = new PowerOfThree();
        System.out.println(obj.isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;

        while(n>0 && n%3 == 0){
            n = n/3;
        }

        if(n == 1)
            return true;

        return false;
    }
}
