package com.example.sorting;

public class QuickSort {
	
	void qSort(int a[], int low, int high){
		int mid= (low+high)/2;
		int pivot = a[mid];
		//int pivot = a[low];
		int i=low, j=high, temp;
		/*System.out.println("When QS is called ");
		printArray(a);*/
		while(i<=j){
			while(a[i]<pivot){
				i++;
			}
			while(a[j]>pivot){
				j--;
			}
			if(i <= j){				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
				//printArray(a);
			}
			//System.out.println("i th pos = " + i + " j th pos = " + j);
		}
		if(low< j){
			qSort(a, low, j);
		}
		if(i<high){
			qSort(a, i, high);
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
