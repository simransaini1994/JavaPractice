package com.practice;

public class Outer {

	int out_x=100;
	class inner
	{
		int inner_y=200;
		static final int inner_x=300;
		public void disp_inner()
		{
			System.out.println("Outer class"+out_x);
		}
	}
	public void disp_out(){
		inner i=new inner();
		i.disp_inner();
		System.out.println(i.inner_y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		Outer.inner in=o.new inner();
		in.disp_inner();

	}

}
