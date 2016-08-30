package LeetCode;

/**
 * Created by iceman on 8/30/2016.
 */
public class perfectSquare {

    public static void main(String args[]){
        perfectSquare obj = new perfectSquare();
        System.out.println("Is perfect square for 4: "+obj.isPerfectSquare(4));
        System.out.println("Is perfect square for 14 :"+obj.isPerfectSquare(14));
    }

    public boolean isPerfectSquare(int num) {
        int i = 1;
        while(num > 0){
            num -= i;
            i += 2;
        }
        return num == 0;
    }

}
