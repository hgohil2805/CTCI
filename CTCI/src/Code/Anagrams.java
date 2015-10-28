package Code;

import java.util.Scanner;

public class Anagrams 
{
	static Scanner in = new Scanner(System.in);
	public static boolean ana(String a, String b)
	{
		
		if(a.length() != b.length())
			return false;
		else if(a == null || b == null)
			return false;
		else
		{
			int acount = 0, bcount = 0;
			int[] count = new int[256];
			for(int i =0; i < a.length(); i++)
			{
				int value = (int) a.charAt(i);
				if(count[value] == 0)
				{
					acount++;
					count[value] ++;
				}
			}
			
			for(int i = 0 ; i < b.length() ; i++)
			{
				int value = (int) b.charAt(i);
				if(count[value] == 0)
				{
					return false;
				}
				else
				{
					count[value]--;
					if(count[value] == 0)
					{
						bcount++;
					}
					if(bcount == acount)
						return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the first string");
		String a = in.next();
		System.out.println("Enter the second string");
		String  b = in.next();
		
		System.out.println(ana(a,b));

	}

}
