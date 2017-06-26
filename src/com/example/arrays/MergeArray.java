package com.example.arrays;

public class MergeArray {

	void merge(int[] a, int m, int[] b, int n){
		int i = m - 1, j = n - 1, tar = m + n - 1;
        while (j >= 0) {
            a[tar--] = i >= 0 && a[i] > b[j] ? a[i--] : b[j--];
        }
        printArray(a);
	}

	private void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	
}
