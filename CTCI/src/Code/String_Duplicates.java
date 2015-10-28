package Code;
import java.util.Arrays;
import java.util.Scanner;

public class String_Duplicates 
{
	static Scanner in = new Scanner(System.in);
	public static boolean Duplicates(String s)
	{
		if(s == null)
			return true;
		else
		{
			boolean[] check = new boolean[256];
			for(int i = 0 ; i < s.length(); i++)
			{
				int currentCharValue = (int)s.charAt(i);
				System.out.println("The current value of the char is: "+currentCharValue);
				if(check[currentCharValue])
				{
					return false;
				}
				else
				{
					check[currentCharValue] = true;
				}
			}
			return true;
		}
	}
	
	
	public static boolean DuplicatesWithoutSpace(String s)
	{
		if(s == null)
			return false;
		else
		{
			for(int i = 1 ; i < s.length() ; i ++)
			{
				for(int j = 0 ; j < i; j++)
				{
					if(s.charAt(i) == s.charAt(j))	
					{
						return false;
					}
				}
			}
			return true;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the string to be scanned for duplicates");
		String inputString = in.next();
		//boolean returnValue = Duplicates(inputString);
		boolean returnValue = DuplicatesWithoutSpace(inputString);
		if(returnValue)
		{
			System.out.println("The string has no Duplicates");
		}
		else
		{
			System.out.println("The String has Duplicates");
		}
		

	}

}
