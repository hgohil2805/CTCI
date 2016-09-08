package LeetCode;

/**
 * Created by iceman on 9/8/2016.
 */
public class HIndex {

    public static void main(String args[]){
        HIndex obj = new HIndex();
        int[] nums = {3, 0, 6, 1, 5};
        System.out.println("HIndex is : "+obj.hIndex(nums));
    }
    public int hIndex(int[] citations) {
        int length = citations.length;
        int[] count = new int[length + 1];
        for (int c : citations) {
            if (c > length) {
                count[length]++;
            } else
                count[c]++;
        }

        int total = 0;
        for (int i = length; i >= 0; i--) {
            total += count[i];
            if(total >= i)
                return i;
        }
        return 0;
    }
}
