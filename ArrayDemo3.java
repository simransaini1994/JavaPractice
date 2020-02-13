import java.util.Scanner;
class ArrayDemo3
{
public static void main(String arg[])
{
int a[]=new int[4];
Scanner s=new Scanner(System.in);
System.out.println("enter values");
for(int i=0;i<4;i++)
{
a[i]=s.nextInt();
}
System.out.println("values are:");
for(int i=0;i<4;i++)
{
System.out.print(a[i]+1);
}

}
}
