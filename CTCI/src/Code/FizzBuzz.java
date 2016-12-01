package Code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iceman on 11/30/2016.
 */
public class FizzBuzz {
    public static void main(String args[]){
        FizzBuzz obj = new FizzBuzz();
        System.out.println(obj.fizzBuzz(15).toString());
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0)
            return result;
        for(int i = 1 ; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else if(i % 5 == 0){
                result.add("Buzz");
            }
            else
            {
                result.add(""+i);
            }
        }
        return result;
    }
}
