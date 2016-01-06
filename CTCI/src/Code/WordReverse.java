package Code;
import java.util.*;

public class WordReverse 
{
	public static void main(String args[])
	{
		String s = "i like this program very much";
		String output = "";
		for(String part : s.split(" "))
		{
			output += new StringBuilder(part).reverse().toString() + " ";
			//System.out.print(" ");
		}
		
		output = new StringBuilder(output).reverse().toString();
		
		System.out.println(output);
		
		String a = new String("abc");
		String b = new String("abc");
		
		System.out.println(a == b);
	}
}
