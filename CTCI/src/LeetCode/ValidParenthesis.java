package LeetCode;

import java.util.Stack;
/**
 * Created by iceman on 7/27/2016.
 */
public class ValidParenthesis {

    public static void main(String args[]){
        ValidParenthesis obj = new ValidParenthesis();
        System.out.println(obj.isValid("("));
    }

    public boolean isValid(String s) {
        Stack<Character> validator = new Stack<Character>();

        for(int i = 0  ; i < s.length() ; i ++){
            Character currentCharacter = s.charAt(i);
            if(currentCharacter == '(' || currentCharacter == '{' || currentCharacter == '['){
                validator.push(currentCharacter);
            }
            else{
                Character expectedCharacter = getOpeningBracket(s.charAt(i));
                if(validator.isEmpty() || validator.peek() != expectedCharacter){
                    return false;
                }else{
                    validator.pop();
                }

            }
        }
        if(validator.isEmpty())
            return true;
        else
            return false;
    }

    public Character getOpeningBracket(Character closingParan){

        switch (closingParan){
            case ')':
            {
                return '(';
            }

            case '}':
            {
                return '{';
            }

            case ']':
            {
                return '[';
            }

        }
        return null;
    }
}

