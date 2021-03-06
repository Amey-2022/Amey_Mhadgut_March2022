import java.util.Scanner;

class Stack1{
		
		char stack[];
		int top;
		Stack1(int n){
			stack=new char[n];
			top=-1;
		}
		
		public boolean isEmpty(){
			return top==-1;
		}
		
		public boolean isFull(){
			return top>=stack.length-1;
		}
		
		void push(char x){
			if(isFull())
				System.out.println("Stack is full");
			else
			stack[++top]=x;
		}
		
		char pop(){
			if(isEmpty()){
				System.out.println("Stack is empty");
				return 0;
			}
			else{
				char x=stack[top--];
				return x;
			}
		}
}

class StackReverseString{
			
			static void reversString(StringBuffer str){
				int n=str.length();
				
				Stack1 obj=new Stack1(n);
				for(int i=0;i<n;i++){
					obj.push(str.charAt(i));
				}
				
				for(int i=0;i<n;i++){
					char ch=obj.pop();
					str.setCharAt(i,ch);
				}
			}
	
		public static void main(String... args){
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
			StringBuffer s=new StringBuffer(st);
			
			System.out.print("Before Reversed  String  :  " +s);
			
			reversString(s);
			System.out.println("");
			System.out.print("After Reversed  String   :  " +s);	
		}
}