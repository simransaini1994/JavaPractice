import java.util.InputMismatchException;
import java.util.Scanner;
class abc
{
	public static void main(String arg[])
	{
		try
		{
			System.out.println("enter 2 integers");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("please enter integer no.");
			String ar[]={};
			main(arg);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception");
		}
		finally
		{
			System.out.println("i am finally")
		}
	}
}
