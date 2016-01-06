package Code;
import java.util.Queue;
import java.util.*;

public class LeftLeavesSum 
{
	Node root;
	LeftLeavesSum()
	{
		System.out.println("Binary Search Tree Created");
	}
	
	
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
	
	public void inOrder(Node current)
	{
		if(current == null)
		{
			return;
		}
		else
		{
			inOrder(current.left);
			System.out.println(current.data);
			inOrder(current.right);
		}
	}
	
	public void preOrder(Node current)
	{
		if(current == null)
		{
			return;
		}
		else
		{
			System.out.println(current.data);
			preOrder(current.left);
			preOrder(current.right);
		}
	}
	
	
	public void postOrder(Node current)
	{
		if(current == null)
		{
			return;
		}
		else
		{
			postOrder(current.left);
			postOrder(current.right);
			System.out.println(current.data);
		}
	}
	
	
	public void reverseInOrder(Node current)
	{
		if(current == null)
		{
			return;
		}
		else
		{
			reverseInOrder(current.right);
			System.out.print(current.data + "\t");
			reverseInOrder(current.left);
		}
	}
	
	
	public void levelOrderTraversel(Node current)
	{
		if(current == null)
		{
			return ;
		}
		else
		{
			Queue<Node> order = new java.util.LinkedList<Node>();
			order.add(current);
			while(!order.isEmpty())
			{
				Node workingNode = (Node) order.poll();
				System.out.println(workingNode.data);
				if(workingNode.left != null)
				{
					order.add(workingNode.left);
				}
				
				if(workingNode.right != null)
				{
					order.add(workingNode.right);
				}
			}
			
		}
	}
	
	public Node removeHalf(Node current)
	{
		if(current == null)
			return null;
		
		current.right = removeHalf(current.right);
		current.left = removeHalf(current.left);
		
		
		if(current.left == null && current.right != null)
		{
			return current.right;
		}
		else if(current.left != null && current.right == null)
		{
			return current.left;
		}
			
		return current;
			
	}
	
	static int count = 0;
	
	public void  KLargest(Node root, int k)
	{
		
		if(root == null || count > k)
		{
			return;
		}
		
		KLargest(root.right,k);
		if(++count == k)
		{
			System.out.println(root.data);
			return;
		}
		
		KLargest(root.left,k);
	}
	
	static int smallerCount = 0;
	public void kSmallest(Node root, int k)
	{
		if(root == null)
			return;
		kSmallest(root.left,k);
		
		if(++smallerCount == k)
		{
			System.out.println(root.data);
			return;
		}
		
		kSmallest(root.right,k);
	}
	
	
	static int sum = 0;
	public void leftLeafSum(Node root, Node prev)
	{
		
		if(root == null)
			return;
		
		System.out.println("Current node is: "+root.data);
		leftLeafSum(root.left,root);
				
		if(root == prev.left && root.left == null && root.right == null)
		{
			sum += root.data;
			System.out.println("Adding to the list :"+root.data);
		}	
		
		leftLeafSum(root.right,root);
		
	}
	public static void main(String[] args) 
	{
		LeftLeavesSum obj = new LeftLeavesSum();
		obj.insertCaller(10);
		obj.insertCaller(5);
		obj.insertCaller(15);
		obj.insertCaller(1);
		obj.insertCaller(6);
		obj.insertCaller(14);
		obj.insertCaller(16);
		
		obj.inOrder(obj.root);
		
		/*System.out.println("Removing half nodes");
		obj.removeHalf(obj.root);
		System.out.println("Printing after removal");
		obj.inOrder(obj.root);
		*/
		
		/*
		System.out.println("Finding the kLargest element (4)");
		obj.KLargest(obj.root, 3);
		
		System.out.println("Finding the KSmallest Element");
		obj.kSmallest(obj.root, 3);
		
		*/
		
		System.out.println("The sum of the left leaves is: ");
		obj.leftLeafSum(obj.root, obj.root);
		System.out.println(obj.sum);
	}
	
	private static class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data = data;
		}
	}
}
