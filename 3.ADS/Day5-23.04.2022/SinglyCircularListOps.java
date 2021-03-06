import java.util.*;

class SinglyCircularList{

	//Node class
	static class Node{
		//Node class fields
		int data;
		Node next;
		Node prev;
	
		public Node(){
			data=0;
			next=null;
		}
		
		public Node(int val){
			data=val;
			next=null;
		}
	}
	
		Node head;
		Node tail;
		Node trav;
		Node temp;
		public SinglyCircularList(){
			head=null;
			tail=null;
			trav=null;
			temp=null;
		}	
		
		public boolean isEmpty(){
			return head==null;
		}
		
		void addNode(int val){
			Node newNode=new Node(val);
			if(isEmpty()){
				head=newNode;
				tail=newNode;
				newNode.next=head;	
			}else{
				tail.next=newNode;
				tail=newNode;
				newNode.next=head;	
			}
			display();
			System.out.println();
		}
	
		void display(){
			System.out.println("List:\2\2\2 ");
			if(isEmpty())
			System.out.println("List is empty");
			else{
				trav=head;
				do{
				  System.out.print(trav.data+" ");
				  trav=trav.next;
				}while(trav!=head);
			}
		}
		
		void addLast(int val){
			Node newNode=new Node(val);
			if(isEmpty()){
				head=newNode;
				newNode.next=head;
			}else{
				trav=head;
				while(trav.next!=head){
					trav=trav.next;
				}
				newNode.next=head;
				trav.next=newNode;
			}
		}
		
		void addFirst(int val){
			Node newNode=new Node(val);
			if(isEmpty()){
				head=newNode;
				newNode.next=head;
			}else{
				trav=head;
				while(trav.next!=head){
					trav=trav.next;
				}
				trav.next=newNode;
				newNode.next=head;
				head=newNode;	
			}
		}
		
		void addAtPos(int val,int pos){
			Node newNode=new Node(val);
			if(isEmpty() || pos<=1)
				addFirst(val);
			else{
				trav=head;
				for(int i=1;i<pos-1;i++){
					
					if(trav.next==head)
						break;
					trav=trav.next;
				}
				newNode.next=trav.next;
				trav.next=newNode;
			}
		}
		
		void deleteFirst(){
			trav=head;
			if(isEmpty())
				throw new RuntimeException("List is empty");
			if(head.next==head)
				head=null;
			else{
				while(trav.next!=head){	
					trav=trav.next;
				}
				trav.next=head.next;
				head=head.next;
			}	
		}
		
		void deleteLast(){
			trav=head;
			if(isEmpty())
				throw new RuntimeException("List is empty");
			if(head.next==head)
				head=null;
			else{
				while(trav.next!=null){
					temp=trav;
					trav=trav.next;
				}
				temp.next=head;
			}
			
		}
		
		void deleteAtPos(int pos){
			
			if(isEmpty())
				throw new RuntimeException("List is empty");
			if(pos==1){
				deleteFirst();
				return;
			}
			
			else{
				trav=head;
				for(int i=1;i<pos;i++){
				if(trav.next==head)
					throw new RuntimeException("Invalid position");
				temp=trav;
				trav=trav.next;
				}
			}
			temp.next=trav.next;
			
		}
		
		void delAll(){
			head.next=null;
			head=null;
		}
		
		void length(){
			trav=head;
			int count=0;
			if(head==null)
				display();
			while(trav!=null){
				count++;
				trav=trav.next;
			}
			System.out.println("The elements present in Linked List : "+count);
		}
		
		void searchNode(int val){
			int flag=0;
			int count=0;
			trav=head;
			do{
				count++;
				if(trav.data==val){
					flag=1;
					break;
				}
				trav=trav.next;
			}while(trav !=head);	
			if(flag==1)
				System.out.println("The Searching element "+val+" is found at position : "+count);
			else if(flag==0)
				System.out.println("The Searching element "+val+" is not found in list");
		}
		
		void deleteByValue(int val){
			int flag=0;
			int count=0;
			trav=head;
			//void delete(){
			do{
				count++;
				if(trav.data==val){
					flag=1;
					break;
				}
				trav=trav.next;
			}while(trav !=head);
			
			if(flag==1)
				deleteAtPos(count);
			else if (flag==0)
				System.out.println("The Searching element "+val+" is not found in list");
		}
		
}	
		
		
class SinglyCircularListOps{
		public static void main(String[] args){
			int choice=0, val,pos;
			SinglyCircularList list=new SinglyCircularList();
			Scanner sc=new Scanner(System.in);
			
			do{
				System.out.println("\5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \n");
				System.out.println("\t0.Exit \t\t\t1.Add Node \t\t2.Display \t\t3.Add First \n\t4.Add Last  \t\t5.Add at Position \t6.Delete First  \t7.Delete Last \n\t8.Delete At Position  \t9.Delete All \t\t10.Length of list \t11.Search Value  \n\t12.Delete by value \t13. \t14.Reverse the List \t\t15.Sort\n");
				System.out.println("\5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \5 \n");
				System.out.print("Enter Choice: ");
				choice=sc.nextInt();
				
				switch(choice){
					
					case 1://Add Node
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addNode(val);
							System.out.println();
							break;
					case 2: //display
							list.display();
							System.out.println();
							break;
					
					case 3: //Add First
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addFirst(val);
							System.out.println();
							break;
					case 4: //Add Last
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addLast(val);
							System.out.println();
							break;
					case 5: //Add At Specific Position
							System.out.println("Enter the value: ");
							val=sc.nextInt();
							System.out.print("Enter the  position to add value: ");
							pos=sc.nextInt();
							list.addAtPos(val,pos);
							System.out.println();
							break;
					case 6://Delete First
							try{
							list.deleteFirst();
							}catch(Exception e){
								System.out.println(e.getMessage());
							}
							System.out.println();
							break;		
					case 7://Delete Last
							try{
							list.deleteLast();
							}catch(Exception e){
								System.out.println(e.getMessage());
							}
							System.out.println();
							break;
					case 8://Delete At Specific Position
							System.out.print("Enter the position of element : ");
							pos = sc.nextInt();
							try{
								list.deleteAtPos(pos);
							}catch(Exception e){
								System.out.println(e.getMessage());
							}
							System.out.println();
							break;
					case 9://Delete All
							list.delAll();
							System.out.println();
							break;
					case 10://Length of list
							list.length();
							System.out.println();
							break;
					case 11://search element
							System.out.println("Enter the element to search: ");
							val=sc.nextInt();
							list.searchNode(val);
							System.out.println();
							break;
					case 12://Delete by value
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							System.out.println();
							list.deleteByValue(val); 
							System.out.println();
							break;
				}
			}while(choice!=0);
		}
}
						
			