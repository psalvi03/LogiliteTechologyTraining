//Bubble Sort

package com.ds.sort;

public class BubbleSort {

	public static void main(String[] args) {
	
		int a[]= {36,14,25,78,65,25,45};
		int temp;
		for(int i=0;i<a.length;i++) 
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			
			  if(flag==0) { break; }
			 
		}
		
		System.out.println("Sorted array:: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
