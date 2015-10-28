package Code;
import java.util.*;
public class ReverseString 
{
	static Scanner in = new Scanner(System.in);
	public static String reverseMethod(String s)
	{
		if(s.length() <= 1)
			return s;
		char[] a = s.toCharArray();
		int start = 0;
		int end = a.length - 1;
		while(start < end)
		{
			char temp = a[start];
			a[start++] = a[end];
			a[end--] = temp;
		}
		return new String(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the string to be reversed");
		String inputString = in.nextLine();
		System.out.println(reverseMethod(inputString));
	}

}
