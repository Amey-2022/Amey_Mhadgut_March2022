import java.util.Scanner;

class BinarySearchTree{

		static class Node{
			
			int data;
			private Node left,right;
			
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
		public BinarySearchTree(){
			root=null;
		}
		
		
		
		void addNode(int val){
			Node newNode=new Node(val);
			if(root==null)
				root=newNode;
			
			else{
				Node trav=root;
				while(true){
					
					if(val<trav.data){
						if(trav.left!=null)
							trav=trav.left;
						else{
							trav.left=newNode;
							break;
						}
					}
					
					else{
						
							if(trav.right!=null)
								trav=trav.right;
							else{
								trav.right=newNode;
								break;
							}
						
					}	
				}
			}
		}
		
		public void preOrder(Node trav){
			
			if(trav==null)
				return;
			
				System.out.print(trav.data+" ");
				preOrder(trav.left);
				preOrder(trav.right);
			
		}
		
		public void preOrder(){
			System.out.println("PreOrder :");
			preOrder(root);
		}
		
		public void inOrder(Node trav){
			
			if(trav==null)
				return;
			
				inOrder(trav.left);
				System.out.print(trav.data+" ");
				inOrder(trav.right);
		}
		
		public void inOrder(){
			System.out.println("InOrder :");
			inOrder(root);
		}
		
		public void postOrder(Node trav){
			
			if(trav==null)
				return;
			
				postOrder(trav.left);
				postOrder(trav.right);
				System.out.print(trav.data+" ");
			
		}
		
		public void postOrder(){
			System.out.println("postOrder :");
			postOrder(root);
		}
		
		


}



class BinarySearchTreeDemo{
				public static void main(String[] args){
					int choice,val;
					BinarySearchTree t=new BinarySearchTree();
					Scanner sc=new Scanner(System.in);
					
					
					
					do{
						
						System.out.println("\5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 ");
						System.out.println("\t\t\t\t\t\tBINARY SEARCH TREE\n");
						System.out.println("\t0.Exit \t\t1.Add Node \t\t2.PreOrder \t\t3.InOrder \t4.PostOrder");
						System.out.println("\5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \n");
						System.out.print("Enter Choice: ");
						choice=sc.nextInt();
						
						switch(choice){
							
							case 1://add node
									System.out.print("Enter value to add tree structre: ");
									val=sc.nextInt();
									t.addNode(val);
									System.out.println();
									break;
									
							case 2: //PreOrder
									t.preOrder();
									System.out.println();
									break;
									
							case 3: //InOrder
									t.inOrder();
									System.out.println();
									break;
									
							case 4: //PostOrder
									t.postOrder();
									System.out.println();
									break;
						
						}
					
					}while(choice!=0);
				}
}