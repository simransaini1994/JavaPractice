import java.util.Scanner;
public class pos
{
public static void main(String arg[])
{
int i;
int n;
int a[];
int temp;
int pos=0;
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of elements");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter values of "+n+"elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the value whose position you want to know");
temp=sc.nextInt();
for(i=0;i<n;i++)
{
if(temp==a[i])
{
flag=1;
pos=i+1;
break;
}
}
if(flag==0)
{
System.out.println("value is invalid");
}
else
{System.out.println("position of element"+temp+"is"+pos);
}
}
}