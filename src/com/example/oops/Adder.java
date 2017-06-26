package com.example.oops;

import java.util.concurrent.Callable;

public class Adder {

	static int add(int a, int b){
		return a+b;
	}
	
	static double add(double a, double b){
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(2d, 4d));
		
	}

}
