package com.example.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionDemo {

	static int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		try {
			FileReader fr = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally Block...");
			i = 100;
		}
		
		
		
		
	}

}
