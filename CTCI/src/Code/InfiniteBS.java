package Code;

public class InfiniteBS 
{
	public int searchElement(int [] a,int n)
	{
		int l =0;
		int h = 1;
		int val = 0;
		while (h < n && val < n)
		{
			l = h;
			h = 2 *h;
			val = a[h];
		}
		System.out.println("Value of h" +h);
		return BS(a,0,h,n);
		
	}
	
	public int BS(int[] a , int l, int r, int n)
	{
		if(r < l)
		{
			return -1; 
		}
		
		int mid = l + (r - l)/2;
		if(a[mid] == n)
		{
			return mid;
		}
		if(a[mid] < n)
		{
			return BS(a,mid + 1, r, n);
		}
		else
		{
			return BS(a,l,mid -1,n);
		}
		
	}
	public static void main(String args[])
	{
		int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		InfiniteBS obj = new InfiniteBS();
		System.out.println(obj.searchElement(arr, 130));
	}
}
