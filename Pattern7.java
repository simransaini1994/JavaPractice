class Pattern7
{
public static void main(String arg[])
{
for(int i=1;i<=3;i++)
{
    for(int j=3;j>=i;j--)
    {
       System.out.print(" ");
    }
    for(int k=1;k<=(2*i)-1;k++)
    {
      int p=96+k;
      char s=(char)p;
      System.out.print(s);
     }
            System.out.println();
}

}
}