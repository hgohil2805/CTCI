package chapter1;
import java.util.*;

public class rotateString {
	static Scanner in = new Scanner(System.in);
	public static boolean rotate(String a, String b)
	{
		if(a.length() != b.length())
			return false;
		String com = a+a;
		return (com.indexOf(b) != -1);
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the first String");
		String a = in.nextLine();
		System.out.println("Enter the second string");
		String b = in.nextLine();
		
		System.out.println(rotate(a,b));

	}

}
