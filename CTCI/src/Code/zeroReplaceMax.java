package Code;

public class zeroReplaceMax 
{

	public int index(int[] a)
	{
		int prev_zero = 0 ;
		int prev_prev_zero = 0;
		int returnIndex = 0;
		int max = 0;	
		for(int i = 0;i < a.length; i++)
		{
			if(a[i] == 0)
			{
				int currentDistance = i - prev_prev_zero;
				if(currentDistance > max)
				{
					max = currentDistance;
					returnIndex = i;
				}
				prev_prev_zero = prev_zero;
				prev_zero = i;
			}
			
		}
		
		return returnIndex;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1, 1, 1, 1, 0};
		zeroReplaceMax obj = new zeroReplaceMax();
		
		System.out.println(obj.index(arr));
	}

}
