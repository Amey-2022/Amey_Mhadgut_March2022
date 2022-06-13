import java.util.Stack;
import java.util.Scanner;


class PostFixExpressionEvaluation{
	
		public static int cal(int a,int b,char operator){
			
			switch(operator){
				case '$': return(int) Math.pow(a,b);
				case '^': return(int) Math.pow(a,b);  
				case '*': return a*b;
				case '/': return a/b;
				case '%': return a%b;
				case '+': return a+b;
				case '-': return a-b;	
			}
			return 0;
		}
		
		public static int solvePostFix(String post){
			Stack<Integer> s=new Stack<Integer>();
			
			for(int i=0;i<post.length();i++){
				
				char sym=post.charAt(i);	
				if(Character.isDigit(sym)){
					String operand=Character.toString(sym);
					s.push(Integer.parseInt(operand));
				}
				else{
					int b=s.pop();
					int a=s.pop();
					
					int c=cal(a,b,sym);
					s.push(c);
				}
					
			}
			return s.pop();
		}
		
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PoostFix Expression: ");
		String postfixexp=sc.next();
		int result=solvePostFix(postfixexp);
		System.out.println("Result: "+result);
		} 
}