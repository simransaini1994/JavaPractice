import java.util.Scanner;
class Factorial
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int a=s.nextInt();
int fact=1;
for(int i=a;i>=1;i--)
{
  fact=fact*i;
 }
 
System.out.println("factorial is ="+ fact);
}
}
