package com.example.heaps;

public class MinHeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap minHeap = new MinHeap();
		int a[] = {3,2,1,7,8,4,10,16,12};
		minHeap.min(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
