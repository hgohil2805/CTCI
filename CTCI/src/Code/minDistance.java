package Code;
import java.util.*;
public class minDistance 
{
	static int minDistanceWord(String[] inputArray, String word1, String word2)
	{
		int minDistance = Integer.MAX_VALUE/2;
		int word1pos = -minDistance;
		int word2pos = -minDistance;
		System.out.println(word1);
		System.out.println(word2);
		for(int i=0;i< inputArray.length;i++)
		{
			if(inputArray[i].equals(word1))
			{
				word1pos = i;
				int currentDistance = Math.abs(word1pos - word2pos);
				if(currentDistance < minDistance)
				{
					minDistance = currentDistance;
				}
			}
			if(inputArray[i].equals(word2))
			{
				word2pos = i;
				int currentDistance = Math.abs(word1pos - word2pos);
				if(currentDistance < minDistance)
				{
					minDistance = currentDistance;
				}
			}
		}
		return minDistance;
	}
	public static void main(String[] args) 
	{
		String[] a = {"abc","xyz","pqr","a","b","c","d","e","f"};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first word");
		String word1 = in.next();
		System.out.println("Enter the second word");
		String word2 = in.next();
		System.out.println("Min distance " + minDistanceWord(a,word1,word2));
	}

}
