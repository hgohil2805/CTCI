package Code;
import java.util.ArrayList;
import java.util.Collections;


public class PyTriplets 
{
	public ArrayList<Integer> triplets(int[] a)
	{
		ArrayList<Integer> tripList = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			a[i] = a[i] * a[i];
		}
		java.util.Arrays.sort(a);
		
		
		for(int i = a.length - 2;i> 0;i--)
		{
			int first = 0;
			int last = a.length - 1;
			
			while(first < last)
			{
			if(a[first] + a[last] == a[i])
			{
				tripList.add(a[first]);
				tripList.add(a[last]);
				
				tripList.add(a[i]);
				return tripList;
			}
			
			if(a[first] + a[last] < a[i])
			{
				first++;
			}
			else
			{
				last--;
			}
		}
		}
		return null;
	}
	public static void main(String[] args)
	{
		int arr[] = {3, 1, 4, 6, 5};
		PyTriplets obj = new PyTriplets();
		ArrayList<Integer> temp = obj.triplets(arr);
		if(temp == null)
		{
			System.out.println("No combinations exist");
		}
		else
		{
			System.out.println(temp.toString());
		}

	}

}
