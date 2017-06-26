package com.example.arrays;

public class ReverseInPlaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InplaceReverse ir = new InplaceReverse();
		int a[] = {1,5,6,9,7,2,4,10};
		int out[] = ir.reverse(a);
		System.out.println("After reversing..");
		for(int i=0;i<out.length;i++){
			System.out.print(out[i] + ",");
		}
		System.out.println();
	}
}
