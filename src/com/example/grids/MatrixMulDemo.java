package com.example.grids;

import java.util.Scanner;

public class MatrixMulDemo {

	int[][] mul(int a[][], int[][]b){
		int size = a.length;
		int c[][] = new int[size][size];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				c[i][j] = 0;
				for(int k=0;k<a.length;k++){
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, p, q, sum = 0, c, d, k;
		Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix");
	      m = in.nextInt();
	      n = in.nextInt();
	 
	      int first[][] = new int[m][n];
	 
	      System.out.println("Enter the elements of first matrix");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            first[c][d] = in.nextInt();
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      p = in.nextInt();
	      q = in.nextInt();
	      
	      int secound[][] = new int[p][q];
	      System.out.println("Enter the elements of secound matrix");
	 	 
	      for ( c = 0 ; c < p ; c++ )
	         for ( d = 0 ; d < q ; d++ )
	            secound[c][d] = in.nextInt();
	      
	      int[][] out = new int[p][q];
	      if(n != p){
	    	  System.out.println("Matrix Multiplication Not possible");
	    	  
	      }else{
	    	  MatrixMulDemo mm = new MatrixMulDemo();
	    	  out = mm.mul(first, secound);
	      }
	      
	      for(int i=0;i<out.length;i++){
	    	  for(int j=0;j<out.length;j++){
	    		  System.out.print(out[i][j] + ",");
	    	  }
	    	  System.out.println();
	      }
	      
	}

}
