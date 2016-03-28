package Code;

public class BinarySearchTree 
{
	public Node root;
	 public void insert(int data)
     {
		 Node newElement = new Node(data);
         if(root == null)
         {
        	root = newElement; 
         }
         
         else
         {
        	 insertHelper(root, newElement);
         }
     }
    
	 
     Node insertHelper(Node node, Node currentData)
     {
        if(node == null)
        {
        	return currentData;
        }
        else
        {
        	if(currentData.data <= node.data)
        	{
        		node.left = insertHelper(node.left, currentData);
        	}
        	else
        	{
        		node.right = insertHelper(node.right, currentData);
        	}
        }
        
        return node;
     }
     
     
     public void inOrder(Node root)
     {
    	 if(root == null)
    		 return;
    	 else
    	 {
    		 inOrder(root.left);
    		 System.out.print("\t" +root.data);
    		 inOrder(root.right);
    	 }
     }
     
     public void preOrder(Node root)
     {
    	 if(root == null)
    		 return;
    	 else
    	 {
    		 System.out.print("\t" + root.data);
    		 preOrder(root.left);
    		 preOrder(root.right);
    	 }
    		 
     }
     
     public void postOrder(Node root)
     {
    	 if(root == null)
    		 return;
    	 else
    	 {
    		 preOrder(root.left);
    		 preOrder(root.right);
    		 System.out.print("\t" + root.data);
    	 }
     }

	public int MaximumDepthOfTree(Node root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(MaximumDepthOfTree(root.left), MaximumDepthOfTree(root.right));

    }

	public static void main(String[] args) 
	{
		BinarySearchTree obj = new BinarySearchTree();
		obj.insert(6);
		obj.insert(7);
		obj.insert(5);
		obj.insert(2);
		obj.insert(6);
		obj.insert(9);
		obj.insert(5);
		obj.insert(11);
		obj.insert(4);
		System.out.println("In Order Traversal : ");
		obj.inOrder(obj.root);
		System.out.println();
		System.out.println("Pre Order Traversel : ");
		obj.preOrder(obj.root);
		System.out.println();
		System.out.println("Post Order Traversel : ");
		obj.postOrder(obj.root);

        System.out.println();
        System.out.println("==============MAXIMUM DEPTH OF BST==============");

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(1);

        System.out.println(tree.MaximumDepthOfTree(tree.root));
	}
	
	
	private static class Node
	{
		Node left;
		Node right;
		int data;
		
		Node()
		{
			System.out.println("New Empty Node created");
		}
		
		Node(int data)
		{
			
			this.data = data;
		}
	}
}


