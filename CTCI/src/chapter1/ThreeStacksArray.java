package chapter1;

public class ThreeStacksArray 
{
	static int StackSize = 300;
	static int array[] = new int[StackSize * 3];
	static int[] pointer = {0,0,0};
	
	
	public static void push(int a, int stackNumber)
	{
		int index = stackNumber * StackSize + pointer[stackNumber];
		if(index % 300 > 300)
		{
			System.out.println("Something is wrong, Size is greater than its supposed to be");
		}
		
		array[index] = a;
		pointer[stackNumber]++;
		
	}
	
	public static int pop(int stackNumber)
	{
		int index = stackNumber * StackSize + pointer[stackNumber];
		
		if(pointer[stackNumber] == stackNumber * StackSize)
		{
			System.out.println("The stack is empty");
			return 0;
		}
		
		int returnValue = array[index];
		pointer[stackNumber]--;
		return returnValue;
	}
	
	public static void printArray(int stackNumber)
	{
		if(pointer[stackNumber] == stackNumber * StackSize)
		{
			System.out.println("Nothing to print, stack is empty");
		}
		
		else
		{
			int baseIndex = stackNumber * StackSize;
			for(int i = 0 ; i < pointer[stackNumber]; i++)
			{
				System.out.println(array[baseIndex + i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		push(1,0);
		push(2,0);
		push(3,0);
		
		
		push(10,1);
		push(20,1);
		push(30,1);
		
		
		push(100,2);
		push(200,2);
		push(300,2);
		pop(2);
		printArray(2);
		
	}

}
