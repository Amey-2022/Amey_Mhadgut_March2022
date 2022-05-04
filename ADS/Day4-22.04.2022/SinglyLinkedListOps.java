import java.util.Scanner;
class SinglyList{
		//Node is static member class of SinglyList
		static class Node{
			
			//Node class field
			int data;
			Node next;
		
		
		//Node class constructor
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
		public SinglyList(){
			head=null;
			tail=null;
		}
		
		
		void addNode(int val){
		Node newNode=new Node(val);
			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
		}
		
		void display(){
			if(head==null)	
			System.out.println("List is empty  \3!!!");
			
			Node trav=head;
			while(trav != null){
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
			System.out.println("\n");
		}
		
		
		void addFirst(int val){
			//1. Create new node and initialize it
			Node newNode=new Node(val);
			
			//1.Special case : if head is null make new node as first node
			if(head==null){
				head=newNode;
			}
			//general : add node at first
			else{
				//new node next should point to head
				newNode.next=head;
				//head should point to new node
				head=newNode;
			}	
		}
			

		void addLast(int val){
			//1. Create new node and initialize it
			Node newNode=new Node(val);
			
			//1.Special case : if head is null make new node as first node
			if(head==null){
				head=newNode;
			}
			//general : add node at last
			else{
				//traverse till last node
				 Node trav=head;
				 while(trav.next!=null){
					trav=trav.next;
				 }
				//add new node after traverse
			    trav.next=newNode;
			}
		} 
		
		
		void addAtPos(int val,int pos){
			
			//allocate &init new node
			//special case1: if list is empty, add node at the start
			//special case1: if pos<=1, add node at start
			if(head==null || pos<=1){
				addFirst(val);
			}
			//general: add node at given pos
			else{
				Node newNode=new Node(val);
				//traverse till pos-1
				Node trav=head;
				for(int i=1;i<pos-1;i++){
					
					//special case3: if pos > length of list,add node at end
					if(trav.next==null)
						break;
					//trav's next should point to newNode
					trav=trav.next;
					
				}
				//newNode's next should point to trav's next
				newNode.next=trav.next;
				trav.next=newNode;
			}
		}
		
		
		void deleteFirst(){
			//special cas1: if list is empty, throw exception
			if(head==null)
				throw new RuntimeException("List is empty");
			//general1: make head pointing to next node
			head=head.next;
			//note: the old first node will be garbage collected.
		}
		
		
		void deleteLast(){
			//special cas1: if list is empty, throw exception
			if(head==null)
				throw new RuntimeException("List is empty");
			Node temp=null;
			Node trav=head;
			//special cas2: if list is having only 1 element
			if(trav.next==null)
				head=null;
			else{
				while(trav.next!=null){
					temp=trav;
					trav=trav.next;
				}
				temp.next=null;
				display();		
			}
		}
		
		
		void deleteAtPos(int pos){
			//special cas1: if pos ==1,delete first node
			if(pos==1)
				deleteFirst();
			//special cas2: if list is empty or pos < 1,then throw exception
			if(head==null || pos<1)
				throw new RuntimeException("List is empty or Invalid Position"); 
			//take tempointer running behind trav
			Node temp=null,trav=head;
			//traverse till position
			for(int i=1;i<pos;i++){
				//special case3: if pos is beyond list length, then throw exception
				if(trav==null)
					throw new RuntimeException("List is empty or Invalid Position"); 
				temp=trav;
				trav=trav.next;
			}
			//trav is  node to be deleted and temp is node before that 
			temp.next = trav.next;
			//trav node will be garbage collected
		}
		
		
		void deleteByValue(int val){
			Node prevNode=null;
			Node trav=head;
			Node temp=head;
			
			if(head==null)
				display();
			//finding length of linkedlist
			int count=0;
			while(temp!=null){
				temp=temp.next;
				count++;
			}
			
			while(trav!=null){
				
				if(trav.data==val)
					if(trav==head && count==1){
						head=null;
						display();
						break;
					}else if(trav.next==null){
						deleteLast();
						break;
					}else if(trav==head){
						head=trav.next;
						display();
						break;
					}else{
						prevNode.next=trav.next;
						trav=null;
						display();
						break;
					}
					prevNode=trav;
					trav=trav.next;
			}	
		}
		
		
		void delAll(){
			head = null;
			//all node will be garbage collected
		}


		void searchNode(int val){
			Node trav=head;
			if(head==null)
				display();
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
			Node trav=head;
			int count=0;
			if(head==null)
				display();
			while(trav!=null){
				count++;
				trav=trav.next;
			}
			System.out.println("The elements present in Linked List : "+count);
		}
		

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
			display();
		}
		
		
		void sortedList(){
			
			
		}
}

class SinglyLinkedListOps{
		public static void main(String[] args){
			int choice=0, val,pos;
			SinglyList list=new SinglyList();
			Scanner sc=new Scanner(System.in);
			
			do{
				System.out.println("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \n");
				System.out.println("\t0.Exit \t\t\t1.Add Node \t\t2.Display \t\t3.Add First \n\t4 Add Last \t\t5.Add Position \t\t6.Delete First \t\t7.Delete Last \n\t8.Delete At Position \t9.Delete All \t\t10.Delete by value \t11.Search Value \n\t12.Length of list \t13.Reverse List \t14.Sort\n");
				System.out.println("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \n");
				System.out.print("Enter Choice: ");
				try{choice=sc.nextInt();}
				catch(Exception e){
					System.out.println("Invalid Input!!!");
					}
					
				
				switch(choice){
					
					
					case 1://Add Node
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addNode(val);
							break;
					case 2: //display
							list.display();
							break;
					
					case 3: //Add First
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addFirst(val);
							break;
					case 4: //Add Last
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.addLast(val);
							break;
					case 5: //Add At Specific Position
							System.out.println("Enter the value: ");
							val=sc.nextInt();
							System.out.print("Enter the  position to add value: ");
							pos=sc.nextInt();
							list.addAtPos(val,pos);
							break;
					case 6://Delete First
							try{
								list.deleteFirst();
							}catch(Exception e){System.out.println(e.getMessage());}
							break;
					case 7://Delete Last
							try{
							list.deleteLast();
							}catch(Exception e){System.out.println(e.getMessage());}
							break;
					case 8://Delete At Specific Position
							//System.out.print("Enter the element : ");
							//val = sc.nextInt();
							System.out.print("Enter the position of element : ");
							pos = sc.nextInt();
							try
							{
								list.deleteAtPos(pos);
							}
							catch(Exception e)
							{
								System.out.println(e.getMessage());
							}
							break;
					case 9://Delete All
							list.delAll();
							break;
					
					case 10://Delete by value
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							System.out.println();
							list.deleteByValue(val);
					case 11://Search Node
							System.out.print("Enter the value: ");
							val=sc.nextInt();
							list.searchNode(val);
					case 12://Length of list
							list.length();
					case 13://Reverse the list
							list.reverse();
							
					
				}
			}
			while(choice!=0);
		}
	
	
}