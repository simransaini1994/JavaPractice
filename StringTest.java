import java.util.Scanner;
public class StringTest
{
	public static void main(String arg[])
	{
                String s1;
		int i;
		char ch[];
		int len=0;
		int a=0;
		int b=0;
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE String");
		s1=sc.nextLine();
		ch=s1.toCharArray();
		len=s1.length();
		for(i=0;i<len;i++)
		{
			
			if(ch[i]==' ')
				{
					a++;

				}
		
		}
		b=a+1;
		c=len-a;
		System.out.println("no. of spaces" +a);
		System.out.println("no. of words" +b);
		System.out.println("no. of letters" +c);
		}
	}