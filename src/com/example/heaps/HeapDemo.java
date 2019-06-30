package com.example.heaps;
//import com.example.graphs.;
public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h = new Heap(10);
		int a[] = {1,2,3,4,7,8,9,10,14,16};
		h.heapArray = a;
		h.maxHeap(h.heapArray);
		double x = 3.44585;
		System.out.println(Math.round(x));
	}

}
