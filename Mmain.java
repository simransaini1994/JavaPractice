class M implements Runnable
{
public void run()
{
for(int i=0;i<4;i++)
{
try{
Thread.sleep(10000); }
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);

}

}
}class N extends Thread
{
public void run()
{
System.out.println("hello");
}
}
class Mmain
{
public static void main(String a[])
{
M m=new M();
Thread t=new Thread(m);

t.setPriority(1);
t.start();
N n=new N();
n.setPriority(10);
n.start();
}

}



