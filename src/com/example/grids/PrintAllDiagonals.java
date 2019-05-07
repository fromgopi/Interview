package com.example.grids;

public class PrintAllDiagonals {

	void print(int a[][]){
		int row =0;
		int col;
		
		while(row<a.length){
			col = 0;
			int tempRow = row;
			while(tempRow>=0){
				System.out.print(a[tempRow][col] + ",");
				tempRow--;
				col++;
			}
			System.out.println();
			row++;
		}
		
		col = 1;
		while(col<a.length){
			row = a.length-1;
			int tempCol = col;
			while(tempCol<=a.length-1){
				System.out.print(a[row][tempCol] + ",");
				row--;
				tempCol++;
			}
			System.out.println();
			col++;
		}
	}
	
	public static void main(String args[]){
		int [][] a = {
				{1,2,3,10},
				{4,5,6,11},
				{7,8,9,12}
		};
		PrintAllDiagonals p = new PrintAllDiagonals();
		p.print(a);
	}
}


