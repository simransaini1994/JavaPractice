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
class Movie
{
public static void main(String arg[])
{
M m1=new M("Abcd2",4.5f,"romantic");
m1.display();
M m2=new M("sardar ji",5f,"action");
m2.display();
M m3=new M("hmari adhuri kahani",4.8f,"romantic");
m3.display();
M m4=m3;
m4.display();
System.out.println(m3.equals(m4));
System.out.println(m1.toString());
}
}



