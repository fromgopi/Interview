package com.example.sorting;

import java.util.Random;
import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {6,2,5,7,8,3,1,0};
		SelectionSort ss = new SelectionSort();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array\n");
		int p = sc.nextInt();
		int a[] = new int [p];
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		long st = System.currentTimeMillis();
		ss.sort(a);
		long et = System.currentTimeMillis();
		System.out.println(et-st);
		/*System.out.println("After sorting..");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();*/
	}

}
