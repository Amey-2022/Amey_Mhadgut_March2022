public class Hop2{
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int space=1;space<=6-i;space++)
		   {
		    System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)
		    {
				if(j==1 || i==6 || j==i)
				{
				System.out.print("* ");
				}
				else
		        System.out.print("  ");
		    }
			System.out.println();
		}
	}
}