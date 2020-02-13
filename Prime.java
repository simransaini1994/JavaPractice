class Prime
{
public static void main(String arg[])
{
int a=7,flag=1;
for(int i=2;i<7;i++)
{
   if(a%i==0)
 {
     flag=0;
 }
}
if(flag==0)
 {
   System.out.println("number is not prime");
 }
 else
   {
    System.out.println("number is prime");
   }
}
}
