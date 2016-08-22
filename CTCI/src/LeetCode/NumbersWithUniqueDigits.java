package LeetCode;

/**
 * Created by iceman on 8/22/2016.
 */
public class NumbersWithUniqueDigits {

    public static void main(String args[]){
        NumbersWithUniqueDigits obj = new NumbersWithUniqueDigits();
        System.out.println("Number Count: "+obj.countNumbersWithUniqueDigits(2));
    }


    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;

        int result = 10;
        int uniqueDigits = 9;
        int availableNumbers = 9;

        while(n-- > 1 && availableNumbers > 0){
            uniqueDigits = uniqueDigits * availableNumbers;
            result += uniqueDigits;
            availableNumbers--;
        }
        return result;
    }
}
