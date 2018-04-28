package com.example.heaps;

public class KthLargest {

	int find(int a[] , int k){
		int len = a.length;
		int minHeap[] = new int[k];		
		for(int i=0;i<k;i++){
			minHeap[i] = a[i];
		}
		buildHeap(minHeap, k);
		/*for(int i=k;i<len;i++){
			if(a[i] > minHeap[0]){
				minHeap[0] = a[i];
				minHeapify(minHeap, k, 0);
			}
		}*/
		return minHeap[0];
	}

	private void buildHeap(int[] minHeap, int k) {
		// TODO Auto-generated method stub
		for(int i=k/2;i>=0;i--){
			buildMinHeap(minHeap, k, i);
		}
	}

	private void buildMinHeap(int[] minHeap, int k, int i) {

		int left = (2*i)+1;
		int right = (2*i)+2;
		System.out.println("left = " + minHeap[left]);
		System.out.println("right = " + minHeap[right]);

	}


}
