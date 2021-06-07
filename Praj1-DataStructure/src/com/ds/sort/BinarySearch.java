//Binary search

package com.ds.sort;

public class BinarySearch {

	public static void main(String[] args) {
	   int a[]= {2,5,6,10,15,25,27,30,33,35};	
	  
	   int srch=27;
	   int li=0;
	   int hi=a.length-1;
	   int mi=(li+hi)/2;
	   
	   while(li<=hi) {
		   if(a[mi]==srch) {
			   	System.out.println("element is at "+mi+" index position");
			   	break;
		   }
		   else if(a[mi]<srch) {
			   li=mi+1;
		   }
		   else {
			   hi=mi-1;
		   }
		   mi=(li+hi)/2;
		   
	   }
	   if(li>hi) {
		   System.out.println("element not found");
	   }
	   
	}

}
