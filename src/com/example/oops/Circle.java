package com.example.oops;

public class Circle extends Shape{

	int draw(int r){
		int pi = 3;
		int x = r*r;
		System.out.println("Circle is drawn with Area ");
		return x*pi; 
	}
}
