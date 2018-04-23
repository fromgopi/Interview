package com.example.sorting;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MergeSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		//int temp[] = new int[];
		
		System.out.println("Enter the lenght of array\n");
		int p = sc.nextInt();
		int a[] = new int [p];
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(p);
		}
		int n=a.length;
		int temp[] = new int[n];
		int low=0, high=n-1;
		MergeSort ms = new MergeSort();
		long st = System.currentTimeMillis();
		ms.mergeSort(a, temp, low, high);
		System.out.println("Writing thr output to a file....");
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Merge.txt"));
			for(int i=0;i<n-1;i++) {
				bufferedWriter.write(a[i]);
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long et = System.currentTimeMillis();
		
		System.out.println("Time take to sort and to write to file -> "+ ((et-st))+"MS");
		sc.close();
		/*
		for(int w=0;w<=a.length-1;w++){
			System.out.print(a[w] + ",");
		}

		/*MergeSort ms = new MergeSort();
		int a[] = {38,27,43,3,9,82,10};
		int low=0, high=a.length-1;
		int temp[] = new int [a.length];
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
		ms.mergeSort(a, temp, low, high);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();*/
	}

}
