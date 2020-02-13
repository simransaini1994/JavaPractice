class Pattern6
{
public static void main(String arg[])
{
for(int i=1;i<=5;i++)
{
    for(int j=5;j>=i;j--)
    {
       System.out.print(" ");
    }
    for(int k=1;k<=i;k++)
    {
      int p=96+k;
      char s=(char)p;
      System.out.print(" "+s);
     }
            System.out.println();
}

}
}