package com.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RemoveWhitespace {
	void removespace(String s)
	{
		StringTokenizer st= new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
	     RemoveWhitespace rm=new RemoveWhitespace();
	     rm.removespace(s);

	}

}
