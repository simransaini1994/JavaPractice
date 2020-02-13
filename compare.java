import java.util.Scanner;
 class abc
{
public static void main(String arg[])
{
int i;
int n;
int a[];
int max=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of elements");
n=sc.nextInt();
a=new int[n];
System.out.println("Enter values of "+n+"elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
max=a[0];
min=a[0];
for(i=0;i<n;i++)
{
 if(max<a[i])
	{
 	max=a[i];
	}
if(min>a[i])
	{
 	min=a[i];
	}

}
System.out.println("greater element is" + max);
System.out.println("smallest is" + min);
}
}