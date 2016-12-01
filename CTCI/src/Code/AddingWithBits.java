package Code;

/**
 * Created by iceman on 11/30/2016.
 */
public class AddingWithBits {

    public static void main(String args[]){
        AddingWithBits obj = new AddingWithBits();
        System.out.println("Adding of two nums : "+obj.getSum(3,5));
    }

    public int getSum(int a, int b) {

        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
