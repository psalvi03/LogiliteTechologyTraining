//Selection Sort for Int

package com.nt.sort;

public class SelectionSort {

	public static void main(String[] args) {

		int a[]= {36,14,25,78,65,45};
		int min,temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
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
