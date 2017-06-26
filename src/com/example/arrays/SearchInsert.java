package com.example.arrays;

public class SearchInsert {

	int search(int a[], int target){
		int low = 0, high = a.length-1;
		while(low < high){
			int mid = (low+high)/2;
			if(a[mid] < target){
				low = mid + 1;
			}else{
				high = mid;
			}
		}
		return low;
	}
}
