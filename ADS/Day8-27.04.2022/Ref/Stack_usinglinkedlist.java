import java.util.Scanner;
class Stack_usinglinkedlist{
	
	class Stack{
		int data;
		Stack next;
		Stack prev;
		
		Stack(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	Stack head=null;
	Stack tail=null;
	Stack trav=null;
	Stack temp=null;
	static int count=0;
	static int i=0;
	
	public boolean isEmpty(){
		if(head==null)
		{
			
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		
			return false;
	}
	
	public void push(int data){
		Stack newNode=new Stack(data);
		if(isEmpty())
		{
			head=newNode;
			tail=newNode;
		}
		else{
				tail.next=newNode;
				newNode.prev=tail;
				tail=newNode;
			
		}
	}
	
	public void pop(){
		temp=head;
		if(isEmpty())
		{
			System.out.println("\tStack is empty");
		}
		else if(temp.next==null)
		{
			System.out.println("\t The pop element is "+temp.data);
			head=null;
		}
		else{
			while(temp.next.next!=null){
				temp=temp.next;
			}
			System.out.println("\t The pop element is "+temp.next.data);
			temp.next=null;
			tail=temp;
			
		}
	}
	
	public void peek(){
		System.out.println("\t The peek element is "+tail.data);
	}
	
	public void display(){
		trav=tail;		
		if(isEmpty())
		{
			System.out.println("\tStack is empty");
		}			
		else {
			while(trav != null){
				System.out.println("\tStack Element ["+(i-1)+"] "+trav.data);
				i--;
				trav=trav.prev;
			}
			
		}
		
	}
	
	public void count(){
		temp=head;
		count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		i=count;
	}

	
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	Stack_usinglinkedlist s=new Stack_usinglinkedlist();
	
	int ch=1;
	while(ch==1)
	{
		
		System.out.println("\t=========================================");
		System.out.print("\t0.Exit\n\t1.push\n\t2.pop\n\t3.peek\n\t4.display\n\t5.isEmpty\n\t6.isFull\n\t7.count\n\tEnter Number : ");
		int choice=sc.nextInt();
		System.out.println("\t=========================================");
		switch(choice){
			case 0:	ch=0;
					break;
			case 1:	System.out.print("\tEnter data :");
					int n1=sc.nextInt();
					s.push(n1);
					break;
			case 2: s.pop();
					break;
			case 3: s.peek();
					break;
			case 4: s.count();
					s.display();
					break;
			case 5: s.isEmpty();
					break;
			case 6: s.isFull();
					break;
			case 7: s.count();
					System.out.println("\tThe number of elements in stack : "+count);
					break;
			default:System.out.println("\tEntered Invalid Number");
					break;
		
		}
	}
	
	}
}