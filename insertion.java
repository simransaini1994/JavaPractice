import java.util.Scanner;
public class insertion
{
public static void main(String arg[])
{
int a[];
int i;
int b;
int pos;
int temp;
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
System.out.println("enter value you want to insert");
b=sc.nextInt();
System.out.println("enter position where you want to insert");
pos=sc.nextInt();
	for(i=4;i>=pos-1;i--)
		{
			a[i+1]=a[i];
                    
 }
a[pos-1]=b;

System.out.println("new list is");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
	}
		}		
