class A
{
int x;
A(int i)
{
x=i;
System.out.println("in parent class constructor");
}
void display()
{
System.out.println(x);
}
void sum()
{
System.out.println(10+10);
}
}
class B extends A
{
int x;
B()
{
super(100);
x=20;
System.out.println("In child class constructor");
}
 void display()
{
System.out.println(x);
}
void multiply()
{
System.out.println(9*9);
}
}
class Super
{
public static void main(String arg[])
{
 A b1=new B();
b1.display();
b1.sum();
b1.multiply();
}
}
