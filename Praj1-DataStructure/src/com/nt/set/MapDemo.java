package com.nt.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	  	HashMap<Integer,Integer> map=new HashMap();
	  	map.put(1,152);
	  	map.put(3,155);
	  	map.put(4,157);
	  	map.put(2,151);
	  	map.put(5,192);
	  	map.put(6,165);
	  	map.put(7,17);
	  	map.put(8,171);
	  	
	  	System.out.println(map);
	    System.out.println(map.get(2));
	    //System.out.println(map.replace(3, 157, 400));
	    System.out.println(map);
	     System.out.println(map.keySet());
	     System.out.println(map.values());
	     System.out.println(map.size());
	    
	    
	}

}
