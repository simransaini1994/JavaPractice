import java.util.Scanner;
class Swap1
{
public static void main(String arg[])
{
int temp;
Scanner s=new Scanner(System.in);
System.out.println("enter 2 numbers");
int a=s.nextInt();
int b=s.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("swapped number is");
System.out.println(a);
System.out.println(b);

}
}