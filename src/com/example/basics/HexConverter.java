package com.example.basics;

public class HexConverter {

	final static char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	static String convert(int num){
		String res ="";
		while(num != 0){
			res = map[(num & 15)] + res;
			//System.out.println(num & 15);
			num = num >>> 4;
			System.out.println(num);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		System.out.println((n));
	}

	
}
