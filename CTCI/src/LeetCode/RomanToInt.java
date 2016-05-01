package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iceman on 4/28/2016.
 */
public class RomanToInt {
    public static Map<Character, Integer> map = new HashMap();
    public static void main(String args[]){
            populateMap();
        RomanToInt obj = new RomanToInt();
        System.out.println(obj.romanToInt("IX"));
    }

    public int romanToInt(String s) {
        if(s == null || s.length() == 0)
            return 0;
        populateMap();
        int prev = 0;
        int sum = 0;
        for(int  i = s.length() - 1; i >= 0 ; i--){
            char currentCharacter = s.charAt(i);
            int currentValue = map.get(currentCharacter);

            if(i == s.length() - 1){
                sum = sum + currentValue;
            }
            else{
                if(currentValue < prev){
                    sum -= currentValue;
                }
                else{
                    sum += currentValue;
                }

            }
            prev = currentValue;
        }
        return sum;
    }

    public static void populateMap(){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
}
