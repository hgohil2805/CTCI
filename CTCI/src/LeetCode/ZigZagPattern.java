package LeetCode;

/**
 * Created by iceman on 8/9/2016.
 */
public class ZigZagPattern {

    public static void main(String args[]){
        ZigZagPattern obj = new ZigZagPattern();
        System.out.println(obj.convert("PAYPALISHIRING",3));
    }



    public String convert(String s, int numRows) {
        char c[] = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0 ; i < sb.length; i++){
            sb[i] = new StringBuffer();
        }

        int i = 0;

        while(i<len){
            for(int index = 0; index < numRows && i < len; index++){
                sb[index].append(c[i++]);
            }
            for(int index = numRows - 2 ; index >= 1 &&  i < len ; index-- ){
                sb[index].append(c[i++]);
            }
        }

        for (int index = 1; index < sb.length; index++){
            sb[0].append(sb[index]);
        }
            return sb[0].toString();
    }
}
