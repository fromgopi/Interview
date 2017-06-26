package com.example.arrays;

import java.util.Random;
import java.util.Scanner;

public class PrintSmallestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {12,14,8,9,10,1,22,65};
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of array\n");
		int p = sc.nextInt();
		int a[] = new int [p];
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		
		PrintSmallest pa = new PrintSmallest();
		long st = System.currentTimeMillis();
		pa.print(a);
		long et = System.currentTimeMillis();
		System.out.println(et-st);
	}
}
