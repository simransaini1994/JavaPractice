class Pattern11
{
public static void main(String arg[])
{
for(int i=1;i<=5;i++)
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