package Code;

/**
 * Created by iceman on 8/24/2016.
 */
public class IntegerToRoman {

    public static void main(String args[]){
        IntegerToRoman obj = new IntegerToRoman();
        System.out.println("Int to Roman is : "+obj.intToRoman(6));
    }

    public String intToRoman(int num) {
        String M[] = {"","M","MM","MMM"};
        String C[] = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)];
    }
}
