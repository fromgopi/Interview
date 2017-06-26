package com.example.dynamicprogramming;
/*
 * Fibonacci numbers using dynamic Programming... 
*/
public class Fibonacci {

	int fib(int n){
		int c=0;
		if(n < 0){
			throw new IllegalArgumentException();
		}
		if(n == 0 || n ==1){
			return n;
		}
		else{
			int a=0,b=1;
			c = a+b;
			for(int i=2;i<n;i++){
				System.out.print(c +",");
				c = a+b;
				a = b;
				b = c;
				
			}
			System.out.println();
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
