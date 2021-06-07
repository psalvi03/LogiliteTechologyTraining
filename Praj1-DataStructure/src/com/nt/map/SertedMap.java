package com.nt.map;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SertedMap {

	public static void main(String[] args) {
		SortedMap<Integer,Object> map=new TreeMap<Integer,Object>();
		map.put(1,152);
	  	map.put(3,"A");
	  	map.put(4,"B");
	  	map.put(2,151);
	  	map.put(2,true);
	  	map.put(6,165);
	  	map.put(7,'a');
	  	map.put(8,171.5f);
	  	System.out.println(map);
	  System.out.println(map.tailMap(6));
	  System.out.println(map.headMap(4));
	  System.out.println(map.subMap(2,6));
	  
	  Iterator<Integer> itr=map.keySet().iterator();
	  while(itr.hasNext()) {
		  int key=itr.next();
		  System.out.println(key+"  "+map.get(key));
	  }
		  
	  
	  
	}

}
