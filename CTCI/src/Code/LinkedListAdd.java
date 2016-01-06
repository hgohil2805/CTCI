package Code;

public class LinkedListAdd {
	
	public LinkedListAdd()
	{
		System.out.println("Adding node");
	}
	
	public Node add(Node n1, Node n2, int carry)
	{
		Node result = new Node(carry);
		
		return null;
	}

	public static void main(String[] args) 
	{
		LinkedListAdd obj = new LinkedListAdd();
		Node first = new Node(1);
		Node two  = new Node(2);
		first.next = two;
		Node three = new Node(3);
		two.next = three;
		
		Node secondList = new Node(1);
		Node twoList = new Node(2);
		Node threeList = new Node(3);
		secondList.next = twoList;
		twoList.next = threeList;
		System.out.println("addition" + obj.add(first, secondList, 0));
	}
	
	static class Node
	{
		int data;
		Node next;
		public Node(int a)
		{
			this.data = a;
		}
	}

}
