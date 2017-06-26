package com.example.sorting;

public class QSorting {

	void sort(int a[], int low, int high){
		int pivot;
		if(high > low){
			pivot = partition(a,low,high);
			//System.out.println("pivot = " + a[pivot]);
			/*if(low<pivot)
				System.out.println("Low element = " + a[low]);
				sort(a, low, pivot);
			if(pivot<high)
				System.out.println("high element = " + a[high]);
				sort(a, pivot, high);*/
		}
		
	}

	private int partition(int[] a, int low, int high) {
		// TODO
		//Auto-generated method stub
		int left = low;
		int right = high;
		int pivot = a[low];
		while(left<=right){
			while(a[left] < pivot){
				left++;
			}
			while(a[right] > pivot){
				right--;
			}
			//printArray(a);
			if(left<=right){
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
				//System.out.println("Left Pos = " + left + " right Pos = " + right);
			}
			printArray(a);
		}
		//System.out.println("about to recurse");
		if(low<right){
			//System.out.println("Low element = " + a[low]);
			sort(a, low, right);
		}
		if(high>left){
			//System.out.println("High element = " + a[high]);
			sort(a, left, high);
		}
		return right+1;
	}

	private void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ","); 
		}
		System.out.println();
	}
}
