import java.util.*;

class DoublyList{

	//Node class
	static class Node{
		//Node class fields
		int data;
		Node next;
		Node prev;
	
		public Node(){
			data=0;
			next=null;
			prev=null;
		}
		
		public Node(int val){
			data=val;
			next=null;
			prev=null;
		}
	}
	
		Node head;
		Node tail;
		Node trav;
		Node temp;
		public DoublyList(){
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
				head=tail=newNode;
				
			}else{
				tail.next=newNode;
				newNode.prev=tail;
				tail=newNode;
			}
		}
		
		void displayForward(){
			System.out.println();
			System.out.println("Forward list:");
			if(isEmpty())
				System.out.println("List is empty!!");
			
			trav=head;
			while(trav!=null){
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
			System.out.println();
		}
			
		void displayReverse(){
			System.out.println();
			System.out.println("Reverse list:");
			if(isEmpty())
				System.out.println("List is empty!!");
			
			else{
				trav=head;
				while(trav.next!=null){
					trav=trav.next;
				}
				while(trav!=null){
					System.out.print(trav.data+" ");
					trav=trav.prev;
				}
			}
			System.out.println();			
		}
		
		void addLast(int val){
			Node newNode=new Node(val);
			if(isEmpty())
				head=newNode;
			else{
				trav=head;
				while(trav.next!=null){
					trav=trav.next;
				}
				trav.next=newNode;
				newNode.prev=trav;
			}
		}
		
		void addFirst(int val){
			Node newNode=new Node(val);
			if(isEmpty())
				head=newNode;
			else{
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}	
		}
		
		void addAtPos(int val,int pos){
			if(isEmpty() || pos<=1)
				addFirst(val);
			else{
				Node newNode=new Node(val);
				temp=trav=head;
				for(int i=1;i<pos-1;i++){
					if(trav.next==null)
						break;
					trav=trav.next;
				}
				temp=trav.next;
				newNode.next=temp;
				newNode.prev=trav;
				trav.next=newNode;
				if(temp!=null)
					temp.prev=newNode;		
			}
		}
		
		void deleteFirst(){
			if(isEmpty())
				throw new RuntimeException("List is Empty!!!");
			
			else if(head.next==null)
				head=null;
			else{
			head=head.next;
			head.prev=null;
			}
			System.out.println();
			displayForward();
		}
			
		void deleteLast(){
			trav=head;
			if(head==null)
				throw new RuntimeException("List is empty");
			if(trav.next==null)
				head=null;
			
			while(trav.next!=null){
				temp=trav;
				trav=trav.next;
			}
			tail=temp;
			temp.next=null;
			System.out.println();
			displayForward();
		}
		
		void deleteAtPos(int pos){
			if(pos==1)
				deleteFirst();
			
			else if(head==null || pos<1)
				throw new RuntimeException("List is Empty or Invalid Position!!!");
			else{
			trav=head;
			for(int i=1;i<pos;i++){
				
				if(trav.next==null)
					throw new RuntimeException("Invalid Position");
				trav=trav.next;
			}
			trav.prev.next=trav.next;
			if(trav.prev.next==null)
				tail=trav.prev;
			if(trav.next!=null)
			trav.next.prev=trav.prev;
			}
			System.out.println();
			displayForward();
		}
		
		void delAll(){
			head=null;
		System.out.println();
		displayForward();
		}
		
		void searchNode(int val){
			 trav=head;
			if(head==null)
				displayForward();
			int count=0;int flag=0;
			while(trav !=null){
				count++;
				if(trav.data==val){
					flag=1;
					break;
				}
				trav=trav.next;
			}
			if(flag==1)
				System.out.println("The Searching element "+val+" is found at position : "+count);
			else if(flag==0)
				System.out.println("The Searching element "+val+" is not found in list");
		}	
		
		void length(){
			 trav=head;
			int count=0;
			if(head==null)
				displayForward();
			while(trav!=null){
				count++;
				trav=trav.next;
			}
			System.out.println("The elements present in Linked List : "+count);
		}
		//not works for reverse display
		void reverse(){	
			System.out.println("Reverse List:");
			if(isEmpty())
				System.out.println("List is empty!!");
			else{
				Node oldhead=head;
				head=null;
				while (oldhead != null) {
					temp = oldhead;
					oldhead = oldhead.next;
					temp.next = head;
					head = temp;
				}
			}
			
			displayForward();
		}
}
 

class DoublyListOps{
				public static void main(String[] args){
					int choice=0,val=0,pos=0;
					
					DoublyList list=new DoublyList();
					Scanner sc=new Scanner(System.in);
	
				do{
				System.out.println("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \n");
				System.out.println("\t0.Exit \t\t\t1.Add Node \t\t2.Display Forward \t\t3.Display Reverse \n\t4.Add First \t\t5.Add Last \t\t6.Add Position  \t\t7.Delete First \n\t8.Delete Last  \t\t9.Delete At Position \t10.Delete All \t\t\t11.Delete by value  \n\t12.Search Value \t13.Length of list \t14.Reverse the List \t\t15.Sort\n");
				System.out.println("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3  \n");
				System.out.print("Enter Choice: ");
				choice=sc.nextInt();
						
						
					switch(choice){
					
					
					case 1://Add Node
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addNode(val);
							System.out.println();
							break;
					case 2: //display forward
							list.displayForward();
							System.out.println();
							break;
					case 3: //display reverse
							list.displayReverse();
							System.out.println();
							break;
					
					case 4: //Add First
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addFirst(val);
							System.out.println();
							break;
					case 5: //Add Last
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addLast(val);
							System.out.println();
							break;
					case 6: //Add At Specific Position
							System.out.println("Enter the value: ");
							val=sc.nextInt();
							System.out.print("Enter the  position to add value: ");
							pos=sc.nextInt();
							list.addAtPos(val,pos);
							System.out.println();
							break;
					case 7://Delete First
							try{
								list.deleteFirst();
							}catch(Exception e){
								System.out.println(e.getMessage());
							}
							System.out.println();
							break;
					case 8://Delete Last
							try{
							list.deleteLast();
							}catch(Exception e){
								System.out.println(e.getMessage());
							}
							System.out.println();
							break;
					case 9://Delete At Specific Position
							System.out.print("Enter the position of element : ");
							pos = sc.nextInt();
							try{
								list.deleteAtPos(pos);
							}catch(Exception e){
								System.out.println(e.getMessage());
							}
							System.out.println();
							break;
					case 10://Delete All
							list.delAll();
							System.out.println();
							break;
					
				/*	case 11://Delete by value
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							System.out.println();
							list.deleteByValue(val); 
							System.out.println();
							break;*/
					case 12://Search Node
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.searchNode(val);
							System.out.println();
							break;
					case 13://Length of list
							list.length();
							System.out.println();
							break;
					case 14://Reverse the list
							list.reverse();
							System.out.println();
							System.out.println();
							break;
					//case 15://Sort
					default:System.out.println("Invalid input!!");
							System.out.println();
							break;
							
							
					
					}
				}
			while(choice!=0);
	
	
	
	}
}
		
	
	
	