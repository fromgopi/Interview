package com.example.oops;
/*
 * Method Overloading is also covered here....
 * Method Overloading means 
 * Methods in same class have same name but differ by its signature...
*/
public class Shape {

	int draw(int len, int b){
		return len*b;
	}
	
	int draw(int rad){
		int x = rad*rad;
		int pi = 2*3;
		return pi*x;
	}
	
}
