package LeetCode;

/**
 * Created by iceman on 5/3/2016.
 */
public class HammingWeight {

    public static void main(String args[]){
        HammingWeight obj = new HammingWeight();
        System.out.println(obj.hammingWeight(11));
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
}
