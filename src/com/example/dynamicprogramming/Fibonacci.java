package com.example.dynamicprogramming;
/*
 * Fibonacci numbers using dynamic Programming... 
*/
public class Fibonacci {

	long fib(int n){
		long c=0;

		long a=0;
		long b=1;

		for(int i=1;i<n;i++){
			c = a+b;
			a = b;
			b = c;
		}

		return c;
	}
	
	int getFib(int n){
		if(n < 0){
			throw new IllegalArgumentException();
		}
		if (n==0 || n==1)
			System.out.println(n);
		return getFib(n-1)+getFib(n-2);
		
	}
	
}
