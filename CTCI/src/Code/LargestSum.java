package Code;

public class LargestSum 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		int first = 0;
		int second = 0;
		for(int i=0;i< a.length;i++)
		{
			if(a[i] > first)
			{
				second = first;
				first = a[i];
			}
			else if(a[i] > second)
			{
				second = a[i];
			}
		}
		System.out.println("The max sum is: " +(first +second));

	}

}
