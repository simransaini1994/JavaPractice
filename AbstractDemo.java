import java.util.Scanner;
abstract class Figure
{
 double dim1;
 abstract void findArea();
 abstract void findPerimeter(); //methods do not have body just declared so ; used
}
class Circle extends Figure
{
 Circle()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter radius of circle");
  dim1=s.nextDouble();
 }

 void findArea()
 {
   double area=3.14*dim1*dim1;
   System.out.println("Area of circle is:"+area);
 }
 void findPerimeter()
  {
   double p=2*3.14*dim1;
   System.out.println("perimeter is"+p);
  }
public String toString()
  {
    return("circle");
   }
}
 
 class Rectangle extends Figure
{
   double dim2;
   Rectangle()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("enter length and breadth");
     dim1=s.nextDouble();
     dim2=s.nextDouble();
   }
  void findArea()
  {
    double a=dim1*dim2;
     System.out.println("Area of rectangle is:"+a);
  }
  void findPerimeter()
  {
   double p=2*(dim1+dim2);
    System.out.println("perimeter of rectangle is:"+p);
  }
 public String toString()
  {
   return("rectangle");
   }
}
 
class Square extends Figure
{
  Square()
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter side of square");
   dim1=s.nextDouble();
  }

  void findArea()
   {
    double a=dim1*dim1;
     System.out.println("Area of square="+a);
    }
   void findPerimeter()
 {
   double p=4*dim1;
    System.out.println("perimeter of square="+p);
  }
  public String toString()
 {
   return("Square");
  }
}
class Triangle extends Figure
{ 
double dim2;
double dim3;
Triangle()
{
     Scanner s=new Scanner(System.in);
     System.out.println("enter 3 sides of triangle");
     dim1=s.nextDouble();
     dim2=s.nextDouble();
     dim3=s.nextDouble();
 }
void findArea()
{
 double a=1/2*(dim1*dim2);
 System.out.println("area of triangle is"+a);
}   
void findPerimeter()
{
 double p=dim1+dim2+dim3;
 System.out.println("perimeter of Triangle is"+p);
}
}
class AbstractDemo
{
public static void main(String arg[])
{
 int i;
  Circle c[]=new Circle[2];
 for(i=0;i<c.length;i++)
{
 c[i]=new Circle();
 c[i].findArea();
 c[i].findPerimeter();
 }
Rectangle r[]=new Rectangle[2];
 for(i=0;i<r.length;i++)
 {
 r[i]=new Rectangle();
 r[i].findArea();
 r[i].findPerimeter();
 }
Square s[]=new Square[2];
for(i=0;i<s.length;i++)
{
 s[i]=new Square();
 s[i].findArea();
 s[i].findPerimeter();
}
Triangle t[]=new Triangle[2];
for(i=0;i<t.length;i++)
{
 t[i]=new Triangle();
 t[i].findArea(); 
 t[i].findPerimeter();
}
 
}
}






