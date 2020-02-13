class MyThread1 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
} 
class MyThread2 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
}
class MainThread1
{
public static void main(String ar[])
{
MyThread1 t1=new MyThread1();
MyThread2 t2=new MyThread2();
t1.setName("Thread one");
t2.setName("Thread two");
t2.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
}
}

