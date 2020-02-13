package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"simran");
		hm.put(1,"rasmeen");
		hm.put(2,"kamal");
		hm.put(3,"manpreet");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
