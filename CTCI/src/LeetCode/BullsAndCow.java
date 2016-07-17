package LeetCode;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by iceman on 7/11/2016.
 */
public class BullsAndCow {

    public static void main(String args[]){
        BullsAndCow obj = new BullsAndCow();
        String firstNumber = "1807";
        String secondNumber = "7801";

        System.out.println(obj.getHint(firstNumber,secondNumber));
    }

    public String getHint(String secret, String guess){
        int length = secret.length();
        int[] secretArr = new int[10];
        int[] guessArr = new int[10];

        int bull = 0;
        int cow = 0;
        for(int i = 0; i < length; i++){
            if(secret.charAt(i) == guess.charAt(i)){
                ++bull;
            }else{
                ++secretArr[secret.charAt(i) - '0'];
                ++guessArr[guess.charAt(i) - '0'];
            }
        }

        for(int i = 0 ; i < 10; i++){
            cow += Math.min(secretArr[i],guessArr[i]);
        }

        return new String(String.format("%dA%dB", bull,cow));
    }
}
