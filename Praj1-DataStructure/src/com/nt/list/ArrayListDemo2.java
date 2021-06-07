package com.nt.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(102);
	    list.add(103);
	    list.add(105);
	    list.add(105);
	    list.add(106);
		list.add(107);
	    list.add(105);
	    list.add(106);
	    list.add(110);
	    list.add(111);
	    System.out.println(list);
	   System.out.println(list.get(5));
	     
	   list.stream().filter(i->i>104 && i<109).forEach(System.out::println);;
	   System.out.println("====================");
	   System.out.println(list.stream().distinct().collect(Collectors.toList()));
	}

}
