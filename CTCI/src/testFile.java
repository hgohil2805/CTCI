import java.util.Arrays;
import java.util.regex.Pattern;

public class testFile {




	public static void main(String[] args) {
        String decimal_point = ".";

        String test = "123.1";

        if(test != null && String.valueOf(test).contains(decimal_point)) {
            System.out.println(test.toString().split(Pattern.quote(decimal_point))[1].length() <= 2 ? true : false);
        }
	}
}
