package com.example.oops;

/*
 * This is the solution for Diamond problem...
*/

public class ClassC extends ClassA implements ClassB{

	public void inClass(){
		System.out.println("inClass C");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj1 = new ClassC();
		obj1.inClass();
	}

	@Override
	public Object getObj() {
		// TODO Auto-generated method stub
		return this.getObj();
	}

}
