package com.example.sorting;

import java.util.Random;
import java.util.Scanner;

public class MergeArray {

	int[]  merge(int a[], int b[]){
		int c [] = new int [a.length+b.length];
		int k = 0, j = 0;
		for(int i=0;i<c.length;i++){
			if((k < a.length) && (j < b.length)){
				if(b[j] < a[k]){
					c[i] = b[j];
					j++;
				}
				else{
					c[i] = a[k];
					k++;
				}
			}
			else if(j < b.length){
				c[i] = b[j];
				j++;
			}
			else{
				c[i] = a[k];
				k++;
			}
		}
		return c;
	}
	
	/*void sort(a){
		
	}*/
	public static void main(String args[]) {
		//int a[] = {5,9,3,1,2,0};
		//int b[] = {8,9,6,55};
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array A");
		int p = sc.nextInt();
		int a[] = new int[p];		
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		System.out.println("Enter the elements in array B");
		int q = sc.nextInt();
		int b[] = new int [q];
		for(int i=0;i<b.length;i++){
			b[i] = r.nextInt(q);
		}
		MergeArray ma = new MergeArray();
		long st = System.currentTimeMillis();
		int d [] = ma.merge(a, b);
		
		/*for(int i=0;i<d.length;i++){
			System.out.print(d[i] + ",");
		}
		System.out.println();*/
		
		MergeSort ms = new MergeSort();
		//SelectionSort ss = new SelectionSort();
		QSorting qu = new QSorting();
		int low = 0,high = d.length-1;
		int temp[] = new int[d.length];
		ms.mergeSort(d, temp, low, high);
		//qu.sort(d, low, high);
		long et = System.currentTimeMillis();
		
		System.out.println("After sorting..");
		for(int i=0;i<d.length;i++){
			System.out.print(d[i] + ",");
		}
		System.out.println();
		System.out.println("Time take to Merge Array " + (et-st)+"mS");
	}
}

