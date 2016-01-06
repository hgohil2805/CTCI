package Code;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class randomElements 
{
	Random rand = new Random();
	public int getRandom(int low, int high)
	{
		int randomNum = rand.nextInt((high - low) + 1) + low;
		return randomNum;
	}
	public int[] getSubset(int[] a, int m)
	{
		int[] returnArray = new int[m];
		if(m > a.length)
		{
			return null;
		}
		for(int i = 0;i < m;i++)
		{
			int random = this.getRandom(i, a.length - 1);
			returnArray[i] = a[random];
			a[random] = a[i];
		}
		return returnArray;
	}
	public static void main(String args[])
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements required ");
		int n = in.nextInt();
		randomElements obj = new randomElements();
		System.out.println(Arrays.toString(obj.getSubset(a, n)));
		
	}
}
