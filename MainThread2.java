class ThreadDemo implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread"+i);
}
}
} 
class MainThread2
{
public static void main(String ar[])
{
ThreadDemo t=new ThreadDemo();
Thread t1=new Thread(t);//inbuilt class
Thread t2=new Thread(t);
t1.start();
t2.start();
}
}

