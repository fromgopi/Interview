package com.example.heaps;

import java.util.Random;
import java.util.Scanner;

public class KthLargestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//		int a[] = {16,17,18,4,12,9,5,1};
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array\n");
		int p = sc.nextInt();
		int a[] = new int [p];
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		KthLargest kth = new KthLargest();
		long st = System.currentTimeMillis();
		System.out.println("Kth Largest Element is " + kth.find(a, 100));
		long et = System.currentTimeMillis();
		System.out.println(et-st);
	}

}
