package com.example.arrays;

public class SegregateZerosDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegregateZeros sz = new SegregateZeros();
		int a[] = {0,1,0,1,0,1,0,2,0,2,1,2,1,0};
		int len = a.length;
		int out[] = sz.seg(a, len);
		System.out.println("After Segregating the elements...");
		for(int i=0;i<=len-1;i++){
			System.out.print(out[i] + ",");
		}
		System.out.println();
	}

}
