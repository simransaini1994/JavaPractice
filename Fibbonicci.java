import java.util.Scanner;
class Fibbonicci
{
public static void main(String args[])
{
int i,n1=0,n2=1,n3;

Scanner s=new Scanner(System.in);
System.out.println("enter any number");
int n=s.nextInt();
System.out.print(n1+" "+n2);
for(i=2;i<=n;++i)  
{
   n3=n1+n2;
   n1=n2;
   n2=n3;
System.out.print(" "+n3);
}
}
}

