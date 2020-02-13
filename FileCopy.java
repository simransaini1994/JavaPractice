import java.io.*;
class FileCopy
{
public static void main(String arg[])
{
try
{
FileInputStream f=new FileInputStream("a.txt");
FileOutputStream f1=new FileOutputStream("b.txt");
int c;
while((c=f.read())!=-1)
{
	f1.write(c);
	
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
	