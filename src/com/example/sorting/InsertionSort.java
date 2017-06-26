package com.example.sorting;

public class InsertionSort {

	void sort(int a[]){
		int n = a.length;
		int itCount=0;
		for(int i=0;i<n;i++){/*
			for(int p=0;p<n;p++){
				System.out.print( a[p] + ",");
			}
			System.out.println();*/
			int key = a[i];
			int j = i-1;
			//System.out.println("j = " + j );
			while(j>=0 && key < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			itCount++;
		}
	}
}
