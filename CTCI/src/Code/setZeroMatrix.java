package Code;

import java.util.Arrays;
import java.util.Scanner;

public class setZeroMatrix 
{
	static Scanner in = new Scanner(System.in);
	
	public static int[][] replace(int[][] a)
	{
		int[] row = new int[a.length];
		int[] col = new int[a[0].length];
		for(int i = 0 ; i < a.length ; i ++)
		{
			for(int j = 0 ; j < a[0].length; j++)
			{
				if(a[i][j] == 1)
				{
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for(int i = 0 ; i < a.length; i++)
		{
			for(int j = 0 ; j < a[i].length; j++)
			{
				if(row[i] == 1 || col[j] == 1)
				{
					a[i][j] = 0;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int [][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
		System.out.println(Arrays.deepToString(replace(d)));

	}

}
