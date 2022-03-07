public class PP5{
	public static void main(String[] args) {
		
		int n=8,k=9;
		
		for(int i=1;i<=9;i++)
		{
			for(int space=1;space<=9-i;space++)
		   {
		    System.out.print("  ");
		   }
		//int n=8,k=9;
		  for(int j=1;j<=2*i-1;j++)
		  {
			n++;
		    if(j>i)
			      {
			      k--;
			      System.out.print(k+" ");
			      }
			else
				  {
		           System.out.print(n+" ");
				  }
		  }
			k=9;
			n=8-i;
			System.out.println();
		}
	}
}