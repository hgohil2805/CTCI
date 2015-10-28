package Code;

import java.util.Stack;

public class SortStack 
{
	Stack<Integer> base = new Stack<Integer>();
	Stack<Integer> copy = new Stack<Integer>();
	
	
	public Stack<Integer> sortStackMethod(Stack<Integer> input)
	{
		if(input.isEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			while(!input.isEmpty())
			{
				int current = input.pop();
				while(!copy.isEmpty() && current > copy.peek())
					{
						input.push(copy.pop());
					}
				copy.push(current);
			}
			
			return copy;
		}
	}
	
	public static void main(String[] args) 
	{
		SortStack obj = new SortStack();
		obj.base.push(1);
		obj.base.push(2);
		obj.base.push(3);
		obj.base.push(4);
		System.out.println(obj.sortStackMethod(obj.base).toString());
	}

}
