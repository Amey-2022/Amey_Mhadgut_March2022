import java.util.Scanner;
class Stack1
{
	static int size = 5;
	char[] stack = new char[size];
	
	int top;
	
	Stack1()
	{
		top = -1;
	}
	
	
	boolean isEmpty()
	{
		if(top == -1)
			return true;
			//System.out.println("Stack is empty");
		else
			return false;
			//System.out.println("Stack is not empty");
	}
	
	boolean isFull()
	{
		if(top == size-1)
			return true;
		else
			return false;
	}
	
	
	void push(char x)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			stack[++top] = x;
		}
	}
	
	char pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			char x = stack[top--];
			return x;
		}
	}

	
}
class ReverseStringStackDemo
{
	
	static void reverseStrig(StringBuffer str1)
	{
		int n = str1.length();
		
		Stack1 obj = new Stack1(); 
		for(int i = 0;i<n;i++)
			obj.push(str1.charAt(i));
		
		for(int i = 0;i<n;i++)
		{
			char ch = obj.pop();
			str1.setCharAt(i,ch);
		}
	}
	public static void main(String args[])
	{
		
		StringBuffer s = new StringBuffer("ABCD");
		
		System.out.print("Before Reversed  String  :  " +s);
		
		reverseStrig(s);
		System.out.println("");
		System.out.print("After Reversed  String   :  " +s);
	}
}