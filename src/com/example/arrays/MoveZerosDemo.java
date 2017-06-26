package com.example.arrays;


public class MoveZerosDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,0,5,3,6,7};
		MoveZeros m = new MoveZeros();
		m.moveZeros(a);
		System.out.println("After moving ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
