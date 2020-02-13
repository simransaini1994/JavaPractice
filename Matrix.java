public class Matrix
{
	public static  void main(String arg[])
	{
		int a[][] = { {10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println("\n Matrix is : \n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}	
		

	}




}