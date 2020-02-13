import java.util.Scanner;
class MultiArray
{
public static void main(String arg[])
{
int a[][]=new int[3][4];
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++)
{
  for(int j=0;j<4;j++)
  {
   a[i][j]=s.nextInt();  
  }
}
for(int i=0;i<3;i++)
{
 for(int j=0;j<4;j++)
{
System.out.println(a[i][j]);
}
}

}
}
