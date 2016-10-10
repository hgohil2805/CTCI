package LeetCode;

/**
 * Created by iceman on 10/10/2016.
 */
public class AddStrings {

    public static void main(String args[]){
        AddStrings obj = new AddStrings();
        String first = "123";
        String second = "234";
        System.out.println("Sum "+obj.addStrings(first,second));
    }


    public String addStrings(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        StringBuilder sb = new StringBuilder();
        int sum = 0, carry = 0;
        while(index1 >=0 || index2 >= 0){
            int first  = index1 >= 0 ? num1.charAt(index1) - '0' : 0;
            int second = index2 >= 0 ? num2.charAt(index2) - '0' : 0;
            sum = first + second + carry;
            if(sum <= 9){
                sb.insert(0,sum);
                sum = 0;
                carry = 0;
            }
            else{
                sb.insert(0,sum % 10);
                sum = 0;
                carry = 1;
            }
            index1--;
            index2--;
        }

        if(carry == 1)
            sb.insert(0,1);

        return sb.toString();
    }
}
