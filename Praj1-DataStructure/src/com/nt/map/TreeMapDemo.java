package com.nt.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put(1,152);
	  	map.put(3,"A");
	  	map.put(4,"B");
	  	map.put(2,151);
	  	map.put(2,true);
	  	map.put(6,165);
	  	map.put(7,'a');
	  	map.put(8,171.5f);
		System.out.println(map);
		
		Map<Integer, Integer>map1= Map.of(1, 101, 2, 65, 4, 458, 3, 68, 5, 48);
		System.out.println(map1);
		
		
		
		map1.forEach((x,y)->{
			System.out.println(x+" "+y);
		});
	}

}
