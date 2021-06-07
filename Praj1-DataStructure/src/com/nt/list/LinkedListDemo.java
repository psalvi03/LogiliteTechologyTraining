package com.nt.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> list=new LinkedList<Object>();
		list.addFirst(101);;
		list.add("prahlad");
		list.addLast(103);
		list.addLast("deepak");
		list.add(101);
		
		System.out.println(list);
		System.out.println(list.lastIndexOf(101));
		System.out.println(list.remove());	
		System.out.println(list);
		System.out.println(list.removeLast());
	   System.out.println(list.peek());
	   Iterator<Object> itr=list.iterator();
	   while(itr.hasNext()) {
	        System.out.print(itr.next()+"   ");	 
	   }
	   
	   ListIterator<Object> listItr=list.listIterator();
	   while(listItr.hasNext()) {
		   System.out.print(listItr.next()+"   ");
	   }
	}
}
