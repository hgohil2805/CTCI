package Code;
import java.util.Scanner;


public class NoOfZero {
	
	public static int zeros(int num)
	{
		int count = 0;
		for(int i=5;num/i>0;i *=5)
		{
			count += num/i;
		}
		return count;
	}
	
	public static int max(int a, int b)
	{
		int c = a - b;
		int k = c >> 31 & 0x1;
		int max = a - k * c;
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		System.out.println("Number of zeros are \n" +zeros(num));
		System.out.println("Enter the first number");
		int a = in.nextInt();
		System.out.println("Enter the second number");
		int b = in.nextInt();
		System.out.println("Max of two numbers \n");
		System.out.println(max(a,b));

	}

}
