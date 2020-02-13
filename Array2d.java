import java.util.Scanner;
class Array2d
{
static void even(int a[][])
 { 
int c=0;
for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
    {
      if(a[i][j]%2==0)
       {
         c++;
        }
     }
  }
 System.out.println("number of even elements="+c);
  }
public static void main(String arg[])
 {
  int a[][]=new int[3][3];
  Scanner s=new Scanner(System.in);
  System.out.println("enter elements");
  for(int i=0;i<a.length;i++)
  {
    for(int j=0;j<a[i].length;j++)
     {
       a[i][j]=s.nextInt();
     }
  }
  even(a);
 }
}
  
  