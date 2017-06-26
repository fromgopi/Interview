package com.example.arrays;

import java.util.Random;
import java.util.Scanner;

public class KthLargestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {10,11,4,2,5,9,4,0,1};
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array\n");
		int p = sc.nextInt();
		int a[] = new int [p];
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		KthLargest k = new KthLargest();
		long st = System.currentTimeMillis();
		System.out.println(k.find(a, 10));
		long et = System.currentTimeMillis();
		System.out.println(et-st);
	}

}
