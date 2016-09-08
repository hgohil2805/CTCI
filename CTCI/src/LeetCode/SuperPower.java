package LeetCode;

/**
 * Created by iceman on 9/8/2016.
 */
public class SuperPower {

    public static void main(String args[]){
        SuperPower obj = new SuperPower();
        int[] b = {1,0};
        System.out.println("Super Power is : "+obj.superPow(2,b));
    }
    public int superPow(int a, int[] b) {
        if (a % 1337 == 0) return 0;
        int p = 0;
        for (int i : b) p = (p * 10 + i) % 1140;
        if (p == 0) p += 1440;
        return power(a, p, 1337);
    }
    public int power(int a, int n, int mod) {
        a %= mod;
        int ret = 1;
        while (n != 0) {
            if ((n & 1) != 0) ret = ret * a % mod;
            a = a * a % mod;
            n >>= 1;
        }
        return ret;
    }
}
