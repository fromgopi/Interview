package com.example.arrays;

public class RotateArray {

	static int[] rotate(int a[], int k){
		k %= a.length;
		reverse(a, 0, a.length-1);
		reverse(a, 0, k-1);
		reverse(a, k, a.length-1);
		return a;
	}
	private static void reverse(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,8,10,11,20};
		int out[] = rotate(a, 4);
		System.out.print("{");
		for(int i=0;i<out.length;i++){
			System.out.print(out[i] + ",");
		}
		System.out.println("}");
	}

}
