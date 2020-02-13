class Pattern5
{
public static void main(String arg[])
{
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=i;++j)
    {
    if(j>3)
    {
     System.out.print(j*2-3);
      }
else
     System.out.print(j);

}
       System.out.println();
}

}
}