//to implement stack and queue using array and linkedlist
import java.util.*;
class StackDemo{
	
	static int stack[]=new int[5];
	static int top=-1;
	
	void push(){
		Scanner sc=new Scanner(System.in);
		
		if(top==(5-1)){
			System.out.println("          Stack Overflow");
		}
		else{
			System.out.print("          Enter Element : ");
			int x=sc.nextInt();
			top++;
			stack[top]=x;
		}
	}
	
	void pop(){
		int delItem=0;
		if(top==-1){
			System.out.println("          Stack is empty");
		}
		else{
			delItem=stack[top];
			top--;
			System.out.println("          Poped element is : "+delItem);
		}
		
	}
	
	void peek(){
		if(top==-1){
			System.out.println("          Stack is empty");
		}
		else{
			System.out.println("          Peek element is : "+stack[top]);
		}
		
		
	}
	
	void display(){
		if(top==-1){
			System.out.println("          Stack is empty");
		}
		
		else{
		for(int i=top;i>=0;i--)
		{
			System.out.println("          stack["+i+"]="+stack[i]);
		}
		}
	}
	
	
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		StackDemo s=new StackDemo();
		int choice=0;
		do{
			System.out.println("          =========================================");
			System.out.print("          1.push\n          2.pop\n          3.peek\n          4.display\n          Enter Number : ");
		choice=sc.nextInt();
		System.out.println("          =========================================");
		switch(choice){
			case 0:break;
			case 1:s.push();break;
			case 2:s.pop();break;
			case 3:s.peek();break;
			case 4:s.display();break;
			default:System.out.println("          Entered Invalid Number");
					break;
		}
			
		}while (choice != 0);
	
	}
}

