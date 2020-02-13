public class Star7
{ 
	public static void main(String arg[])
		{
			int i;
			int j;
			int k;
		
		for(i=0;i<5;i++)
			{
				for(j=0;j<=i;j++)
				{
					
						System.out.print(" ");
                                }	
				for(k=0;k<5-i;k++)
					{

						System.out.print("*");
					}		
						System.out.println();
			}
		
		for(i=0;i<5;i++)
			{
				for(j=0;j<5-i;j++)
				{
					
						System.out.print(" ");
                                }	
				for(k=0;k<=i;k++)
					{

						System.out.print("*");
					}		
						System.out.println();
			}
		
		}
}