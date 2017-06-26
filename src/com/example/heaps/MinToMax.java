package com.example.heaps;

public class MinToMax {

	
	void convert(int a[]){
		int len = a.length;
		for(int i=(len-2)/2;i>=0;--i){
			System.out.println("I " + i);
			maxHeapify(a, i, len);
		}
	}
//
	private void maxHeapify(int[] a, int i, int len) {
		// TODO Auto-generated method stub
		int left = (2*i) + 1;
		int right = (2*i) + 2;
		int largest = i;
		
		if(left < len && a[left] > a[largest]){
			largest = left;
		}
		if(right < len && a[right] > a[largest]){
			largest = right;
		}
		
		if(largest != i){
			int temp = a[largest];
			a[largest] = a[i];
			a[i] = temp;
			System.out.println("Left = " + a[left] + " , i =  " + a[i] + " , Right " + right + " , largest " + largest);
			printArray(a);
			maxHeapify(a, i, largest);
		}
	}

	private void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
}
