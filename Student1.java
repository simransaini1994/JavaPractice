import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Student
{
int rollno;
String name;
char grade;
double eng_marks,math_marks,sci_marks,total_marks,average;

Student(int r,String n,double e,double m,double sc)
{
rollno=r;
name=n;
eng_marks=e;
math_marks=m;
sci_marks=sc;
}
void display()
{
System.out.println("Rollno="+rollno);
System.out.println("Name="+name);
}

void cal_total()
{
 double total_marks=eng_marks+math_marks+sci_marks;
System.out.println("Total="+total_marks);
}
void cal_average()
{
 double average=(eng_marks+math_marks+sci_marks)/3;
System.out.println("Average="+average);
}
void find_grade()
{
 if(total_marks>=90)
   grade='E';
 else if(total_marks<90&&total_marks>=75)
  grade='A';
 else if(total_marks<75&&total_marks>=60)
  grade='B';
 else
 grade='C';
 System.out.println(grade);
}
}
 class Student1
{
public static void main(String arg[]) throws IOException
{
Student s[]=new Student[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter roll no,name, eng marks,math marks,sci marks");
for(int i=0;i<s.length;i++)
{
  int r=Integer.parseInt(br.readLine()); 
  String n=br.readLine();
  double e=Double.parseDouble(br.readLine());
  double m=Double.parseDouble(br.readLine());
  double sc=Double.parseDouble(br.readLine());

 s[i]=new Student(r,n,e,m,sc);
 System.out.println("next student");
}
for(int i=0;i<s.length;i++)
{
s[i].display();
s[i].cal_total();
s[i].cal_average();
s[i].find_grade();
}
}
}

 
