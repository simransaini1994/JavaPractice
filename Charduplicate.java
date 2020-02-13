package com.practice;
public class Charduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		String s="simranjit singh";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if (ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					cnt++;
				     break;
				}
			}
		}
		

	}

}