package LeetCode;

/**
 * Created by iceman on 4/11/2016.
 */
public class Anagram {

    public static void main(String args[]){
        Anagram obj = new Anagram();
        String a = "";
        String b = "";

        System.out.println(obj.isAnagram(a,b));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

       if(s.length() == t.length() && s.length() == 0)
           return true;

        int sCount = 0;
        int[] charCount = new int[256];
        for(int i = 0; i < s.length(); i++){
            int value = (int)s.charAt(i);
            if(charCount[value] == 0 ){
                sCount = sCount + 1;
            }
            charCount[value] = charCount[value] + 1;
        }

        int tCount = 0;

        for(int i = 0; i < t.length(); i++){
            int value = (int)t.charAt(i);
            if(charCount[value]==0){
                return false;
            }
            else {
                charCount[value] = charCount[value] - 1;
                if(charCount[value] == 0){
                    tCount = tCount + 1;
                    if(tCount == sCount){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
