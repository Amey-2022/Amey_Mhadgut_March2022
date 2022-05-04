public class P10{
	public static void main(String[] args) {
	char ch=68;
		for(int i=1;i<=5;i++)
		{
			for(int l=1;l<=5-i;l++)
		    {
		        System.out.print(" ");
		    }
			
		   for(int j=1;j<=i;j++)
		    {
				ch++;
		        System.out.print(ch+" ");
                
		    }
             			
			System.out.println();
			ch=(char)(68-i);
			
			
		}
	}
}