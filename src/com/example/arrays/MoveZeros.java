package com.example.arrays;

public class MoveZeros {

	void moveZeros(int a[]){
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i] != 0){
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j++;
			}
		}
	}
}
