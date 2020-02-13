import java.util.Scanner;
public class MatrixDynamic
{
	public static void main(String arg[])
	{
		int a[][] = new int[3][3];
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
		
	
	}


}