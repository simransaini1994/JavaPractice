import java.util.Scanner;
public class String4
{
	public static void main(String arg[])
	{
                String s1;
		String s2;
		int i;
		char a[];
		int len=0;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		s1=sc.nextLine();
		len=s1.length();
		char d[]=new char[len];
		for(i=0;i<len;i++)
			{
				System.out.println("a["+i+"]="+a[i]);
			}
		
		for(i=0;i<len;i++)
			{
				int b=a[i];
				if(b>65 && b<92)
					{
						System.out.println("string is in uppercase");
						c=b+32;
						char d[i]=c;
					}
			}
		s2=String.valueOf(d);
		System.out.println("string in lowercase is"+s2);
		}
}