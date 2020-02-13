package com.practice;

	import java.util.ArrayList;
	import java.util.List;

	public class Duplicate {
	public static void main(String[] args) {
	String s = "hello world";
	char[] chars = s.toCharArray();
	int i,j = 0;
	List finalList = new ArrayList();

	for(i=0;i<chars.length;i++){
	for(j=i+1;j<chars.length;j++){
	if(!finalList.contains(String.valueOf(chars[i])) && chars[i]==chars[j]){
	finalList.add(String.valueOf(chars[i]));
	}
	}
	}

	System.out.println("-- "+finalList);
	}

}
