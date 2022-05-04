public class P216{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
		   for(int space=4;space>=i;space--)
		   {
		    System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)
		    {
				if(j==1 || i==5 || j==i)
				{
				System.out.print("*");
				}
				else
		        System.out.print(" ");
		    }
			System.out.println();
		}
	}
}