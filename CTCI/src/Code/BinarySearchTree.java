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

    public Node invertTree(Node root){
        if(root == null)
            return null;
        else{
            Node temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    }

    public boolean isSameTree(Node p, Node q){
        if(p == null && q == null){
            return true;
        }else if(p != null && q != null){
            if(p.data == q.data){
                return isSameTree(p.left, q.left) && isSameTree(q.right, p.right);
            }
        }else{
            return false;
        }

        return false;
    }



    public Node lowestAncestor(Node left, Node right, Node root){
        if(root == null)
            return null;
        if(root == left || root == right)
            return root;

        Node leftReturn = lowestAncestor(left, right, root.left);
        Node rightReturn = lowestAncestor(left, right, root.right);

        return (leftReturn != null && rightReturn != null ? root : leftReturn == null ? rightReturn : leftReturn);
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

        System.out.println();
        System.out.println("==============INVERT TREE==============");

		BinarySearchTree invertTree = new BinarySearchTree();
        invertTree.insert(4);
        invertTree.insert(2);
        invertTree.insert(7);
        invertTree.insert(1);
        invertTree.insert(3);
        invertTree.insert(6);
        invertTree.insert(9);

        System.out.println("Non inverted tree: ") ;
        invertTree.inOrder(invertTree.root);
        System.out.println();
        System.out.println("Inverted tree: ");
        Node invertedNode = invertTree.invertTree(invertTree.root);
        invertTree.inOrder(invertedNode);

        System.out.println();
        System.out.println("==============Compare two trees==============");

        BinarySearchTree p = new BinarySearchTree();
        p.insert(10);
        p.insert(5);
        p.insert(15);
        p.insert(3);
        p.insert(7);
        p.insert(12);
        p.insert(17);

        BinarySearchTree q = new BinarySearchTree();
        q.insert(10);
        q.insert(5);
        q.insert(15);
        q.insert(3);
        q.insert(7);
        q.insert(12);
        q.insert(17);

        System.out.println(p.isSameTree(p.root,q.root));


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


