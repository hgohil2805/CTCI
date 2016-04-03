package Code;
public class LinkedList 
{
	public Node head;
	public LinkedList()
	{
		System.out.println("LinkedList created");
	}
	
	public void addElement(int num)
	{
		if(head == null)
		{
			Node newElement = new Node(num);
			head = newElement;
		}
		else
		{
			addNode(this.head,num);
		}
	}
	
	public Node addNode(Node root, int num)
	{
		Node newElement = null;
		if(root == null)
		{
			newElement= new Node(num);
			return newElement;
		}
		else
		{
			root.next = addNode(root.next,num);
			return root;
		}
		
	}
	
	public void printLL(Node root)
	{
		if(root == null)
			return;
		else
		{
			System.out.println(root.data);
			printLL(root.next);
		}
	}
	
	public int getLength()
	{
		if(head == null)
			return 0;
		else
		{
			return length(head);
		}
	}
	
	public int length(Node root)
	{
		
		if(root == null)
			return 0;
		else
		{
			return 1+length(root.next);
		}
	}
	
	public int getSum()
	{
		return sum(head);
	}
	
	
	public int sum(Node root)
	{
		if(root == null)
			return 0;
		else
		{
			return root.data + sum(root.next);
		}
	}
	
	public void insertAfter(int first,Node current, int value)
	{
		if(current == null)
		{
			return;
		}
		else if(current.data == first)
		{
			Node temp = current.next;
			Node newElement = new Node(value);
			current.next = newElement;
			newElement.next = temp;
			return;
		}
		insertAfter(first, current.next,value);
	}
	
	public void reverseLL()
	{
		Node prev = null;
		Node temp = head;
		while(temp != null)
		{
			Node nextTemp = temp.next;
			temp.next = prev;
			prev = temp;
			temp = nextTemp;
		}
		head = prev;
	}
	
	public void reverseLLRecursive(Node root, Node prev)
	{
		if(root == null)
		{
			head = prev;
			return;
		}
		else
		{
			Node temp = root.next;
			root.next = prev;
			reverseLLRecursive(temp, root);
		}
	}

	public void removeNodeFromLL(Node removeNode){
        if(removeNode == null){
            return;
        }

        else{
            removeNode.data = removeNode.next.data;
            removeNode.next = removeNode.next.next;
        }
    }


	public static void main(String[] args) 
	{
		System.out.println("Create the LL");
		LinkedList obj = new LinkedList();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(3);
		obj.printLL(obj.head);
		System.out.println("Length of the LL is "+obj.getLength());
		System.out.println("Sum of the LL is "+obj.getSum());
		obj.insertAfter(2, obj.head, 4);
		System.out.println("After insertion ");
		obj.printLL(obj.head);
		//obj.normalPrint();
		System.out.println("Printing reverse LL");
		obj.reverseLL();
		obj.printLL(obj.head);
		
		System.out.println("Reversing LL again");
		obj.reverseLL();
		obj.printLL(obj.head);
		
		System.out.println("Reversing LL Recursively ");
		obj.reverseLLRecursive(obj.head,null);
		obj.printLL(obj.head);
		
		System.out.println("Reversing LL Recursively Again ");
		obj.reverseLLRecursive(obj.head,null);
		obj.printLL(obj.head);
	}
	private static class Node
	{
		int data;
		Node next;
		
		public Node(int num)
		{
			this.data = num;
		}
	}
}
