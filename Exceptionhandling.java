package com.practice;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=5,b=0;
			int divide=a/b;
			System.out.println(divide);
		}
       catch(ArithmeticException e)
		{
    	   System.out.println("Not allowed");
       }
		finally
		{
			System.out.println("last statement");
		}
	}

}
