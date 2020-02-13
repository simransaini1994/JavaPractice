package com.practice;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class GooglePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int cnt=0;
         char [] d;
         StringBuilder sb=null;
		String s="2-gh4j-889-12";
		String[] b=s.split("-");
		for(String c:b)
		{
			d=c.toCharArray();
			for(int i=0;i<d.length;i++){
		     cnt++;
			}
		}
		System.out.println(cnt);
		int k=4;
		int r=cnt%k;
		System.out.println(r);
		System.out.println(sb);
		
	}

}