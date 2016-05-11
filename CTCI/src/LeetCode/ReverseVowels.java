package LeetCode;

/**
 * Created by iceman on 5/10/2016.
 */
public class ReverseVowels {

    public static void main(String args[]){
        ReverseVowels obj = new ReverseVowels();
        System.out.println(obj.reverseVowels("hello"));
        System.out.println(obj.reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] charString = s.toCharArray();
        while(i < j){
            if(this.isVowel(s.charAt(i)) && this.isVowel(s.charAt(j))){
                char temp = charString[i];
                charString[i] = charString[j];
                charString[j] = temp;
                i++;
                j--;
            }
            else if(this.isVowel(s.charAt(i)) && !this.isVowel(s.charAt(j))){
                j--;
            }
            else if(this.isVowel(s.charAt(j)) && !this.isVowel(s.charAt(i))){
                i++;
            }
            else{
                i++;
                j--;

            }
        }
        return new String(charString);
    }

    public boolean isVowel(char a){
        if(a == 'A'|| a == 'I' || a == 'O' || a == 'E' || a == 'U'
                || a == 'a'|| a == 'e' || a == 'i' || a == 'o' || a == 'u')
            return true;
        return false;
    }
}
