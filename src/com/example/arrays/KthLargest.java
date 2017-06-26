package com.example.arrays;

public class KthLargest {

	int find(int a[], int k){
		int len = a.length;
		
		int p = partition(a, 0, len-1, len-k +1);
		return a[p];
	}

	private int partition(int[] a, int low, int high, int k) {
		// TODO Auto-generated method stub
		int i=low, j=high, pivot = a[high];
//		printArray(a);
//		System.out.println("a["+i+"] = " + a[i] + " pivot = " + pivot + " a["+j+"] = " + a[j]);
		while(i < j){
			if(a[i++] > pivot){
				swap(a, --i, --j);
//				printArray(a);
			}
		}
		swap(a, j, high);
//		printArray(a);
		int m = i - low +1;
		if(m == k){
			return i;
		}
		else if(m > k){
			return partition(a, low, i-1, k);
		}else{
			return partition(a, i+1, high, k-m);
		}
	}

	private void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

	private void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
