import java.util.Scanner;
class Swap
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter 2 numbers");
int a=s.nextInt();
int b=s.nextInt();
b=b+a;
a=b-a;
b=b-a;
System.out.println("swapped number is");
System.out.println(a);
System.out.println(b);

}
}