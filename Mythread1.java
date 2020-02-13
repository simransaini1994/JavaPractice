package com.practice;

public class Mythread1 implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(i + "thread");
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Mythread1 m1=new Mythread1();
			Thread t= new Thread(m1);
			t.start();

		}

		
	}


