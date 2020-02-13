import java.io.BufferedReader;
import java.io.IOExpection;
import java.io.InputStreamReader;
class Ab 
{
public static void main(String arg[]) throws IOException
{
try{
System.out.println("enter numbers");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x=Integer.parseInt(br.readLine());
int y=Integer.parseInt(br.readLine());
int i=x/y;
System.out.println(i);
}
catch(Exception e)
{
System.out.println("Exception handled");

}

}

}