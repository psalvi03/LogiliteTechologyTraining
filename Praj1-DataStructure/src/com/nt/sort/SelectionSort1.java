//Selection Sort for String

package com.nt.sort;

public class SelectionSort1 {

	public static void main(String[] args) {

        String a[]= {"deepak","prahlad","aka","madhav"};		
		int min;
		String temp="";
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(	a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println("Sorted array:: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
