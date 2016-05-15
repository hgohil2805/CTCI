package LeetCode;

/**
 * Created by iceman on 5/15/2016.
 */
public class PowerOfFour {
    public static void main(String args[]){
        PowerOfFour obj = new PowerOfFour();
        System.out.println(obj.isPowerOfFour(16));
        }

    public boolean isPowerOfFour(int num) {
        if(num == 0)
            return false;

        int pow = (int)(Math.log(num)/Math.log(4));
        return num == Math.pow(4,pow) ? true : false;
    }
}
