package chapter1;

import java.util.Scanner;

public class removeDups 
{
	static Scanner in = new Scanner(System.in);
	public static String remove(String s)
	{
		if(s == null)
			return null;
		else if(s.length() < 2)
			return s;
		else
		{
			char[] str = s.toCharArray();
			int tail = 1;
			for(int i = 1; i < s.length();++i)
			{
				int j;
				for(j = 0; j < tail; ++j)
				{
					if(str[i] == str[j])
					{
						break;
					}
				}
				System.out.println("i : " +i +"\t  j: "+j +" \t tail: "+tail);
				if(j == tail)
				{
					str[tail] = str[i];
					++tail;
				}
			}
			str[tail] = 0;
			return new String(str);
		}
		
			
	}
	public static void main(String args[])
	{
		System.out.println("Enter the string to remove dups from");
		String s = in.nextLine();
		System.out.println(remove(s));
	}
}
