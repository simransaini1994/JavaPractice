import java.util.Scanner;
class Max
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter 3 numbers");
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
if(n1>n2 && n1>n3)
{
System.out.print("1st number is greater i.e"+n1);
}
else if(n2>n1 && n2>n3)
{
System.out.print("2nd number is greater i.e"+n2);
}
else
{
System.out.print("3rd number is greater i.e"+n3);
}
}
}