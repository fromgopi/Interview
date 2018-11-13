package com.example.grids;

import java.util.Random;
import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input;
		int counter=0;
		Random r = new Random();
		int range = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and col..");
		int row = sc.nextInt();
		System.out.println("Enter  col..");
		int col = sc.nextInt();
		input = new int[row][col];
		for(int i=0;i<input.length;i++){
			for(int j=i;j<input.length;j++){
				input[i][j] = r.nextInt(range);
			}
		}
		System.out.println("Input Array");
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input.length;j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}


		/*SetZeros sz = new SetZeros();
		int[][] out = sz.setZeros(input);
		System.out.println("The array is ");
		for(int i=0;i<out.length;i++){
			for(int j=0;j<out.length;j++){
				System.out.print(out[i][j] + " ");
			}
			System.out.println();
		}*/
	}

}
