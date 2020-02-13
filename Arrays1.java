package com.practice;

public class Arrays1
{
	public static void main(String args[])
	{
		int a1[]=new int[3];
		a1[0]=2;
		a1[1]=3;
		a1[2]=4;
		int a2[]=new int[3];
		a2[0]=3;
		a2[1]=4;
		a2[2]=5;
	    int c[]=new int[3];
		
		for(int i=0;i<=2;i++)
		{
			c[i]=a1[i]+a2[i];
			System.out.println(c[i]);
		}
		
	}
}

