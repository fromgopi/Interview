package com.example.heaps;

public class Heap {

	static int x;
	int heapArray[];
	int maxSize;
	int heapSize;
	
	Heap(int ms){
		this.maxSize = ms;
		heapSize = 0;
		heapArray = new int[maxSize];
	}
	int getParentIndex(int index){
		return (index-1)/2;
	}
	int getLeftIndex(int index){

		return (2*index) + 1;
	}
	int getRightIndex(int index){
		return (2*index) + 2;
	}
	
	void maxHeap(int a[]){
		display(a);
		for(int i=(int)Math.floor(a.length);i>=0;i--){
			maxHeapify(a, i);
		}
		display(a);
	}
	private void display(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("Heap Array...");
		for(int i=0;i<a.length;i++){
			System.out.print(heapArray[i] + ",");
		}
		System.out.println();
	}
	private void maxHeapify(int[] a, int i) {
		// TODO Auto-generated method stub
		System.out.println("Max Heapify is called.");
		int left = getLeftIndex(i);
		System.out.println("Left Index -> " + left);
		int right = getRightIndex(i);
		System.out.println("Right Index -> " + right);
		int largest = i;
		
		if(left < a.length && a[left] > a[largest]){
			largest = left;
		}
		if(right < a.length && a[right] > a[largest]){
			largest = right;
		}
		if(largest != i){
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxHeapify(a, largest);
		}
		//display(a);
	}
	void display(){
		System.out.println("Heap Array...");
		for(int i=0;i<heapArray.length;i++){
			System.out.print(heapArray[i] + ",");
		}
		System.out.println();
	}
}
