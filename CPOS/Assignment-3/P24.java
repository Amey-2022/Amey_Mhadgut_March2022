public class P24{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int l=1;l<=i-1;l++)
			{
		        System.out.print(" ");
		    }	
		   for(int j=5;j>=i;j--)
		    {
		        System.out.print("*");
		    }
			System.out.println();
		}
	}
}