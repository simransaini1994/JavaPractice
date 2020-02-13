import java.util.Scanner;
public class sumofarray
{
public static void main(String arg[])
{
int i;
int n;
int a[];
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of elements");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter values of "+n+"elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println("sum of "+n+"elements is"+sum);
}
}