import java.util.Scanner;
class matrix2
{
	public static void main(String arg[])
	{
		int a[][] = new int[3][3];                                               
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUES OF 1st 3 x 3 Matrix : ");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					a[i][j]=sc.nextInt();
				}
		}
		System.out.println("ENTER THE VALUES OF 2nd 3 x 3 Matrix : ");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					b[i][j]=sc.nextInt();
				}
		}
			System.out.println("\n 1st Matrix IS : \n");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.println();
				
		}
			System.out.println("\n 2nd Matrix IS : \n");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print("\t"+b[i][j]);
				}
				System.out.println();
				
		}
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
				if(i+j==2)
					{
					System.out.print(a[i][j]);	
					}			
				System.out.println();
				}
		}
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
				if(i==j)
					{
					System.out.print(b[i][j]);
					}		
				System.out.println();
				}
		}
		for(int i=0;i<0;i++)
		{
				for(int j=0;j<3;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
		}
				System.out.println("sum = "+c[i][j]);
				
			
	}	

}