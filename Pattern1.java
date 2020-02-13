class Pattern1
{
public static void main(String arg[])
{
for(int i=4;i>=1;i--)
{
   for(int j=0;j<4-i;j++)
    {
        System.out.print(" ");
    }
    for(int k=5-i;k<=4;k++)
    {
       System.out.print(k);
     }
       System.out.println();
}

}
}