package com.nt.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetDemo {

	public static void main(String[] args) {
		Set set= new HashSet();
		set.add(100);
		set.add(200);
		set.add(50);
		set.add(600);
		System.out.println(set);
		//set.add("asd");
		System.out.println(set);
	    //set.add('A');
		System.out.println(set);
		//set.add(true);
		System.out.println(set);
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		System.out.println(set1.addAll(set));
		System.out.println(set1);
		set1.add(100);
		set1.add(200);
		set.add(50);
		System.out.println("1=="+set1);
		System.out.println(set1.stream().max((x,y)->x.compareTo(y)).get());
	
		
		
	}

}
