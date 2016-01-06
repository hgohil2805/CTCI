package Code;
import java.util.HashMap;


public class KDistanceDuplicate 
{
	public boolean duplicates(int[] a)
	{
		HashMap<Integer,Integer> elements = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length;i++)
		{
			if(elements.containsKey(a[i]))
			{
				int lastIndex = elements.get(a[i]);
				if(i - lastIndex <= 3)
				{
					return true;
				}
				else
				{
					elements.put(a[i], i);
				}
			}
			else
			{
				elements.put(a[i], i);
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 1, 4, 5};
		KDistanceDuplicate obj = new KDistanceDuplicate();
		System.out.println(obj.duplicates(arr));

	}

}
