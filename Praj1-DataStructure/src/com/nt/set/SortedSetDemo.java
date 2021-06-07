package com.nt.set;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
	   TreeSet<Integer> s=new TreeSet<Integer>(new Comparator() {
	     
		   @Override
	    public int compare(Object o1, Object o2) {
	    	Integer s1=(Integer) o1;
	          Integer s2=(Integer) o2;
			   if(s1<s2)
			   return +1;
	    	else if(s1>s2) {
	    		return -1;
	    	}
	    	else {
	    		return 0;
	    	}
	    }
	   });
	   
		 s.add(100); 
		 s.add(500); 
		 s.add(600);
		 System.out.println(s);
		 TreeSet s1=(TreeSet) s.clone();
		 System.out.println(s1);
		 System.out.println(s.first());
		 System.out.println(s.equals(s1));

	}

}
