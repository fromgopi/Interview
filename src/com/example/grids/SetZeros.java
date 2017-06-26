package com.example.grids;

public class SetZeros {

	int[][] setZeros(int a[][]){
		boolean firstRowZero = false;
		boolean firstColZero = false;
		
		for(int i=0;i<a.length;i++){
			if(a[i][0] == 0){
				firstColZero = true;
				break;
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[0][i] == 0){
				firstRowZero = true;
				break;
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j] == 0){
					a[i][0] = 0;
					a[0][j] = 0;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][0] == 0 || a[0][j] == 0){
					a[i][j] = 0;
				}
			}
		}
		
		if(firstColZero){
			for(int i=0;i<a.length;i++){
				a[i][0] = 0;
			}
		}
		if(firstRowZero){
			for(int i=0;i<a.length;i++){
				a[0][i] = 0;
			}
		}
		
		return a;
	}
}
