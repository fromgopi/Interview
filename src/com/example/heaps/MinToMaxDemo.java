package com.example.heaps;

public class MinToMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
		MinToMax min = new MinToMax();
		min.convert(a);
		System.out.println("Max heap...");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
