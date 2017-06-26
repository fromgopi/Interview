package com.example.sorting;

import java.util.Random;
import java.util.Scanner;

public class QuickSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {6,2,5,7,6,3,1,0,10,55,30,66,20,88,99,100,70,52,96,35,74,1001,10002,999,8888,198,2000,235,281,301,401,199,382,555,666,1111,200015};
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rand Number..");
		int p = sc.nextInt();
		int a[] = new int[p];		
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		//QuickSort qs = new QuickSort();
		QSorting qs = new QSorting();
		int low=0, high=a.length-1;
		System.out.println();
		long st = System.currentTimeMillis();
		qs.sort(a, low, high);
		//qs.qSort(a, low, high);
		long et = System.currentTimeMillis();
		System.out.println("Time for sorting.. " + ((et-st))+"Msec ..");
		System.out.println("After sorting..");
		/*for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();*/
	}

}
