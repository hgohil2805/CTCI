package LeetCode;

/**
 * Created by iceman on 8/10/2016.
 */
public class ReverseInteger {

    public static void main(String args[]){
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(123));
        System.out.println("Integer max value is : "+Integer.MAX_VALUE);
        System.out.println("Integer min value is : "+Integer.MIN_VALUE);
        System.out.println(obj.reverse(Integer.MIN_VALUE));
    }

    public int reverse(int x) {
        int result = 0;

        while(x != 0){
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if((newResult - tail) / 10 != result){
                return 0;
            }
            result = newResult;
            x = x/10;
        }

        return result;
    }
}
