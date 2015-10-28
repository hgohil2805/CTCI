package Code;
import java.util.*;
public class QueueUsingTwoStacks 
{
	Stack<Integer> base = new Stack<Integer>();
	Stack<Integer> copy = new Stack<Integer>();
	
	public void push(int n)
	{
		
			base.push(n);
			System.out.println(base.toString());
	}
	
	public int pop()
	{
		if(copy.isEmpty() && base.isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else if(copy.isEmpty())
		{
			while(!base.isEmpty())
			{
				copy.push(base.pop());
			}
			return copy.pop();
		}
		else
		{
			return copy.pop();
		}
	}
	
	public static void main(String args[])
	{
		QueueUsingTwoStacks obj = new QueueUsingTwoStacks();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		
	}
}
