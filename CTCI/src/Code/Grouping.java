package Code;
import java.util.ArrayList;
import java.util.HashMap;


public class Grouping
{
	public ArrayList<Integer> group(int[] input)
	{
		HashMap<Integer, Integer> count = new HashMap<Integer,Integer>();
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		for(int i = 0;i < input.length ; i++)
		{
			if(count.containsKey(input[i]))
			{
				int element = count.get(input[i]);
				count.remove(input[i]);
				count.put(input[i],element + 1);
			}
			else
			{
				count.put(input[i],1);
			}
		}
		for(int i = 0; i < input.length ; i++)
		{
			if(count.containsKey(input[i]))
			{
				int elementCount = count.get(input[i]);
				while(elementCount != 0)
				{
					returnList.add(input[i]);
					elementCount--;
				}
				
				count.remove(input[i]);
			}
			else
			{
				System.out.println("Element does not exist!");
			}
		}
		
		return returnList;
	}
	public static void main(String[] args) 
	{
		 int arr[] = {10, 5, 3, 10, 10, 4, 1, 3};
		 
		 Grouping obj = new Grouping();
		 System.out.println(obj.group(arr).toString());

	}

}
