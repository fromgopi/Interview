package com.example.arrays;

public class RemoveDuplicates {

	int remove(int a[]){
		int j=0;
		if(a.length == 0){
			return 0;
		}
		for(int i=0;i<a.length;i++){
			if(a[i] != a[j]){
				a[++j] = a[i];
			}
		}
		return ++j;
	}
	
	public static void main(String args[]){
		RemoveDuplicates r = new RemoveDuplicates();
		int a[] = {1,1,2,5,3,3};
		System.out.println("Length of the array before removing = " + a.length);
		int out = r.remove(a);
		System.out.println("Length of array = " + out);
	}
}
