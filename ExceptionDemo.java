import java.util.Scanner;
class MyException extends RuntimeException
{

}
class ExceptionDemo
{
	public void myMethod() throws MyException
	{
		Scanner s=new Scanner(System.in);;
		System.out.println("enter age");
		int age=s.nextInt();
		if(age>100)
		{
			throw new MyException();
		}
	}
	public static void main(String arg[])
	{
            ExceptionDemo e=new ExceptionDemo();
		try 
		{
		
			e.myMethod();
		}
		catch(MyException e1)
		{
			System.out.println("enter valid age");
                       
			System.out.println(e1);
                        e.myMethod();
                       	
		}
	}
}