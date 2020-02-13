import java.util.Scanner;
public class String1
{
	public static void main(String arg[])
	{
                String s1;
		int i;
		char ch[];
		int len=0;
		int acount=0;
		int ecount=0;
		int icount=0;
		int ucount=0;
		int ocount=0;
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE String");
		s1=sc.nextLine();
		ch=s1.toCharArray();
		len=s1.length();
		for(i=0;i<len;i++)
		{
			if(ch[i]=='a' || ch[i]=='A')
				{
					acount++;

				}
			if(ch[i]=='e' || ch[i]=='E')
				{
					ecount++;

				}
			if(ch[i]=='i' || ch[i]=='I')
				{
					icount++;

				}
			if(ch[i]=='o' || ch[i]=='O')
				{
					ocount++;

				}
			if(ch[i]=='u' || ch[i]=='U')
				{
					ucount++;

				}	
		}
		total=acount+ecount+icount+ocount+ucount;
		System.out.println("no. of a = "+acount);
		System.out.println("no. of e = "+ecount);
		System.out.println("no. of i = "+icount);
		System.out.println("no. of u = "+ucount);
		System.out.println("no. of o = "+ocount);
		System.out.println(" total no. of vowels = "+total);
		}
	}