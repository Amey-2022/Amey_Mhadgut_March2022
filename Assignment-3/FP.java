public class FP{
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int space=5;space>=i;space--)
		   {
		    System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)
		    {
		        System.out.print("* ");
		    }
			System.out.println();
		}
	}
}