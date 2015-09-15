package chapter1;
import java.util.*;
public class replaceWithChar 
{
	static Scanner in = new Scanner(System.in);
	public static String replace(String a)
	{
		return (a.replaceAll(" " , "%20"));
		
	}
	
	public static String remove(String a)
	{
		return (a.replaceAll("%20", " "));
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the string to replace all spaces");
		String inputString = in.nextLine();
		System.out.println(replace(inputString));
	}

}
