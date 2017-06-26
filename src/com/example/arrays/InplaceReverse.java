package com.example.arrays;

public class InplaceReverse {

	
		
		 int[] reverse(int a[]){
			int i=a.length-1;
			int j=0;
			while(i>j){
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i--;
				j++;
			}
			return a;
		}
	
}

