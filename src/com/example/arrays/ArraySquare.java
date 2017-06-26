package com.example.arrays;

public class ArraySquare {

	int[] square(int a[]){
		for(int i=0;i<a.length;i++){
			a[i] = (int)Math.pow(a[i], 2);
		}
		return a;
	}
	
	public static void main (String args[]) {
		ArraySquare as = new ArraySquare();
		int [] a = {1,2,4};
		int[] out = as.square(a);
		System.out.println("Squared Array..");
		for(int i=0;i<out.length;i++){
			System.out.println(out[i]);
		}
		System.out.println(Integer.MAX_VALUE);
	}
}
