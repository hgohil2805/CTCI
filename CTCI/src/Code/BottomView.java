package Code;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;



public class BottomView 
{
	Node root;
	
	public void insertCaller(int value)
	{
		if(root == null)
		{
			Node newElement = new Node(value);
			root = newElement;
		}
		else
		{
			insert(root,value);
		}
	}
	public Node insert(Node current, int value)
	{
		if(current == null)
		{
			Node newElement = new Node(value);
			return newElement;
		}
		else if(current.data > value)
		{
			current.left = insert(current.left,value);
			return current;
		}
		else
		{
			current.right = insert(current.right,value);
			return current;
		}
		
	}
	
	public void bottomView(Node root)
	{
		Map<Integer, Node> tree = new TreeMap<Integer,Node>();
		Queue<Node> level = new java.util.LinkedList();
		
		level.add(root);
		int hd = 0;
		root.hd = hd;
		while(!level.isEmpty())
		{
			Node current = level.poll(); 
			hd = current.hd;
			
			tree.put(hd, current);
			if(current.left != null)
			{
				int hdnew = hd - 1;
				level.add(current.left);
				current.left.hd = hdnew;
			}
			if(current.right != null)
			{
				int newhd = hd + 1;
				level.add(current.right);
				current.right.hd = newhd;
			}
		}
		
		for(Integer n : tree.keySet())
		{
			Node work = tree.get(n);
			System.out.println(work.data);
		}
	}
	
	public static void main(String[] args) 
	{
		Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        BottomView obj = new BottomView();
        System.out.println("Bottom view of the given binary tree:");
        obj.bottomView(root);

	}
	
	private static class Node
	{
		Node left;
		Node right;
		int data;
		int hd;
		public Node(int n)
		{
			this.data  = n;
		}
	}

}
