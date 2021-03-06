import java.util.Scanner;
class Queue_usignArray{
	int n = 5;
	int queue[] = new int[n];
	int front=-1;
	int rear=-1;
	
	public boolean isEmpty(){
		if(front == -1 && rear == -1)
		{
			return true;
		}
		return false;
	}
	
	public void isEmptyDisplay(){
		if(isEmpty())
		{
			System.out.println("\tQueue is Empty ");
		}
		else{
			System.out.println("\tQueue is not Empty ");
		}
	}
	
	public boolean isFull(){
		if (front==0 && rear == n-1)
		{
			return true;
		}
		return false;
	}
	
	public void isFullDisplay(){
		if(isFull()){
			System.out.println("\tQueue is Full ");
		}
		else {
			System.out.println("\tQueue is not Full ");
		}
	}
	
	public void enqueue(int data){
		if(isFull())
		{
			System.out.println("\tQueue is Full ");
		}
		else if(isEmpty()){
			front=rear=0;
			queue[rear]=data;
		}
		else if(rear==n-1)
		{
			System.out.println("\tArray out of Bounds Index");
		}
		else{
			rear++;
			queue[rear]=data;
		}
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("\tQueue is Empty ");
			}
		else if(front == rear){
			System.out.println("\tDequeue element from queue is "+queue[front]);
			front=rear=-1;
		}
		else{
			System.out.println("\tDequeue element from queue is "+queue[front]);
			front++;
		}
	}
	
	public void peek(){
		if(isEmpty())
		{
			System.out.println("\tQueue is Empty ");
		}	
		else{
			System.out.println("\tPeek element is "+queue[front]);
		}
		
	}
	
	public void display(){
		if(isEmpty())
		{
			System.out.println("\tQueue is Empty ");
		}
		
		else {
			
			System.out.print("\t");
			for(int i=front;i<rear+1;i++)
			{
				System.out.print(" "+queue[i]+"  ");
			}
			System.out.println();
			System.out.print("\t");
			for(int i=front;i<rear+1;i++)
			{
				System.out.print("["+i+"]"+"  ");
			}
		}
	}
	
	public void count(){
		if(isEmpty())
		{
			System.out.println("\tQueue is Empty ");
		}
		else {
			int count=(rear-front+1;
			System.out.println("\tThe Number of Elements in queue : "+count);
		}
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Queue_usignArray s=new Queue_usignArray(); 
		int ch=1;
		while(ch==1)
		{
			
			System.out.println("\t=========================================");
			System.out.print("\t0.Exit\n\t1.enqueue\n\t2.dequeue\n\t3.peek\n\t4.display\n\t5.isEmpty\n\t6.isFull\n\t7.count\n\tEnter Number : ");
			int choice=sc.nextInt();
			System.out.println("\t=========================================");
			switch(choice){
				case 0:	ch=0;
						break;
				case 1:	System.out.print("\tEnter data :");
						int n1=sc.nextInt();
						s.enqueue(n1);
						break;
				case 2:	s.dequeue();
						break;
				case 3:	s.peek();
						break;
				case 4:	s.display();
						System.out.println();
						break;
				case 5:	s.isEmptyDisplay();
						break;
				case 6:	s.isFullDisplay();
						break;
				case 7:	s.count();
						break;
				default:System.out.println("\tEntered Invalid Number");
						break;
			
		}
	}
		
	}
 }