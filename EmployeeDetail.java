import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Employee
{
 int empId;
 String empName;
 int total_leaves;
 double total_salary;
  boolean flag=true;
  int deduction=0;
  void calculate_balance_leaves(int no_of_leaves,String type_of_leave)
  {}
  void avail_leave(int no_of_leaves,String type_of_leave)
  {
   }
  void calculate_salary()throws IOException
  {}
}

class PermanentEmp extends Employee
{
  int paid_leave=5;
  int sick_leave=6; 
  int casual_leave=50;
  double basic,hra,pf;
  void print_leave_details()
  {
   System.out.println("you have following leaves");
   System.out.println("paid_leave="+paid_leave);
   System.out.println("sick_leave="+sick_leave);
   System.out.println("casual_leave="+casual_leave);
  }
void calculate_balance_leaves(int no_of_leaves,String type_of_leave)
{
 if(type_of_leave.equals("paid_leave"))
  {
   if(no_of_leaves>5)
  casual_leave=50-no_of_leaves;
  else
  paid_leave=5-no_of_leaves;
  }
  if(paid_leave<0)
  {
  System.out.println("requested paid leave not available");
  System.out.println("casual_leave is available");
  
  paid_leave=5;
  }
 System.out.println("balance paid_leaves="+paid_leave);
 if(type_of_leave.equals("sick_leave"))
  sick_leave=6-no_of_leaves;
  if(casual_leave<=0)
  {
  System.out.println("requested  sick_leave not available");
  }
 System.out.println("balance sick leaves="+sick_leave);
 if(type_of_leave.equals("casual_leave"))
  casual_leave=50-no_of_leaves;
 if(casual_leave<=0)
  {
  System.out.println("requested paid leave not available");
  }
System.out.println("balance casual leaves="+casual_leave);
}
void avail_leave(int no_of_leaves,String type_of_leave)
{
  if(no_of_leaves<6)
  {
  if(type_of_leave.equals("paid_leave")||type_of_leave.equals("sick_leave"))
  flag=true;
  else 
  flag=false;
  }
  else
  flag=false;
  if(flag==false)
  {
   System.out.println("you can avail leaves with deduction of 400 per day");
   deduction=no_of_leaves*400;
  }
  else
  {
   System.out.println("you can avail leaves");
  }
}
void calculate_salary()throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter your basic pay");
 basic=Double.parseDouble(br.readLine());
 pf=(12/100)*basic;  //datatype already defined in class
 hra=(50/100)*basic;
 total_salary=basic+hra-pf-deduction;
System.out.println("total_salary="+total_salary);
}
}
 class TemporaryEmp extends Employee
 {
  int leave=5;
  int no_of_leaves;
 void calculate_balance_leaves(int no_of_leaves,String type_of_leave)
 { 
   if(no_of_leaves<5)
   leave=5-no_of_leaves;
   else
   leave=0;
 System.out.println("leaves left="+leave);
   
  }
void avail_leave(int no_of_leaves,String type_of_leave)
{ 
 int i=0;
 if(no_of_leaves>5||type_of_leave.equals("casual"))
{
   i=no_of_leaves-5;
   deduction=200*i;
  flag=false;
}
   else
  {
    flag=true;
  }
 if(flag==true)
 { 
  System.out.println("you can avail leaves");
}
 else
 
  System.out.println("you can avail leaves with deduction of 200 per day after 5th holiday");
}
 void calculate_salary()throws IOException
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter your basic pay");
 double basic=Double.parseDouble(br.readLine());
 total_salary=basic-deduction;
 System.out.println("total salary is"+total_salary);
}
}
class EmployeeDetail
{
public static void main(String arg[])throws IOException
{

  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Are you permanent employee or temporary");
  System.out.println("press temp for temporary and perm for permanent");
  String x=br.readLine();
  if(x.equals("temp"))
{
  TemporaryEmp t=new TemporaryEmp();
  System.out.println("type of leave"); 
  String a=br.readLine();
 System.out.println("enter no of leaves");
  int n=Integer.parseInt(br.readLine());
  t.calculate_balance_leaves(n,a);
  t.avail_leave(n,a);
  t.calculate_salary();
 }
 else
 {
  PermanentEmp p=new PermanentEmp();
  p.print_leave_details();
 System.out.println("type of leave"); 
  String b=br.readLine();
 System.out.println("enter no of leaves");
 int m=Integer.parseInt(br.readLine());
 p.calculate_balance_leaves(m,b);
 p.avail_leave(m,b);
 p.calculate_salary();
 }
  
}
}
  


  