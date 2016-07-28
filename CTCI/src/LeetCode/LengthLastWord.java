package LeetCode;

/**
 * Created by iceman on 7/28/2016.
 */
public class LengthLastWord {

    public static void main(String args[]){
        LengthLastWord obj = new LengthLastWord();
        System.out.println(obj.lengthOfLastWord("   Hello  World  "));
    }

    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = 0 ; i < s.length(); i++){
            char currentChar = s.charAt(i);

            if((currentChar == ' ' && i < s.length() - 1 && s.charAt(i + 1) == ' ') || (currentChar == ' ' &&
                    i == s.length() - 1)){
                continue;
            }
            else if(currentChar == ' ' && i<s.length() - 1 && s.charAt(i+1) != ' '){
                count = 0;
            }
            else {
                count++;
            }
        }

        return count;
    }
}
