class Prime1
{
  public static void main(String arg[])
 {
  int i,j;
  for(i=1;i<50;i++)
  {
   int flag=0;
  for(j=2;j<i;j++)  //or j<i/2
   {
   
     if(i%j==0)
   {
     flag=1;
   }
   }

  if(flag==0)
{
System.out.println(i);
}

}
}}