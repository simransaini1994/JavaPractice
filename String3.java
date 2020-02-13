import java.util.Scanner;
public class String3
{
	public static void main(String arg[])
	{
                String s1;
		String s2;
		int i;
		char a[];
		
		int len=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE String");
		s1=sc.nextLine();
		a=s1.toCharArray();
			
		len=s1.length();
		char b[]=new char[len];
		for(i=0;i<len;i++)
		{

			b[i]=a[len-i-1];
			
			
		}
                System.out.println("REVERSE IS :");
                s2=String.valueOf(b);
                System.out.println(s2);
				
		
	}
}