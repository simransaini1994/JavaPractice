package com.practice;

public class MyThread extends Thread {
     public MyThread(String str)
     {
    	 super(str);
     }
     public void run()
     {
    	 for(int i=0;i<10;i++)
    	 {
    		 System.out.print(i+""+ getName()+" ");    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread t1= new MyThread("First");
        t1.start();
	}

}
