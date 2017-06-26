package com.example.grids;

public class TransposeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3,4},{5,6,6,7}};
		System.out.println("Before Transpose...");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j] + ",");
			}
			System.out.println();
		}
		Transpose t = new Transpose();
		int[][] out  = t.trans(a);
		System.out.println("After Transpose...");
		for(int i=0;i<out.length;i++){
			for(int j=0;j<out.length;j++){
				System.out.print(out[i][j] + ",");
			}
			System.out.println();
		}
	}

}
