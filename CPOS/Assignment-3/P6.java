
public class P6{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int l=5;l>=i;l--)
		    {
		        System.out.print(" ");
		    }
		   for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
			System.out.println();
		}
	}
}