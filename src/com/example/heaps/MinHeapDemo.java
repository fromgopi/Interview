package com.example.heaps;

public class MinHeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap minHeap = new MinHeap();
		int a[] = {16,17,18,4,12,9,5,1};
		minHeap.min(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
