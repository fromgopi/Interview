package com.example.sorting;

public class HeapSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort hp = new HeapSort();
		int a[] = {4,1,3,2,16,9,10,14,8,7};
		int size = a.length;
		hp.sort(a);
		System.out.println("Size of the array.... " + size);
		System.out.println("After sorting ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	

}
