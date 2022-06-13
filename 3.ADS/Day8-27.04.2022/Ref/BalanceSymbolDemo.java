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
	
	boolean isBalaceSymbol(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '('  ||  str.charAt(i) == '['  ||  str.charAt(i) == '{')
				char ch = str.charAt(i);
				push(str.charAt(i));
			
			if(str.charAt(i) == ')'  ||  str.charAt(i) == ']'  ||  str.charAt(i) == '}')
				pop();
		}
		
		if(top == -1)
			return true;
		else
			return false;
	}
	
}
class BalanceSymbolDemo
{

	public static void main(String args[])
	{
		
		Stack1 s = new Stack1();
		//String str = "((()))";//balanced
		//String str = "((((()))";//not balanced
		String str = "[][{{(}()]}}";
		if(s.isBalaceSymbol(str))
		{
			System.out.print("Balanced");
		}
		else
		{
			System.out.print("Not Balanced");
		}
		
	}
}