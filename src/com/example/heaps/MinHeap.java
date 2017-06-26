package com.example.heaps;


public class MinHeap {

	void min(int a[]){
		int len = a.length;
		for(int i=len/2;i>=0;i--){
			minHeapify(a, len, i);
		}
	}

	 void minHeapify(int[] a, int len, int i) {
		// TODO Auto-generated method stub
		int left = (2*i)+1;
		int right = (2*i)+2;
		int smallest = i;
		
		if(left < len && a[left] < a[smallest]){
			smallest = left;
		}
		if(right < len && a[right] < a[smallest]){
			smallest = right;
		}
		
		if(smallest != i){
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
			minHeapify(a, len, smallest);
		}
	}
	
}
