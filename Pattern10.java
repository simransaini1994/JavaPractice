class Pattern10
{
public static void main(String args[])
{
int i,j,k,p;
char s;
for(i=0;i<=2;i++)
{
 for(j=2;j>=i;j--)
  {
    System.out.print(" ");
   }
  for(k=0;k<=i;k++)
    {
     p=97+k;
     s=(char)p;
    System.out.print(s);
    }
 for(k=0;k<=i-1;k++)
  {
   p=97+k;
   s=(char)p;
   System.out.print(s);
  }
  System.out.println();
 }
for(i=0;i<=1;i++)
{
 for(j=0;j<=i+1;j++)
  {
    System.out.print(" ");
   }
  for(k=0;k<=i;k++)
    {
     p=97+k;
     s=(char)p;
    System.out.print(s);
    }
 /*for(k=0;k<=i-1;k++)
  {
   p=97+k;
   s=(char)p;
   System.out.print(s);
  }*/
  System.out.println();
 }
}}

   