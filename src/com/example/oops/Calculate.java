/**
 * 
 */
package com.example.oops;

/**
 * @author fromgopi
 * Demonstrates Method Overloading in Java...
 */
public class Calculate {

	void sum(int a, int b){
		System.out.println("Sum is " + (a+b));
	}
	
	void sum(double a, double b){
		System.out.println("Sum is " + (a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculate cc = new Calculate();
		cc.sum(3.4d, 6.6d);
		cc.sum(4, 6);
		
	}

}
