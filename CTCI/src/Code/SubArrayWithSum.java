package Code;

public class SubArrayWithSum
{
	public void subArray(int[] a, int k)
	{
		int start = 0;
		int curr_sum = a[0];
		int i = 0;
		for(i = 1; i < a.length; i++)
		{
			while(curr_sum > k && start <i - 1)
			{
				curr_sum = curr_sum - a[start];
				start++;
			}
			
			if(curr_sum == k)
			{
				System.out.format("Found the subarray between %s and %s" , start, i - 1);
			}
			
			if(i < a.length)
			{
				curr_sum = curr_sum + a[i];
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		SubArrayWithSum obj = new SubArrayWithSum();
		obj.subArray(arr, 23);

	}

}
