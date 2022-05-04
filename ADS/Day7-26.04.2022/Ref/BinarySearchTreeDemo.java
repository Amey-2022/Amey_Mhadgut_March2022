import java.util.Scanner;
class BinarySearchTree
{
	static class Node
	{
		int data;
		private Node right,left;
		
		public Node()
		{
			data = 0;
			left = null;
			right = null;
		}
		
		public Node(int val)
		{
			data = val;
			left = null;
			right = null;
		}
	}
	
	Node root;
	public BinarySearchTree()
	{
		root = null;
	}
	
	
	
	
	
	void add(int val)
	{
		Node newNode = new Node(val);
		if(root == null)
			root  = newNode;
		else
		{
			Node trav = root;
			while(true)
			{
				if(val < trav.data)
				{
					if(trav.left != null)
						trav = trav.left;
					else
					{
						trav.left = newNode;
						break;
					}
				}
				else
				{
					if(trav.right != null)
						trav = trav.right;
					else
					{
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}
	
	
	public void preorder(Node trav)
	{
		if(trav == null)
			return;
		
		System.out.print(trav.data+",");
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder()
	{
		System.out.print("PreOrder : ");
		preorder(root);
		System.out.println();
	}
	
	
	public void inorder(Node trav)
	{
		if(trav == null)
			return;
		
		inorder(trav.left);
		System.out.print(trav.data+",");
		inorder(trav.right);
	}
	
	public void inorder()
	{
		System.out.print("InOrder : ");
		inorder(root);
		System.out.println();
	}
	
	
	
	public void postorder(Node trav)
	{
		if(trav == null)
			return;
		
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data+",");
	}
	
	public void postorder()
	{
		System.out.print("PostOrder : ");
		postorder(root);
		System.out.println();
	}
}

class BinarySearchTreeDemo
{
	public static void main(String args[])
	{
		int choice,val;
		BinarySearchTree t = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //System.out.println("\t\t\t\t\tLINKED    LIST    OPERATIONS\n");
            System.out.println("\t\t0. Exit\t\t\t\t1. Add\t\t\t\t2.Preorder\n\t\t3. Inorder\t\t\t4. PostOrder");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();

			
			switch(choice)
			{
				case 1: //Display forward
					System.out.print("Enter the val : ");
					val = sc.nextInt();
					t.add(val);
					break;
					
					
				case 2: //preorder 
					t.preorder();

					break;
					
				case 3: //inorder 
					t.inorder();

					break;
					
				case 4: //postorder 
					t.postorder();

					break;
				
				
			}
		}
		while(choice != 0);
			
		
	}
}