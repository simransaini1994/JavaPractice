import java.util.ArrayList;
import java.util.Iterator;
class ArraylistDemo
{ 
 public static void main(String arg[])
 {
  ArrayList c=new ArrayList();
  ArrayList c1=new ArrayList();
  c1.add("hi");
  c.add("Hello");
  c.add(0,"hi");
  c.add(10);
  c.add(new Integer(20));
  c.set(2,"punjabi");
  c1.addAll(c);
  System.out.println(c1);
  System.out.println(c);
  Iterator i=c.iterator();
  while(i.hasNext())
  	{
         System.out.println(i.next());
  	}
  }
}

