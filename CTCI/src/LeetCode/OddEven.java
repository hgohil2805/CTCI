package LeetCode;

/**
 * Created by iceman on 11/20/2016.
 */
public class OddEven {

    public static void main(String args[]){
        String inputString = "12467930";

        stringFormatter();
        /*int startIndex = 0;
        int runner = startIndex + 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < inputString.length() - 1;i++){
            int currentNumber = Character.getNumericValue(inputString.charAt(i));
            int nextNumber = Character.getNumericValue(inputString.charAt(i + 1));
            if(currentNumber  != 0 && inputString.charAt(i) - '0' != 0){
                //Current and next both are even numbers
                if(inputString.charAt(i) - '0' % 2 == 0 && inputString.charAt(i) - '0' % 2 == 0){
                    sb.append(inputString.charAt(i) + "*");
                }
                //Both are odd
                else if(inputString.charAt(i) - '0' % 3 == 0 && inputString.charAt(i) - '0' %3 == 0){
                    sb.append(inputString.charAt(i) + '-');
                }
                else
                    sb.append(inputString.charAt(i));
            }
            else{
                sb.append(inputString.charAt(i));
            }
        }

        sb.append(inputString.charAt(inputString.length() - 1));

        System.out.println(sb.toString());*/
    }

    public static void stringFormatter(){
        String input = "124600793";
        StringBuilder out = new StringBuilder();

        for(int  i = 0 ; i < input.length(); i++){
            if(i == input.length() - 1){
                out.append(input.charAt(i));
                break;
            }
            else{
                int curr = input.charAt(i) - '0';
                int next = input.charAt(i + 1) - '0';

                if(curr % 2 == 0 && next % 2 == 0 && curr != 0){
                    out.append(curr + "*");
                }
                else if(curr % 2 == 1 && next % 2 == 1){
                    out.append(curr + "-");
                }
                else{
                    out.append(curr);
                }
            }
        }

        System.out.println(out);

    }
}
