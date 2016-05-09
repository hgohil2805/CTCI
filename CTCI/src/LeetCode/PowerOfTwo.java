package LeetCode;

/**
 * Created by iceman on 5/9/2016.
 */
public class PowerOfTwo {

    public static void main(String args[]){
        PowerOfTwo obj = new PowerOfTwo() ;
        System.out.println(obj.isPowerOfTwo(4));
    }
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0)? true : false;
    }
}
