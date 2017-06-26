package com.example.arrays;

public class PrintSmallest {

	void print(int a[]){
		int first = Integer.MAX_VALUE,secound = Integer.MAX_VALUE;
		int size = a.length;
		if(size < 2){
			System.out.println("Invalid Array size...");
		}
		for(int i=0;i<size;i++){
			if(a[i] < first){
				secound = first;
				first = a[i];
			}
			else if(a[i] < secound && a[i] != first){
				secound = a[i];
			}
		}
		if(secound == Integer.MAX_VALUE){
			System.out.println("There is no 2nd element...");
		}
		else{
			System.out.println("The 1st Smallest Element " + first + " 2nd Smallest " + secound);
		}
	}
}
