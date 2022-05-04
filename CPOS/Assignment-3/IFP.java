public class IFP{
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int space=0;space<=i-1;space++)
		   {
		    System.out.print(" ");
		   }
		   for(int j=6;j>=i;j--)
		    {
		        System.out.print("* ");
		    }
			System.out.println();
		}
	}
}