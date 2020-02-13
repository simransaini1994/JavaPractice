class MyThread1 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread1");
}
}
} 
class MyThread2 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread2");
}
}
}
class MainThread1
{
public static void main(String ar[])
{
MyThread1 t1=new MyThread1();
MyThread2 t2=new MyThread2();
t1.start();
t2.start();
}
}


