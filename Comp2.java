package com.practice;

import java.util.Comparator;

class AgeComparator implements Comparator<Student>
	{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			if(o1.age==o2.age)
					return 0;
			else if(o1.age>o2.age)
				return 1;
			else
				return -1;
		}
		
	}
public class Comp2
{
	public static void main(String args[])
	{
		
	}
	}

