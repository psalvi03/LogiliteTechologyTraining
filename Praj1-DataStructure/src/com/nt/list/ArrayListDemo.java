package com.nt.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		System.out.println(list);
		list=List.of(103, 104, 106, 458, 96, 215, 325, 458, 745, 104, 106, 458, 96, 215, 325, 458, 36,12);
		System.out.println(list.size());
		System.out.println(list);
	   list.stream().sorted().forEach(System.out::println);	
	   System.out.println("==================================");
	   list.forEach(i->{
		   System.out.print(i+"   ");
	   });
	   System.out.println("\n=================================");
	   Iterator<Integer> itr=list.iterator();
	   while(itr.hasNext()) {
		   Integer i=itr.next();
		   if(i%2==0)
			   System.out.println(i);
	   }
	   
	   
	   
	}

}
