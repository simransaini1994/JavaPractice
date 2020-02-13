class Pattern12
{
public static void main(String arg[])
{
for(int i=1;i<=4;i++)
{
    for(int j=i;j>=1;j--)
    {
      if(j%2==0)
       System.out.print("0");
      else
       System.out.print("1");  
    }
       System.out.println();
}
for(int i=3;i>=1;i--)
{
  for(int j=i;j>=1;j--)
  {
      if(j%2==0)
       System.out.print("0");
      else
       System.out.print("1");  
    }
       System.out.println();
}
}
}