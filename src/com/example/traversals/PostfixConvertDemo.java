package com.example.traversals;

import java.util.Scanner;

public class PostfixConvertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostfixConvert ps = new PostfixConvert();
		System.out.println("Enter an Infix Expression..");
		Scanner sc = new Scanner(System.in);
		String infix = sc.nextLine();
		//System.out.println(infix);
		String outputString = ps.convert(infix);
		System.out.println(outputString);
		sc.close();
	}

}
