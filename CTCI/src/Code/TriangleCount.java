package Code;
import java.util.Arrays;


public class TriangleCount 
{
	public int noOfTriangle(int[] arr)
	{
		int count = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i ++)
		{
			int k = i+2;
			for(int j = i + 1; j < arr.length - 1;j ++)
			{
				while(k < arr.length && arr[k] < arr[i] + arr[j])
				{
					k++;
				}
				
				count += k - j - 1;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int arr[] =   {10, 21, 22, 100, 101, 200, 300};
		TriangleCount obj = new TriangleCount();
		System.out.println(obj.noOfTriangle(arr));
	}

}
