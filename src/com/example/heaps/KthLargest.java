package com.example.heaps;

public class KthLargest {

	int find(int a[] , int k){
		int len = a.length;
		int minHeap[] = new int[k];		
		for(int i=0;i<k;i++){
			minHeap[i] = a[i];
		}
		buildHeap(minHeap, k);
		for(int i=k;i<len;i++){
			if(a[i] > minHeap[0]){
				minHeap[0] = a[i];
				minHeapify(minHeap, k, 0);
			}
		}
		return minHeap[0];
	}

	private void buildHeap(int[] minHeap, int k) {
		// TODO Auto-generated method stub
		for(int i=k/2;i>=0;i--){
			minHeapify(minHeap, k, i);
		}
	}

	private void minHeapify(int[] minHeap, int k, int i) {
		// TODO Auto-generated method stub
		int left = (2*i)+1;
		int right = (2*i)+2;
		int smallest = i;
		if(left < k && minHeap[left] < minHeap[smallest]){
			smallest = left;
		}
		if(right < k && minHeap[right] < minHeap[smallest]){
			smallest = right;
		}
		
		if(smallest != i){
			int temp = minHeap[i];
			minHeap[i] = minHeap[smallest];
			minHeap[smallest] = temp;
			minHeapify(minHeap, k, smallest);
		}
	}
}
