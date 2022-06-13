//5.Write a program to implement a recursive Java palindrome checker
import java.util.Scanner;
class Question5{
	static int isPalindrome(String []str,int first,int last){
		if(first<last+1)
		{
			first++;
			last--;
			return isPalindrome(str,first,last);
		}
		if(first==last)
		{
			return 1;
		}
		if(str[first]!=str[last])
		{
			return 0;
		}
		return 1;
	}
	
	public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	int result;
	
	String s[]={"M","O","T","O","R"};
	int length=s.length;
	if(length==0)
		result=1;
	else {
		result=isPalindrome(s,0,length-1);
		
	}
	if(result==1)
	{
		System.out.println("String is palindrome");
	}
	else {
		System.out.println("String is not palindrome");
	}
	}
}