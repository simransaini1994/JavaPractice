import java.util.InputMismatchException;
import java.util.Scanner;
class abc
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
			x=b;
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("input mismatch");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception");
		}try();
	}
}
