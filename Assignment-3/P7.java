
public class P7{
	public static void main(String[] args) {
		//int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int l=5;l>=i;l--)
		    {
		        System.out.print(" ");
		    }
		   for(int j=1;j<=i;j++)
		    {
		        System.out.print(j+" ");
				//n++;
		    }
			//n=1;
			System.out.println();
		}
	}
}