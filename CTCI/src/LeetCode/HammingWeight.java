package LeetCode;

/**
 * Created by iceman on 5/3/2016.
 */
public class HammingWeight {

    public static void main(String args[]){
        HammingWeight obj = new HammingWeight();
        System.out.println("================ Normal function ===========");
        System.out.println(obj.hammingWeight(11));
        System.out.println("============= JP Chase ============");
        System.out.println(obj.JPChase(11));
    }

    public int hammingWeight(int n) {
        int count = 0;

        for(int i = 0 ; i < 32; i++){
            if((n&1) == 1)
                count++;

          n = n >> 1;
        }
        return count;
    }
/*
    Subtraction of 1 from a number toggles all the bits (from right to left) till the rightmost set bit(including the righmost set bit)
    So if we subtract a number by 1 and do bitwise & with itself (n & (n-1)), we unset the righmost set bit. If we do n & (n-1)
    in a loop and count the no of times loop executes we get the set bit count.
    Solution would only execute the number of 1 bits that exist in the number.
    */

    public int JPChase(int n){
        int count = 0;

        while(n != 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
