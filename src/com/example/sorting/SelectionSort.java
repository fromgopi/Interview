package com.example.sorting;

public class SelectionSort {

	void sort(int a[]){
		int i,j;
		int n=a.length;
		for(i=0;i<n-1;i++){
			int min = i;
			for(j=i+1;j<n;j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
}
