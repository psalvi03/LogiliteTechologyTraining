//Insertion Sort for int

package com.nt.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {36,14,25,78,65,45};
		
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		
		System.out.println("Sorted Array::");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	int a[]= {36,14,25,78,65,45};
			

}
