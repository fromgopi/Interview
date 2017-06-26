package com.example.arrays;

public class SegregateZeros {

	int[] seg(int a[], int len){
		int low = 0;
		int high = len-1;
		int mid=0;
		int temp=0;
		while(mid <= high){
			switch (a[mid]) {
			case 0:{
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1:{
				mid++;
				break;
			}

			case 2:{
				temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
				break;
			}
			}
		}
		
		return a;
	}
	
}
