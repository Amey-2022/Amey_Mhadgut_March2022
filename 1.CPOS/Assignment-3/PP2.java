public class PP2{
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int space=8;space>=i;space--)
		   {
		    System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++)
		    {
		        System.out.print(j+" ");
		    }
			System.out.println();
		}
	}
}