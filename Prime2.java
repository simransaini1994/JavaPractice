class Prime2
{
public static void main(String arg[])
{
int i,j;
System.out.println("Prime number between 21 and 40 are");
for(i=21;i<=40;i++)
{
  boolean flag=true;
   for(j=2;j<i/2;j++)
    {
      if(i%j==0)
       {
         flag=false;
       }
    }
  if(flag==true)
  {
   System.out.println(i);
   }
}
 
}
}