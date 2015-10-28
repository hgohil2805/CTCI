package Code;

public class StackMin 
{
	public Node[] nodeStack = new Node[10];
	public int stackPointer = -1;
	
	public  void push (int n)
	{
		if(stackPointer == 9)
		{
			System.out.println("Stack is full");
			return;
		}
		else
		{
			if(stackPointer == -1)
			{
				Node newElement = new Node(n,n);
				nodeStack[++stackPointer] = newElement;
			}
			else
			{
				int min = Math.min(n, peek());
				Node newElement = new Node(n, min);
				nodeStack[++stackPointer] = newElement;
			}
		}
	}
	
	public Node pop()
	{
		if(stackPointer == -1)
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			return nodeStack[stackPointer--];
		}
	}
	
	public int peek()
	{
		System.out.println("Stack pointer is: "+stackPointer);
		if(stackPointer == -1)
		{
			return -1;
		}
		else
		{
			return nodeStack[stackPointer].min;
		}
	}
	public static void main(String[] args)
	{
		StackMin obj = new StackMin();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.push(9);
		obj.push(10);
		obj.push(11);
		System.out.println("Minimum is:"+obj.pop().min);
		System.out.println(obj.pop().data);
		System.out.println(obj.pop().data);
		

	}
	
	
	private class Node
	{
		int data;
		int min;
		
		public Node(int data, int min)
		{
			this.data = data;
			this.min = min;
		}
		
	}
}
