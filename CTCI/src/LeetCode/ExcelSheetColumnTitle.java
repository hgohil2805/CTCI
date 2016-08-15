package LeetCode;

/**
 * Created by iceman on 8/15/2016.
 */

/**
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ExcelSheetColumnTitle {

    public static void main(String args[]){
        ExcelSheetColumnTitle obj = new ExcelSheetColumnTitle();
        System.out.println(obj.convertToTitle(28));
    }

    public String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            char currentChar = (char)((n - 1) % 26 + 65);
            result = currentChar + result;
            n = (n - 1) / 26;
        }
        return result;
    }
}
