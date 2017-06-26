package com.example.sorting;

import java.util.Random;
import java.util.Scanner;

public class QsortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rand Number..");
		int p = sc.nextInt();
		int a[] = new int[p];		
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		QuickSort qs = new QuickSort();
		int low=0, high=a.length-1;
		System.out.println();
		long st = System.currentTimeMillis();
		qs.qSort(a, low, high);
		long et = System.currentTimeMillis();
		System.out.println("Time for sorting.. " + ((et-st))+"Msec ..");
	}

}
