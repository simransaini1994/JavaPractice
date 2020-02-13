
package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList <String>list=new ArrayList<String>();
     list.add("simran");
     list.add("maninder");
     list.add("rasmeen");
     list.add("tarinder");
     Iterator itr=list.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     
	}

}
