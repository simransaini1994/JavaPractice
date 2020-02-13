import java.io.*;
class File1
{
public static void main(String arg[])
{
try{
FileInputStream fin=new FileInputStream("t.txt");
int i=0;
while((i=fin.read())!=-1)
{
System.out.print((char)i);

}
fin.close();


}
catch(Exception e)
{
System.out.println(e);
}
}
}
