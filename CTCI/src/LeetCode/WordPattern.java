package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iceman on 7/27/2016.
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> mapping = new HashMap<Character,String>();
        String[] strArray = str.split(" ");

        if(strArray.length != pattern.length()){
            return false;
        }

        for(int i = 0 ; i < pattern.length(); i++){
            Character currentCharacter = pattern.charAt(i);

            if(mapping.containsKey(currentCharacter))
            {
                if(!mapping.get(currentCharacter).equals(strArray[i]))
                {
                    return false;
                }
            }
            else{
                if(mapping.containsValue(strArray[i])){
                    return false;
                }

                mapping.put(currentCharacter,strArray[i]);
            }
        }
            return true;
    }
}
