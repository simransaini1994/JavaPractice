import java.util.Scanner;
class Grades
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter marks");
int a=s.nextInt();
if(a<50)
{
     System.out.println("Grade is average");
}
  else if(a>=50&&a<=70)
    {
     System.out.println("grade is good");
     }
else if(a>70&&a<=80)
   {
      System.out.println("grade is very good");
   }
else if(a>85) 
   {
      System.out.println("grade is excellent");
   }

}
}


