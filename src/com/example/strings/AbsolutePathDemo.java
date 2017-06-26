package com.example.strings;

public class AbsolutePathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsolutePath ab = new AbsolutePath();
		/*int out = ab.abs("C:\n\tgopi.muktev\n\tDownloads\n\t\tfile.ext");*/
		
		int out = ab.abs(123);
		System.out.println(out);
	}

}
