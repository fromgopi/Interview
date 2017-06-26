package com.example.sorting;

public class MergeSort {
	int recCounter=0;
	void mergeSort(int a[], int temp[],int low, int high){
		int mid;
		if(high <= low){
			return;
		}
		else{
			mid = (low+high)/2;
			mergeSort(a, temp, low, mid);	
			mergeSort(a, temp, mid+1, high);
			merge(a,temp,low,mid+1,high);
		}
	}
	private void merge(int[] a, int[] temp, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int size=high-low+1;
		int l=mid-1, t=low;
		while((low <= l) && (mid<=high)){
			if(a[low]<=a[mid]){
				temp[t] = a[low];
				t++;
				low++;
			}else{
				temp[t] = a[mid];
				t++;
				mid++;
			}
		}
		while(low<=l){
			temp[t] = a[low];
			low++;
			t++;
		}
		while(mid <= high){
			temp[t] = a[mid];
			mid++;
			t++;
		}
		for(int i=0;i<size;i++){
			a[high]=temp[high];
			high=high-1;
		}
		
	}	
}

