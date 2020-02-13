import java.util.Scanner;
class Deletion
{
static void delete(int a[])
{
 int n;
 System.out.println("enter position to be deleted");
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 for(int i=n;i<5;i++)
 {
   a[i-1]=a[i];
   }
  System.out.println(list after deletion");
 for(int j=0;j<4;j++)
  {
    System.out.println(a[j]);
   }
 }
public static void main(String arg[])
{
 Scanner s=new Scanner(System.in);
 int a[]=new int[5];
 System.out.println("enter elements");
 for(int i=0;i<5;i++)
 {
   a[i]=s.nextInt();
 }
  delete(a);
 }
}


