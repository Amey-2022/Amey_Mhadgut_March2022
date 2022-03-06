public class Hop1{
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int space=5;space>=i;space--)
		   {
		    System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)
		    {
				if(j==1 || i==6 || i==j)
		        System.out.print("* ");
			else
				System.out.print("  ");
		    }
			System.out.println();
		}
	}
}