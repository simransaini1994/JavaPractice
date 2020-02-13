import java.util.Scanner;
class Trio
{
public static void main(String args[])
{
int i,n1=1,n2=2,n3=3,n4;

Scanner s=new Scanner(System.in);
System.out.println("enter any number");
int n=s.nextInt();
System.out.print(n1+" "+n2+" "+n3);
for(i=3;i<=n;++i)  
{
   n4=n1+n2+n3;
   n1=n2;
   n2=n3;
   n3=n4;
System.out.print(" "+n3);
}
}
}
