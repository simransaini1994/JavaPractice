import java.util.Scanner;
class Sorting
{
public static void main(String arg[])
{
int a[];
int i;
int j;
int temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter value of elements:");
a=new int[10];
for(i=0;i<=5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("list of ele");
for(i=0;i<=5;i++)
{
System.out.println(a[i]);
}
System.out.println();
System.out.println("sorted array is");
for(i=0;i<5;i++)
	{
		for(j=0;j<5-i;j++)
			
			{
				if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
			}			
	}

for(i=0;i<=5;i++)
{
System.out.println(a[i]);
}		
}
}


		
