import java.util.Scanner;

class BinarySearchTreeRec{
		
		static class Node{
			int data;
			Node left,right;
		
	
			public Node(){
				 data=0;
				 left=null;
				 right=null;
			}
			
			public Node(int val){
				 data=val;
				 left=null;
				 right=null;
			}
		}
		
		Node root;
		public BinarySearchTreeRec(){
			root=null;
		}
		
		
		public Node createNode(Node newNode,int val){
			if(newNode==null){
				newNode=new Node(val);
				return newNode;
			}
			if(val<newNode.data){
				newNode.left=createNode(newNode.left,val);
			}
			else{
				newNode.right=createNode(newNode.right,val);
			}
			return newNode;
			
		}
		
		public void createNode(int val){
			root=createNode(root,val);
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
	
	public Node deleteNode(Node delete, int key){
		
		if(delete == null)
		{
			
			return delete;
		}
		if(key < delete.data)
			delete.left = deleteNode(delete.left,key);
		else if(key > delete.data)
			delete.right = deleteNode(delete.right,key);
		else{
			if(delete.left == null)
				return delete.right;
			else if(delete.right == null)
				return delete.left;
			
			delete.data = minValue(delete.right);
			delete.right = deleteNode(delete.right,delete.data);
		}
		return delete;
	}
	
	public void deleteBSTNode(int key){
		root=deleteNode(root,key);
		System.out.print("Inorder : ");
		inorder();
	}
	
	public int maxValue(Node trav){
		if(trav == null)
			return 0;
		else{
			while(trav.right!=null)
				trav=trav.right;
				return trav.data;
		}
	}
	
	public int minValue(Node trav){
		if(trav == null)
			return 0;
		else{
			while(trav.left!=null)
				trav=trav.left;
				return trav.data;
		}
	}
	
	



}


class BinarySearchTreeRecDemo{
				public static void main(String... args){
					int choice=0,val=0;
						BinarySearchTreeRec b=new BinarySearchTreeRec();
						Scanner sc=new Scanner(System.in);
						
					do{
				System.out.println("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \n");
				System.out.println("\t0.Exit\n\t1.Create\t\t\t2.Inorder\t\t\t3.preorder\t\t\t4.postorder\n\t5.Delete");
				System.out.println("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3  \n");
				System.out.print("Enter Choice: ");
				choice=sc.nextInt();	
					
					
					switch(choice){
						
						case 1:	System.out.print("Enter data : ");
								val=sc.nextInt();
								b.createNode(val);
								break;
						case 2:	System.out.print("Inorder : ");
								b.inorder();
								System.out.println();
								break;
						case 3: System.out.print("Preorder : ");
								b.preorder();
								System.out.println();
								break;
						case 4: System.out.print("Postorder : ");
								b.postorder();
								System.out.println();
								break;
						case 5: System.out.print("Enter key : ");
								val=sc.nextInt();
								b.deleteBSTNode(val);
								System.out.println();
								break;
						default:System.out.println("Invalid Number");
								break;
					}
						
				}while(choice!=0);
			}
			
}