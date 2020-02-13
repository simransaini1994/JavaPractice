class Stu
{
static int rollno=0;
String name;
float marks;;

Stu(String n,float m)
{
name=n;
marks=m;
rollno=rollno+1;
}
void display()
{
System.out.print("Rollno="+rollno);
System.out.println();
System.out.print("Name="+name);
System.out.println();
System.out.print("Marks"+marks);
System.out.println();
System.out.println("----------");
}
}
class Student
{
public static void main(String arg[])
{
Stu s1=new Stu("simran",96);
s1.display();
Stu s2=new Stu("sukhpreet",95);
s2.display();
Stu s3=new Stu("mehak",94);
s3.display();
}
}



