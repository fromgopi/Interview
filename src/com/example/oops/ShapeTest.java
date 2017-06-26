package com.example.oops;
/*
 * This is the test Program to show Inheritance works...
 * Parent Class reference will be assigned to child class Object..
*/
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj1 = new Circle();
		int out = obj1.draw(20);
		System.out.println(out);
	}

}