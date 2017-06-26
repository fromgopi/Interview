package com.example.grids;

public class Transpose {

	int[][] trans(int a[][]){
		int temp[][] = new int[a.length][a.length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				temp[j][i] = a[i][j];
			}
		}
		return temp;
	}
}
