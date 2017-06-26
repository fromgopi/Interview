package com.example.sorting;

import java.util.Random;
import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {9,6,3,10,2,1};
		InsertionSort is = new InsertionSort();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//int temp[] = new int[];
		
		System.out.println("Enter the lenght of array\n");
		int p = sc.nextInt();
		int a[] = new int [p];
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		long st = System.currentTimeMillis();
		is.sort(a);
		long et = System.currentTimeMillis();
		System.out.println("Time = " + (et-st));
		/*System.out.println("After sorting..");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();*/
	}

}
