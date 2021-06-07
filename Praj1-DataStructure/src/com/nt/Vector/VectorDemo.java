package com.nt.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity());
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		System.out.println(v);
		v.add(40);
		System.out.println(v);
		for(int i=1;i<7;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(50);
		System.out.println(v.capacity());
		System.out.println("========================================");
		System.out.println(v.get(5));
		System.out.println(v.contains(78));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.lastIndexOf(5));
		System.out.println("===================================");
		Enumeration<Integer> e=v.elements();
		while (e.hasMoreElements()) {
			Integer integer = (Integer) e.nextElement();
		   System.out.println(integer);
		}
		System.out.println("=======================================");
		v.forEach(i->{
			System.out.print(i+" ");
		});
		
		System.out.println("======================================");
		v.stream().sorted().forEach(System.out::println);
		
	}

}
