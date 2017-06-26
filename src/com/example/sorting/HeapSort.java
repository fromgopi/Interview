package com.example.sorting;

public class HeapSort {

	static int count=0;
	void sort(int a[]){
		if(a.length == 0){
			return;
		}
		int size = a.length-1;
		
		for(int i=size/2;i>=0;i--){
			heapify(a, i);
		}
		for(int i=size-1;i>=0;i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a, i);
		}
	}

	private void heapify(int[] a, int i) {
		// TODO Auto-generated method stub
		int left = 2*i+1;
		int right = 2*i+2;
		int largh = i;
		if(left < largh && a[left] > a[largh]){
			largh = left;
		}
		if(right < largh && a[right] > a[largh]){
			largh = right;
		}
		if(largh != i){
			int temp = a[largh];
			a[largh] = a[i];
			a[i] = temp;
			heapify(a, largh);
		}
	}
}
