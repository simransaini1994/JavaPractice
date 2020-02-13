import java.util.Scanner;
public class deletion
{
public static void main(String arg[])
{
int a[];
int i;
int b;
int pos;
int j;
Scanner sc=new Scanner(System.in);
System.out.println("enter value of elements:");
a=new int[10];
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("list of ele");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
System.out.println("enter value you want to delete");

{
pos=i+1;
       for(i=pos;i<4;i++)
		{
			a[i-1]=a[i];
                    
 }
}

System.out.println("new list is after deletion");
for(i=0;i<4;i++)
{
System.out.println(a[i]);
}
	}
		}		
