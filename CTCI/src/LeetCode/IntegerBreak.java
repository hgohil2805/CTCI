package LeetCode;

/**
 * Created by iceman on 8/22/2016.
 */
public class IntegerBreak {
    public static void main(String args[]){
        IntegerBreak obj = new IntegerBreak();
        System.out.println("Max Integer Break product : "+obj.integerBreak(10));
    }

    public int integerBreak(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;

        int product = 1;
        while(n > 4){
            product *= 3;
            n -= 3;
        }
        product *= n;

        return product;
    }
}
