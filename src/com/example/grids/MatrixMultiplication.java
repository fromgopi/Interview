package com.example.grids;

import java.util.Scanner;

public class MatrixMultiplication {

	int[] mul(int a[], int b[]){
		int val[] = new int[a.length];
		for(int i=0;i<a.length;i++){
			val[i] += a[i]*b[i];
		}
		return val;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the number of rows and columns of first matrix");
	     int m = in.nextInt();
	      int n = in.nextInt();
	 
	      int first[][] = new int[m][n];
	      System.out.println("Enter the elements of first matrix");
	      for (int c = 0 ; c < m ; c++ )
	         for (int d = 0 ; d < n ; d++ )
	            first[c][d] = in.nextInt();
	      
	      System.out.println("Enter the number of rows and columns of second matrix");
	      int p = in.nextInt();
	      int q = in.nextInt();
	      
	      int secound[][] = new int[p][q];
	      System.out.println("Enter the elements of secound matrix");
	 	 
	      for (int c = 0 ; c < p ; c++ )
	         for (int d = 0 ; d < q ; d++ )
	            secound[c][d] = in.nextInt();
	      
	      int a[] = new int[first.length * first[0].length];
	      int b[] = new int[secound.length * secound[0].length];
	      int out[] = new int[a.length];
	      MatrixMultiplication mm = new MatrixMultiplication();
	      mm.mul(a, b);
	      
	      
	}
}
