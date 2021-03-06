//to implement stack and queue using array and linkedlist
import java.util.*;
class StackArray{
	
		int stack[];
		int top;
		public StackArray(int max){
			  stack=new int[max];
			  top=-1;
		}
	
	
	public boolean isEmpty(){
		return top==-1;	
	}
	
	public boolean isFull(){	
		return top>=(stack.length-1);
	}
	
	void push(){
		Scanner sc=new Scanner(System.in);
		if(isFull())
			System.out.println("Stack Overflow");
		else{
			System.out.print("Insert element: ");
			int x=sc.nextInt();
			top++;
			stack[top]=x;	
		}
	}
	
	void pop(){
		if(isEmpty())
			System.out.println("Stack is empty");
		else{
			int delItem=stack[top];
			top--;
			System.out.println("Deleted element: "+delItem);
			display();
		}
		
	}
	
	void peek(){
		if(isEmpty())
			System.out.println("Stack is empty");
		else{
			System.out.println("Peek element is: "+stack[top]);
		}
	}
	
	
	void display(){
		if(isEmpty())
			System.out.println("Stack is empty");
		else{
			for(int i=top; i>=0;i--){
				System.out.println("Stack["+i+"] :"+stack[i]);
			}
		}
	}
	
	void count(){
		int count=0;
		if(isEmpty())
			System.out.println("Stack is empty");
		else{
			for(int i=top; i>=0;i--){
				count++;
			}
		}
		System.out.println("Elements in stack: "+count);
		
	}
	
	
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of stack: ");
		int max=sc.nextInt();
		StackArray sa=new StackArray(max);
		
		
		int choice=0;
		
		do{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.println("\t0.Exit \t1.Push \t2.Pop \t3.Peek \t4.Display \n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.print("Enter Choice: ");
			choice=sc.nextInt();
			
			
			switch(choice){
				case 1: sa.push(); break;		
				case 2:sa.pop(); break;
				case 3:sa.peek(); break;
				case 4:sa.display(); break;
			}
		}while(choice!=0);
	}

}