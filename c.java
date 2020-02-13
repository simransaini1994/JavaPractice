import java.util.Scanner;
class abc 
{
	public static void main(String arg[])
	{
		String str[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","tewenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	        Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int a=sc.nextInt();
		if(a>999)
		{
			System.out.print(str[a/1000]+"thousand");
			a=a%1000;
		}
		if(a>99)
		{
			System.out.print(" "+str[a/100]+"hundred");
			a=a%100;
		}
		if(a>20)
		{
			int n=20+((a/10-2));
			System.out.print(" "+str[n]);
			a=a%10;
		}
		if(a>0)
		{
			System.out.print(" "+str[a]);
		}
	}	

}