package LeetCode;

/**
 * Created by hg71335 on 7/29/2016.
 */
public class ReverseBits {
    public static void main(String args[]){
        ReverseBits obj = new ReverseBits();
        System.out.println("Input bits are : "+Integer.toBinaryString(13));
        System.out.println("Output bits are : "+Integer.toBinaryString(obj.reverseBits(13)));
    }


    public int reverseBits(int n){
        if(n == 0)
            return 0;

        int result = 0;

        for(int i = 0 ; i < 32 ; i++){
            result <<= 1;
            if( (n & 1) == 1){
                result +=1;
            }
            n >>= 1;
        }
        return result;
    }
}
