import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class E
{
int code;
String name;
int salary;
E(int c,String n,int s1) //constuctors have local variables
{
code=c;
name=n;
salary=s1;
}
E(int c,String n)
{
code=c;
name=n;
}
void display()
{
System.out.print("Code="+code);
System.out.println();
System.out.print("Name="+name);
System.out.println();
System.out.print("Salary="+salary);
System.out.println();

}
}
class Employee
{
public static void main(String arg[]) throws IOException
{
E emp[]=new E[3];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter code name salary respectively");
for(int i=0;i<emp.length;i++)
{
  int c=Integer.parseInt(br.readLine()); 
  String n=br.readLine();
  int s1=Integer.parseInt(br.readLine());
emp[i]=new E(c,n,s1);
}
for(int i=0;i<emp.length;i++)
{

emp[i].display();
}

}
}