package com.practice;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>
{
 int rollno;
 String name;
 int age;
Student1(int rollno,String name,int age)
{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	}
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		return 0;
		else if(age>o.age)
		return 1;
		else
		return -1;
	}
	
	}

public class Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"simran",26);
		Student1 s2=new Student1(2,"rasmeen",23);
		Student1 s3=new Student1(3,"manpreet",25);
		Student1 s4=new Student1(4,"harpreet",27);
		
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);
		for(Student1 e:al)
		{
		System.out.println(e.rollno+" "+e.name+" "+e.age);
		}
		
	}

}
