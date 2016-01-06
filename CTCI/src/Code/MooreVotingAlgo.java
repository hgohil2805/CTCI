package Code;

public class MooreVotingAlgo 
{
	public int value(int[] arr)
	{
		int count = 1;
		int index = 0;
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i] == arr[index])
			{
				count++;
			}
			else
			{
				count--;
				if(count == 0)
				{
					index = i;
					count = 1;
				}
			}
		}
		/*
		if(isValid(arr,arr[index]))
		{
			return arr[index];
		}
		else
		{
			return -1;
		}
		*/
		return arr[index];
	}
	
	public boolean isValid(int[] a, int value)
	{
		int count = 0;
		for(int i = 0; i < a.length ; i++)
		{
			if(value == a[i])
			{
				count++;
			}
		}
		
		return count > a.length/2 ;
	}
	public static void main(String[] args)
	{
		MooreVotingAlgo obj = new MooreVotingAlgo();
		int[]  a = {2, 2, 3, 5, 2, 6};
		
		System.out.println(obj.value(a));

	}

}
