import java.util.Scanner;
public class TranposeMatrix

{
	public static void main(String arg[])
	{
		int temp;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUES OF 3 x 3 Matrix : ");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					a[i][j]=sc.nextInt();
				}
		}
		System.out.println("\nMatrix IS : \n");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.println();
				
		}
		System.out.println("\ntranspose of matrix\n");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					b[i][j]=a[j][i];
				}
				System.out.println();
				
		}
		
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print("\t"+b[i][j]);
				}
				System.out.println();
				
		}
		
			
		}

}