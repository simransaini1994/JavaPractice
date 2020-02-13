import java.util.Scanner;
public class SumofDiagonal
{
	public static void main(String arg[])
	{
		int sum1=0;
		int sum2=0;
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
		System.out.println("sum of diagonal elements");
                for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
				  if(i==j)
					{
						sum1=sum1+a[i][j]; 
					
					}
				if(i+j==2)
					{
						sum2=sum2+a[i][j];
					}
				}
		}
		System.out.println("sum of elements of diagonal1"+sum1);
		System.out.println("sum of elements of diagonal2"+sum2);
				
      }
		
}


