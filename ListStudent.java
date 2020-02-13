package com.practice;

import java.util.ArrayList;

class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return rollno+" "+name+" " +" " +age;
		
	}
}
public class ListStudent {
	
	public static void main(String args[])
	{
	Student s1=new Student(1,"simran",24);
	Student s2=new Student(2,"maninder",24);
	Student s3=new Student(3,"rasmeen",25);
	Student s4=new Student(4,"harman",23);
	
	ArrayList<Student> list=new <Student>ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        for(Student s:list)
        {
        	System.out.println(s);
        }
        
	
	

}
}