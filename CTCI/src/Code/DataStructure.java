package Code;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;


public class DataStructure 
{
	ArrayList<Integer> elements = new ArrayList<Integer>();
	HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	int size = elements.size() - 1;
	public void insert(int x)
	{
		if(hash.containsKey(x))
		{
			System.out.println("Element already exists!");
		}
		else
		{
			elements.add(x);
			hash.put(x, elements.indexOf(x));
		}
	}
	
	public void remove(int x)
	{
		if(hash.containsKey(x))
		{
			int index = hash.get(x);
			Collections.swap(elements, index,elements.size() - 1);
			elements.remove(elements.size() - 1);
		}
	}
	
	public int getRandom()
	{
		Random rand = new Random();
		int index = rand.nextInt(elements.size() );
		return elements.get(index);
	}
	public static void main(String[] args) 
	{
		DataStructure obj = new DataStructure();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		
		System.out.println(obj.elements.toString());
		
		obj.remove(2);
		
		System.out.println(obj.elements.toString());

		System.out.println(obj.getRandom());
	}

}
