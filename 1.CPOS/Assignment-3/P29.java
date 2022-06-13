public class P29{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int l=4;l>=i;l--)
		    {
		        System.out.print(" ");
		    }
		   for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int l=0;l<=i-1;l++)
			{
		        System.out.print(" ");
		    }	
		   for(int j=4;j>=i;j--)
		    {
		        System.out.print("*");
		    }
			System.out.println();
		}
	}
}