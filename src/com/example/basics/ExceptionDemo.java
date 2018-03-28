package com.example.basics;


public class ExceptionDemo {

	static int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int b = 2;
		try {
			char ch = 'g';
			System.out.println();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally Block...");
			i = 100;
		}
		
		
		
		
	}

}
