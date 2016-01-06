package Code;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;


public class LimeTestTest 
{
	public static void remove_numbers(Integer v[], Integer d)
	{
		int count = 0;
		int prev = v[0];
		for(int i=1;i < v.length;i++)
		{
			if(i + 1 <= v.length)
			{
				int difference = Math.abs(prev - v[i]);
				if(difference < d)
				{
					count ++;
					continue;
				}
				else
				{
					prev = v[i];
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		Integer[] inputArray = {1,5,6,7,10,14};
		System.out.println(Arrays.toString(inputArray));
		remove_numbers(inputArray, 4);
		
		Integer[] secondArray = {1,6,11,16,21};
		System.out.println(Arrays.toString(secondArray));
		remove_numbers(secondArray, 4);
		
		Integer[] thirdArray = {1,2,6,11,16,21};
		System.out.println(Arrays.toString(thirdArray));
		remove_numbers(thirdArray, 4);
		
		Integer[] fourthArray = {1,6,11,16,19};
		System.out.println(Arrays.toString(fourthArray));
		remove_numbers(fourthArray, 4);
		
		Integer[] fifthArray = {1,3,5,7,8,9};
		System.out.println(Arrays.toString(fifthArray));
		remove_numbers(fifthArray, 4);
	}

}
