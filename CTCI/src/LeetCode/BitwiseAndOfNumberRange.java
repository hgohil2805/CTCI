package LeetCode;

/**
 * Created by iceman on 9/7/2016.
 */
public class BitwiseAndOfNumberRange {

    public static void main(String args[]){
        BitwiseAndOfNumberRange obj = new BitwiseAndOfNumberRange();
        System.out.println("Range : "+obj.rangeBitwiseAnd(5,7));
    }


    public int rangeBitwiseAnd(int m, int n) {
        if(m == 0){
            return 0;
        }
        int moveFactor = 1;
        while( m!= n ){
            m >>= 1;
            n >>= 1;
            moveFactor <<= 1;
        }
        return m * moveFactor;
    }
}
