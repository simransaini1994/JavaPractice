
import java.io.*;
class File
{
public static void main(String arg[])
{
try{
FileOutputStream fout=new FileOutputStream("t.txt");
String s="i am simranjit singh";
byte b[]=s.getBytes();
fout.write(b);
fout.close();
System.out.println("success");

}
catch(Exception e)
{
System.out.println(e);
}

}


}