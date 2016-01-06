package Code;

public class ModifiedBinarySearch 
{
	public int index(int[] a, int l, int r,int x)
	{
		if(r >= l)
		{
			int mid = (l + r)/2;
			
			if ((a[mid]) == x)
					return mid;
			else if(a[mid +1] == x)
				return mid + 1;
			else if(a[mid - 1] == x)
				return mid - 1;
			
			if(a[mid ] > x)
				return index(a,mid - 2, r,x);
			else
				return index(a, mid + 2, r, x);
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int arr[] = {3, 2, 10, 4, 40};
		ModifiedBinarySearch obj = new ModifiedBinarySearch();
		System.out.println(obj.index(arr, 0, arr.length - 1, 4));

	}

}
