class TableAry{
static int t[][]=new int[30][10];


static void table(){
		for(int i=0,n=1;i<t.length;i++,n++){  
			 for(int j=0,k=1;j<10;j++,k++){
			 
			
					t[i][j]=n*k;
				  System.out.print(String.format("%3d",t[i][j])+" ");   
			   }
			   System.out.println();
		}
}
			public static void main(String... args){
				table();
			}
}