package com.practice;

import java.util.Scanner;

public class Addition {
	
	int addition(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Addition a1=new Addition();
		System.out.println(a1.addition(a,b));
	}
	

}
