package com.example.arrays;

public class MissingNumber {
	
	int findMissing(int a[]){
		int len = a.length;
		System.out.println(len);
		int sum = (0+len)*(1+len)/2;
		System.out.println(sum);
		for(int i=0;i<len;i++){
			
			sum -= a[i];
		}
		return sum;
	}
}
