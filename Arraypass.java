package com.practice;

import java.util.Arrays;

public class Arraypass {
 static int sum=0;
 static int sum1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] a={2,3,4,5,6};
	 int n=a.length;
	 int[] e=new int[(n+1)/2];
	 int[] b=new int[n-e.length];
	 
	 for(int i=0;i<n;i++)
	 {
		 if(i<e.length)
		 { e[i]=a[i];
		 sum+=e[i];}
		  else
			   {b[i-e.length]=a[i];
		 sum1+=b[i-e.length];}
	}
    System.out.println(Arrays.toString(e));
    System.out.println(Arrays.toString(b));
    System.out.println(sum);
    System.out.println(sum1);
    
}}
