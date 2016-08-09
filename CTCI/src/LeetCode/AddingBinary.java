package LeetCode;

/**
 * Created by hg71335 on 7/29/2016.
 */
public class AddingBinary {

    public static void main(String args[]){
        AddingBinary obj = new AddingBinary();
        System.out.println(obj.addBinary("11","1"));
    }

    public String addBinary(String a, String b){
        if(a == null || b == null)
            return null;

        StringBuilder result = new StringBuilder();
        int carry = 0;

        int first = a.length() - 1;
        int second = b.length() - 1;

        while(first >= 0 || second >= 0){
            int sum = carry;

            if(first >= 0){
                sum += a.charAt(first) - '0';
                first--;
            }

            if(second>=0){
                sum+= b.charAt(second) - '0';
                second--;
            }

            carry = sum >> 1;
            sum = sum & 1;

            result.append(sum == 0 ? '0' : '1');
        }

        if(carry >= 1){
            result.append("1");
        }

        return result.reverse().toString();

    }
}
