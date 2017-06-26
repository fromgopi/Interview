package com.example.grids;

public class ZeroCount {

	void countZeros(int a[][]){
		int  counter=0;
		System.out.println("The array is ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j] == 1){
					counter++;
				}
				//System.out.print(a[i][j] + " ");
			}
			//System.out.println();
		}
		System.out.println("0's in array " + counter);
	}
}
