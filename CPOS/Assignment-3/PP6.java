public class PP6{
	public static void main(String[] args) {
		for(int i=9;i>=1;i--)
		{
			for(int space=8;space>=i;space--)
		   {
		    System.out.print(" ");
		   }
		   for(int j=i;j>=1;j--)
		    {
		        System.out.print("* ");
		    }
			System.out.println();
		}
	}
}