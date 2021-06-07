package com.nt.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
        LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
        s.add(100);
        s.add(102);
        s.add(156);
        s.add(121);
        s.add(165);
        s.add(198);
        s.add(100);
        s.add(120);
        s.add(106);
        s.add(154);
        s.add(12);
        s.add(15);
        s.add(98);
        s.add(10);
        System.out.println(s);
        s.remove(121);
        System.out.println(s);
        System.out.println(s.size());
        s.forEach(i->{
        	System.out.print(i+" ");
        });
        
        s.stream().sorted().forEach(i->{
        	System.out.print(i+" ");
        });
	}
}
