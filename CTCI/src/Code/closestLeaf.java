package Code;
import java.util.Queue;
import java.util.*;

public class closestLeaf 
{
	Node root;
	closestLeaf()
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
	
	
	public Node removePath(Node root, int prev, int k)
	{
		if(root == null)
		{
			return null;
		}
		else 
		{
			root.left = removePath(root.left,prev + 1, k);
			root.right = removePath(root.right, prev + 1, k);
		}
		
		if(prev < k && root.left == null && root.right == null)
			return null;
		
		return root;
	}
	
	public int minDistanceDown(Node root)
	{
		if(root == null)
			return 0;
		else
		{
			return 1 + Math.min(minDistanceDown(root.left),minDistanceDown(root.right));
		}
	}
	
	int min = 0;
	public int findClosest(Node root, ArrayList<Node> previousNodes ,int value, int index)
	{
		if(root == null)
			return Integer.MAX_VALUE;
		
		if(root.data == value)
		{
			for(int i=index;i >= 0 ;i--)
			{
				Node temp = previousNodes.get(i);
				min = Math.min(minDistanceDown(temp), minDistanceDown(root));
			}
			return min;
		}
		
		previousNodes.add(index, root);
		return Math.min(findClosest(root.left,previousNodes,value,index+1), findClosest(root.right,previousNodes,value,index+1));
	}
	
	
	public int toLeaf(Node root)
	{
		if(root == null)
		{
			return Integer.MAX_VALUE;
		}
		if(root.left == null  && root.right == null)
		{
			return 0;
		}
		else
		{
			return Math.min(toLeaf(root.left), toLeaf(root.right));
		}	
	}
	
	public int closestToLeaf(Node root, char k, ArrayList<Node> previous, int index)
	{
		if(root == null)
		{
			return Integer.MAX_VALUE;
		}
		System.out.println("Root value is:" +root.value);
		if(root.value == k)
		{
			int min = Integer.MAX_VALUE;
			System.out.println("Size of the list is: "+previous.size());
			for(int i = index - 1;i>=0;i--)
			{
			   min = Math.min(min, toLeaf(previous.get(index)));
			}
			return min;
		}
		previous.add(root);
		
		return Math.min(closestToLeaf(root.left,k,previous,index + 1), closestToLeaf(root.right,k,previous,index + 1));
		
	}
	
	public static void main(String[] args) 
	{
		closestLeaf obj = new closestLeaf();
		obj.insertCaller(10);
		obj.insertCaller(5);
		obj.insertCaller(15);
		obj.insertCaller(1);
		obj.insertCaller(6);
		obj.insertCaller(14);
		obj.insertCaller(16);
		
		//obj.inOrder(obj.root);
		
		
		/*System.out.println("Removing nodes on path less than k");
		obj.removePath(obj.root,1, 2);
		obj.inOrder(obj.root);
		
		
		System.out.println("Printing out the distance of node from leaf");
		System.out.println(obj.findClosest(obj.root, new ArrayList<Node>(), 15, 0));
		*/
		
		System.out.println("Printing the closest leaf distance");
		Node root = new Node('A');
	    root.left = new Node('B');
	    root.right              = new Node('C');
	    root.right.left        = new Node('E');
	    root.right.right       = new Node('F');
	    root.right.left.left  = new Node('G');
	    root.right.left.left.left  = new Node('I');
	    root.right.left.left.right = new Node('J');
	    root.right.right.right      = new Node('H');
	    root.right.right.right.left = new Node('K');
	    ArrayList<Node> list = new ArrayList<Node>();
	    System.out.println(obj.closestToLeaf(root, 'H', list, 0));
	    
	    System.out.println("Printing max");
	    System.out.println(Integer.MAX_VALUE);
	    System.out.println("Printing minimum");
	    System.out.println(Integer.MIN_VALUE);
	}
	
	private static class Node
	{
		int data;
		char value;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data = data;
		}
		
		public Node(char ch)
		{
			this.value = ch;
		}
	}
}
