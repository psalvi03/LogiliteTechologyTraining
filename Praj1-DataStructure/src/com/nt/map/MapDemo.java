package com.nt.map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
	  	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	  	map.put(1,"ad");
	  	map.put(3,"ACD");
	  	map.put(4,"ssdf");
	  	map.put(2,"erf");
	  	map.put(5,"sfcd");
	  	map.put(6,"wer");
	  	map.put(7,"sdfg");
	  	map.put(8,"vfs");
	  	
	  	System.out.println(map);
	    System.out.println(map.get(2));
	    //System.out.println(map.replace(3, 157, 400));
	    System.out.println(map);
	     System.out.println(map.keySet());
	     System.out.println(map.values());
	     System.out.println(map.size());
	   
	    Iterator<Integer> itr=map.keySet().iterator();
	    while(itr.hasNext()) {
	    	int key=itr.next();
	    	System.out.println("key: "+key+" name:"+map.get(key));
	    }
        	    
	}

}
