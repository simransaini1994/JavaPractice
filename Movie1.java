import.java.io.BufferedReader;
import.java.io.InputStreamReader;
import.java.io.IO Exception;
class M
{
String name;
float rating;
String type;
static int yor=2015;
M(String n,float r,String t)
{
name=n;
rating=r;
type=t;
}
void display()
{
System.out.print("Name="+name);
System.out.println();
System.out.print("Rating"+rating);
System.out.println();
System.out.print("Type="+type);
System.out.println();
System.out.print("Year of release="+yor);
System.out.println();
System.out.println("----------");
}
}
class Movie1
{
public static void main(String arg[])
{

M m1=new M("Abcd2",4.5f,"romantic");
m1.display();
M m2=new M("sardarji",5f,"action");
m2.display();
M m3=new M("hmari adhuri kahani",4.8f,"romantic");
m3.display();
System.out.println(m1.equals(m2));
}
}



