package com.example.strings;


public class SubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String T = "ABABABCABABABCABABABCAAAAAAAAAAAAAAAAAB";
		String P = "ACAAB";
		
		SubStringNaive ss = new SubStringNaive();
		int res = ss.check(T, P);
		System.out.println(res);
	}
}
