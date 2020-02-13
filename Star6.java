public class Star6
{ 
	public static void main(String arg[])
		{
			int i;
			int j;
		for(i=0;i<5;i++)
			{
				for(j=0;j<i;j++)
					{
						System.out.print("*");
					}		
						System.out.println();
			}

		for(i=0;i<5;i++)
			{
				for(j=0;j<5-i;j++)
					{
						System.out.print("*");
					}		
						System.out.println();
			}
		}
}