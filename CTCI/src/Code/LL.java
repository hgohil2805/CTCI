package Code;

public class LL 
{
	private Node root;
	
	public void addElement(int n)
	{
		if(root == null)
		{
			Node m = new Node(n);
			root = m;
		}
		else
		{
			Node temp = root;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			Node m = new Node(n);
			temp.next = m;
		}
	}
	
	public void printLL(Node root)
	{
		if(root == null)
			return;
		else
			{
			System.out.print("\t" + root.data);
			printLL(root.next);
			}
	}
	
	public void removeDups(Node root)
	{
		if(root == null)
			return;
		Node current = root.next;
		Node prev = root;
		
		while(current != null)
		{
			Node runner = root;
			
			while(runner != current)
			{
				if(runner.data == current.data)
				{
					Node temp = current.next;
					prev.next = temp;
					current = temp;
					break;
				}
				runner = runner.next;
			}
			
			
			if(runner == current)
			{
				prev = current;
				current = current.next;
			}
		}
		System.out.println();
		System.out.println("After dups");
		printLL(this.root);	
	}
	
	public int nToLast(Node root, int n)
	{
		Node last = root;
		if(root == null)
			return -1;
		for(int i = 0 ; i < n ; i++)
		{
			last = last.next;
		}
		Node req = root;
		while(last.next != null)
		{
			
			last = last.next;
			req = req.next;
		}
		return req.next.data;
	}
	
	public void deleteParticularNode(Node root, Node given)
	{
		if(root == null)
			return;
		given.data = given.next.data;
		given.next = given.next.next;
		this.printLL(root);
	}

	/**
     * Remove Nth Node From End of List
     *
     * */
    public Node removeNthFromEnd(Node head, int n) {

        Node start = new Node(0);
        Node slow = start;
        Node fast = start;
        slow.next = head;

        for(int i = 1 ; i <= n + 1; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;

    }

	public static void main(String[] args)
	{
		LL obj = new LL();
		obj.addElement(1);
		obj.addElement(2);
		obj.addElement(3);
		obj.addElement(3);
		obj.addElement(4);
		obj.addElement(1);
		obj.printLL(obj.root);
		//obj.removeDups(obj.root);
		System.out.println();
		//System.out.println("Second print");
		//obj.printLL(obj.root);
		System.out.println();
		//System.out.println("The nth to last element is");
		//System.out.println(obj.nToLast(obj.root, 1));
		
		obj.deleteParticularNode(obj.root, obj.root);
	}
	
	private class Node
	{
		int data;
		Node next;
		
		public Node(int a, Node b)
		{
			this.data = a;
			this.next = b;
		}
		
		public Node(int a)
		{
			this.data = a;
		}
	}

}
