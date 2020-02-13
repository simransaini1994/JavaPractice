import java.util.Scanner;
class abc 
{
	public static void main(String arg[])
	{
		String str[]={"","one","two","three","four","five","six","seven","eight","nine"};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(str[a]+"thousand"+str[b]+"hundred"+str[c]"ty"+str[d]);
	}	

}