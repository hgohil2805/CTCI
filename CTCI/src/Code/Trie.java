package Code;
import java.util.ArrayList;


public class Trie 
{
	Node head = new Node();
	
	public Trie()
	{
		System.out.println("Trie created");
	}
	
	public void insert(String s, Node head)
	{
		Node temp = head;		
		for(int i=0;i < s.length();i++)
		{
			System.out.println("Current node is" +temp.data);
			//System.out.println("Current nodes data is : "+temp.next.toString());
			char ch = s.charAt(i);
			System.out.println("Current character is: "+ch);
			if(temp.next.size() > 0)
			{
				System.out.println(temp.next.toString());
			for(Node n : temp.next)
			{
				if(n.data == ch)
				{
					temp = n;
					continue;
				}
			}
			Node newNode = new Node(ch);
			temp.next.add(newNode);
			temp = newNode;
			}
			else
			{
				Node newNode = new Node(ch);
				temp.next.add(newNode);
				temp = newNode;
			}
		}
		completePrint(this.head, 1);
	}
	
	public void completePrint(Node root, int level)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.println(root.data+ "\t" + level);
			for(Node n : root.next)
			{
				completePrint(n, level +1);
			}
		}
	}
	
	
	public boolean exists(String s)
	{
		System.out.println("SEARCHING!");
		Node temp = head;
		for(int i=0;i < s.length();i++)
		{
			System.out.println("The value if i is: "+i);
			System.out.println("Current Node is: "+ temp.data);
			System.out.println("Current Node's data  is: "+ temp.next.toString());
			char ch = s.charAt(i);
			System.out.println("Current char is: "+ch);
			if(temp.next != null)
			{
				System.out.println("Inside if loop");
				for(Node n : temp.next)
				{
					System.out.println("Inside for loop");
					if(n.data == ch)
					{
						System.out.println("Inside second if loop");
						System.out.println("N data "+n.data);
						temp = n;
						continue;
					}
				}
			}
		}
		return true;
		
	}
	
	private static class Node
	{
		ArrayList<Node> next = new ArrayList<Node>(); 	
		char data;
		Node(char ch)
		{
			this.data = ch;
		}
		
		public String toString()
		{
			return ""+this.data;
		}
		
		public Node()
		{
			
		}
		
		
	}
	public static void main(String[] args) 
	{
		Trie obj = new Trie();
		obj.insert("abcd",obj.head);
		System.out.println(obj.exists("abcd"));

	}

}
