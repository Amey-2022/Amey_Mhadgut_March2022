import java.util.*;
class DuplicateElements
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array A,B and C");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = ( n1 < n2 ) ? (n1 < n3 ? n1 : n3) : ( n2 < n3 ? n2 : n3);
		
		
		int A[] = new int[n1];
		int B[] = new int[n2];
		int C[] = new int[n3];
		int D[] = new int[n4];

		
		int k = 0;
		System.out.println("Enter array Elements A : ");
		
		for(int i = 0;i<A.length;i++)
		{
			A[i] = sc.nextInt();
		}
		
		System.out.println("Enter array Elements B : ");
		for(int i = 0;i<B.length;i++)
		{
			B[i] = sc.nextInt();
		}
		
		System.out.println("Enter array Elements C : ");
		for(int i = 0;i<C.length;i++)
		{
			C[i] = sc.nextInt();
		}
		
		
		for(int i = 0;i<A.length;i++)
		{
			for(int j = 0;j<B.length;j++)
			{
				if(A[i] < B[j])					
				{
					break;
				}
				else
				{
					if(A[i] == B[j] )
					{
						D[k] = A[i];
						k++;
					}	
				}
			}
		}
		System.out.println("");
		
		System.out.print("Duplicate elements :  ");
		for(int i = 0;i<C.length;i++)
		{
			for(k= 0;k<D.length;k++)
			{
				if(C[i] < D[k])
				{
					break;
				}
				else
				{
					if(C[i] == D[k] )
					{
						System.out.print(D[k]+" ");
					}	
				}
			}
		}
		
	}
}