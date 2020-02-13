import java.util.Scanner;
public class String2
{
	public static void main(String arg[])
	{
                String s1;
		String s2;
		int i;
		int j;
		char a[];
		char b[];
		int len1=0;
		int flag=0;
		int len2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE String1 ");
		s1=sc.nextLine();
		System.out.println("ENTER THE String2 ");
		s2=sc.nextLine();
		a=s1.toCharArray();
		b=s2.toCharArray();
		len1=s1.length();
		len2=s2.length();
		for(i=0;i<len1;i++)
		{
			
			System.out.println("a["+i+"]="+a[i]);
		}
		for(i=0;i<len2;i++)
		{
			
			System.out.println("b["+i+"]="+b[i]);
		}
		if(len1==len2)
		{
		for(i=0;i<len1;i++)
		{		
				
				if(a[i]!=b[i])
				{
			          flag=1;
			break;
				}
                 }
                  }
	        
		else
                 { 
                    flag=2; 
                  }
                 
	     if(flag==1)
			{
			
					System.out.println("strings are no equal ");	
			}
		else if(flag==0)
		{
			System.out.println("strings are  equal ");
		}
                else if(flag==2)
                System.out.println("STRINGS ARE NOT EQUAL");
   	
	}
}