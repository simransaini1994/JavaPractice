class Pattern9
{
public static void main(String arg[])
{
for(int i=1;i<=5;i++)
{
for(int j=5;j>=i;j--)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(" *");
System.out.println();
}
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i+1;j++)
System.out.print(" ");
for(int k=4;k>=i;k--)
System.out.print(" *");
System.out.println();
}
}}