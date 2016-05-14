package Code;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class SerializeBST 
{
	Node root;
	SerializeBST()
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
	
	public void modifiedLevelPrint(Node root)
	{
		if(root == null)
			return;
		else 
		{
			Queue<Node> queue = new java.util.LinkedList<Node>();
			System.out.print(root.data + "\t");
			if(root.left != null)
			{
				queue.add(root.left);
				System.out.print(root.left.data + "\t");
			}
			
			if(root.right != null)
			{
				queue.add(root.right);
				System.out.print(root.right.data + "\t");
			}
			
			while(!queue.isEmpty())
			{
				Node first = queue.poll();
				Node second = queue.poll();
				
				System.out.print(first.left.data + "\t");
				System.out.print(second.right.data +"\t");
				System.out.print(first.right.data + "\t");
				System.out.print(second.left.data + "\t");
				
				if(first.left.left != null)
				{
					queue.add(first.left);
					queue.add(second.right);
					queue.add(first.right);
					queue.add(second.right);
				}
			}
		}
	}
	
	Queue<Node> order = new java.util.LinkedList<Node>();
	
	
	public void threadCreater(Node root)
	{
		addToQueue(root,order);
		createThreaded(root, order);
	}
	
	public void addToQueue(Node root, Queue<Node> order)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			if(root.left != null)
				addToQueue(root.left,order);
			order.add(root);
			if(root.right != null)
				addToQueue(root.right,order);
		}
	}
	
	public void createThreaded(Node root, Queue<Node> order)
	{
		if(root == null)
		{
			return;
		}

		if(root.left != null)
		{
			createThreaded(root.left,order);
		}
		order.poll();
		
		if(root.right != null)
			createThreaded(root.right,order);
		else
		{
			root.right = order.peek();
		}
	}
	
	ArrayList<Integer> output = new ArrayList<Integer>();
	public ArrayList<Integer> serialize(Node root)
	{
		if(root == null)
		{
			//output.add(-1);
			return null;
		}
		else
		{
			output.add(root.data);
			serialize(root.left);
			serialize(root.right);
		}
		return output;
	}
	
	public Node deSerialize(ArrayList<Integer> input)
	{
		Stack<Node> s = new Stack<Node>();
		int first = input.get(0);
		Node firstNode = new Node(first);
		Node root = firstNode;
		s.push(root);
		
		for(int i=1;i<input.size();i++)
		{
			Node temp = null;
			while(!s.isEmpty() && input.get(i) > s.peek().data)
			{
				temp = s.pop();
			}
			
			if(temp != null)
			{
				Node newNode = new Node(input.get(i));
				temp.right = newNode;
				s.push(newNode);
			}
			else
			{
				Node newNode = new Node(input.get(i));
				s.peek().left = newNode;
				s.push(newNode);
			}
			
		}
		return root;
		
		
	}


    public boolean isBalanced(Node root) {
        if(root == null)
            return true;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if(Math.abs(left) - Math.abs(right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int getHeight(Node root){
        if(root == null)
            return 0;

        return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
    }


    public boolean isSymmetric(Node root){
        if(root == null)
            return true;
        return isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(Node left, Node right){
        if(left == null && right == null)
            return true;

        if(left == null || right == null)
            return false;

        if(left.data != right.data)
            return false;

        if(!isSymmetricHelper(left.left, right.right))
            return false;

        if(!isSymmetricHelper(left.right, right.left))
            return false;

        return true;
    }


    public List<List<Integer>> levelOrderBottom(Node root) {
        Queue<Node> store = new LinkedList<Node>();
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();

		if(root == null)
            return returnList;

        Node placeHolder = new Node(-1);
        store.add(root);
        store.add(placeHolder);

        List<Integer> tempList = new ArrayList<Integer>();
        while(!store.isEmpty()){
            Node current = store.poll();
            if(current == placeHolder && !store.isEmpty()){
                returnList.add(0,tempList);
                tempList = new ArrayList<Integer>();
                store.add(placeHolder);
            }
            else if(current == placeHolder && store.isEmpty()){
                returnList.add(0,tempList);
                break;
            }
            else{
                tempList.add(current.data);
                if(current.left != null)
                    store.add(current.left);
                if(current.right != null)
                    store.add(current.right);
            }
        }
        return returnList;
    }

	public static void main(String[] args) 
	{
		SerializeBST obj = new SerializeBST();
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
		
		/*System.out.println("The sum of the left leaves is: ");
		obj.leftLeafSum(obj.root, obj.root);
		System.out.println(obj.sum);
		*/
		
		/*System.out.println("Printing out the modified level order traversel");
		obj.modifiedLevelPrint(obj.root);
		*/
		
		/*System.out.println("Creating the threaded tree");
		obj.threadCreater(obj.root);
		obj.inOrder(obj.root);
		*/
		
		/*System.out.println("Serializing the bst");
		//System.out.println(obj.serialize(obj.root).toString());
		ArrayList<Integer> temp = obj.serialize(obj.root);
		System.out.println("Return array is : "+temp.toString());
		System.out.println("Deserializing and printing");
		Node tempRoot = obj.deSerialize(temp);
		obj.inOrder(tempRoot);*/

        System.out.println("================LEVEL ORDER BOTTOM UP===========");
        List<List<Integer>> returnList = obj.levelOrderBottom(obj.root);
        for(List<Integer> n : returnList){
            System.out.println("Current level list : "+n.toString());
        }
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
		
		public String toString()
		{
			return ""+this.data;
		}
	}
}
